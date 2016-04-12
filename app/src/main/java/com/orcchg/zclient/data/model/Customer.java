package com.orcchg.zclient.data.model;

import com.google.gson.annotations.SerializedName;

public class Customer {

    @SerializedName("customer_id") private int mCustomerId;
    @SerializedName("store_id") private int mStoreId;
    @SerializedName("first_name") private String mFirstName;
    @SerializedName("last_name") private String mLastName;
    @SerializedName("email") private String mEmail;
    @SerializedName("address_id") private int mAddressId;
    @SerializedName("activebool") private boolean mIsActive;
    @SerializedName("create_date") private String mCreateDate;
    @SerializedName("last_update") private String mLastUpdate;
    @SerializedName("active") private int mActive;

    public Customer(Builder builder) {
        mCustomerId = builder.mCustomerId;
        mStoreId = builder.mStoreId;
        mFirstName = builder.mFirstName;
        mLastName = builder.mLastName;
        mEmail = builder.mEmail;
        mAddressId = builder.mAddressId;
        mIsActive = builder.mIsActive;
        mCreateDate = builder.mCreateDate;
        mLastUpdate = builder.mLastUpdate;
        mActive = builder.mActive;
    }

    public static class Builder {
        private final int mCustomerId;
        private int mStoreId;
        private String mFirstName;
        private String mLastName;
        private String mEmail;
        private int mAddressId;
        private boolean mIsActive;
        private String mCreateDate;
        private String mLastUpdate;
        private int mActive;

        public Builder(int customerId) {
            mCustomerId = customerId;
        }

        public Builder setStoreId(int storeId) {
            mStoreId = storeId;
            return this;
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

        public Builder setAddressId(int addressId) {
            mAddressId = addressId;
            return this;
        }

        public Builder setIsActive(boolean isActive) {
            mIsActive = isActive;
            return this;
        }

        public Builder setCreateDate(String createDate) {
            mCreateDate = createDate;
            return this;
        }

        public Builder setLastUpdate(String lastUpdate) {
            mLastName = lastUpdate;
            return this;
        }

        public Builder setActive(int active) {
            mActive = active;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }
    }

    /* Getters */
    // --------------------------------------------------------------------------------------------
    public int getCustomerId() {
        return mCustomerId;
    }
    public int getStoreId() {
        return mStoreId;
    }
    public String getFirstName() {
        return mFirstName;
    }
    public String getLastName() {
        return mLastName;
    }
    public String getEmail() {
        return mEmail;
    }
    public int getAddressId() {
        return mAddressId;
    }
    public boolean isIsActive() {
        return mIsActive;
    }
    public String getCreateDate() {
        return mCreateDate;
    }
    public String getLastUpdate() {
        return mLastUpdate;
    }
    public int getActive() {
        return mActive;
    }
}
