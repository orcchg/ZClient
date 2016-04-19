package com.orcchg.zclient.data;

import com.orcchg.zclient.data.model.Address;
import com.orcchg.zclient.data.model.Customer;
import com.orcchg.zclient.data.remote.RestAdapter;

import java.util.List;

import rx.Observable;

public class DataManager {

    RestAdapter mRestAdapter;

    public DataManager(RestAdapter adapter) {
        mRestAdapter = adapter;
    }

    public Observable<List<Customer>> getCustomers(int limit, int offset) {
        return mRestAdapter.getCustomers(limit, offset);
    }

    public Observable<Address> getAddress(int addressId) {
        return mRestAdapter.getAddress(addressId);
    }
}
