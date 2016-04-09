package com.orcchg.zclient.ui.customer;

import com.orcchg.zclient.data.mapper.ViewObject;

public class CustomerVO implements ViewObject {

    private String mFirstName;
    private String mLastName;
    private String mEmail;

    public String getFirstName() {
        return mFirstName;
    }

    public String getLastName() {
        return mLastName;
    }

    public String getEmail() {
        return mEmail;
    }
}
