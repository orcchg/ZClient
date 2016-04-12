package com.orcchg.zclient.ui.customer;

import com.orcchg.zclient.data.model.Customer;
import com.orcchg.zclient.data.model.CustomerMapperVO;
import com.orcchg.zclient.mock.MockProvider;
import com.orcchg.zclient.ui.base.BasePresenter;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

import rx.Observable;
import rx.Observer;
import rx.functions.Func1;
import timber.log.Timber;

public class CustomerListPresenter extends BasePresenter<CustomerListMvpView> {

    private final List<CustomerVO> mCustomers;
    private final CustomerListAdapter mCustomerAdapter;

    CustomerListPresenter() {
        mCustomers = new ArrayList<>();
        mCustomerAdapter = new CustomerListAdapter(mCustomers);
    }

    CustomerListAdapter getAdapter() {
        return mCustomerAdapter;
    }

    void onFabClick() {
        checkViewAttached();
        getMvpView().showLoading();

        Observable.from(MockProvider.createCustomers()).flatMap(new Func1<Customer, Observable<CustomerVO>>() {
            @Override
            public Observable<CustomerVO> call(Customer customer) {
                CustomerVO viewObject = new CustomerMapperVO().map(customer);
                return Observable.just(viewObject);
            }
        }).subscribe(new Observer<CustomerVO>() {
            @Override
            public void onCompleted() {
                Timber.d("Complete");
                mCustomerAdapter.notifyDataSetChanged();
                checkViewAttached();
                getMvpView().showCustomers(false);
            }

            @Override
            public void onError(Throwable e) {
                getMvpView().showError();
            }

            @Override
            public void onNext(CustomerVO customerVO) {
                Timber.d("Next: " + customerVO.getFirstName());
                mCustomers.add(customerVO);
            }
        });
    }
}
