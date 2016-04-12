package com.orcchg.zclient.ui.customer;

import com.orcchg.zclient.data.mapper.ViewObject;

public class CustomerVO implements ViewObject {

    private String mFirstName;
    private String mLastName;
    private String mEmail;

    public CustomerVO(Builder builder) {
        mFirstName = builder.mFirstName;
        mLastName = builder.mLastName;
        mEmail = builder.mEmail;
    }

    public static class Builder {
        private String mFirstName;
        private String mLastName;
        private String mEmail;

        public Builder() {
        }

        public Builder setFirstName(String firstName) {
            mFirstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            mLastName = lastName;
            return this;
        }

        public Builder setEmail(String email) {
            mEmail = email;
            return this;
        }

        public CustomerVO build() {
            return new CustomerVO(this);
        }
    }

    /* Getters */
    // --------------------------------------------------------------------------------------------
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
