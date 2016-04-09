package com.orcchg.zclient.ui.customer;

import com.orcchg.zclient.ui.base.BasePresenter;

import java.util.ArrayList;
import java.util.List;

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

    }
}
