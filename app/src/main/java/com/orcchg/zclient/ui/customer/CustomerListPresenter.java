package com.orcchg.zclient.ui.customer;

import android.app.Activity;
import android.os.AsyncTask;

import com.orcchg.zclient.ZClientApplication;
import com.orcchg.zclient.data.DataManager;
import com.orcchg.zclient.data.mapper.CustomerMapperVO;
import com.orcchg.zclient.ui.base.BasePresenter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import rx.Observer;
import timber.log.Timber;

public class CustomerListPresenter extends BasePresenter<CustomerListMvpView> {

    private DataManager mDataManager;

    private final List<CustomerVO> mCustomers;
    private final CustomerListAdapter mCustomerAdapter;

    CustomerListPresenter() {
        mCustomers = new ArrayList<>();
        mCustomerAdapter = new CustomerListAdapter(mCustomers);
    }

    @Override
    public void attachView(CustomerListMvpView mvpView) {
        super.attachView(mvpView);
        mDataManager = ((ZClientApplication) ((Activity) mvpView).getApplication()).getDataManager();
    }

    CustomerListAdapter getAdapter() {
        return mCustomerAdapter;
    }

    void onFabClick() {
        checkViewAttached();
        getMvpView().showLoading();
        final CustomerMapperVO mapper = new CustomerMapperVO();

//        Observable.from(MockProvider.createCustomers()).flatMap(new Func1<Customer, Observable<CustomerVO>>() {
//            @Override
//            public Observable<CustomerVO> call(Customer customer) {
//                CustomerVO viewObject = mapper.map(customer);
//                return Observable.just(viewObject);
//            }
//        }).subscribe(createObserver());

//        mDataManager.getCustomers(20, 5)
////        MockProvider.createCustomersObservable()
//                .flatMap(new Func1<List<Customer>, Observable<Customer>>() {
//                    @Override
//                    public Observable<Customer> call(List<Customer> customers) {
//                        return Observable.from(customers);
//                    }
//                })
//                .map(new Func1<Customer, CustomerVO>() {
//                    @Override
//                    public CustomerVO call(Customer customer) {
//                        CustomerVO viewObject = mapper.map(customer);
//                        return viewObject;
//                    }
//                }).subscribe(createObserver());

        new DirectConnectionTask().execute();
    }

    private Observer<CustomerVO> createObserver() {
        return new Observer<CustomerVO>() {
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
                Timber.d("Next: %s", customerVO.getFirstName());
                mCustomers.add(customerVO);
            }
        };
    }

    private class DirectConnectionTask extends AsyncTask<Void, Void, Void> {
        @Override
        protected Void doInBackground(Void... params) {
            try {
                mDataManager.getDirectClient().connect();
            } catch (IOException e) {
                Timber.e(e.getMessage());
            }
            return null;
        }
    }
}
