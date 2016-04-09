package com.orcchg.zclient.ui.customer;

import com.orcchg.zclient.ui.base.MvpView;

import java.util.List;

public interface CustomerListMvpView extends MvpView {

    void showCustomers(boolean isEmpty);
}
