package com.orcchg.zclient.data.model;

import com.google.gson.annotations.SerializedName;

public class Staff {

    @SerializedName("staff_id") private int mStaffId;
    @SerializedName("store_id") private int mStoreId;
    @SerializedName("first_name") private String mFirstName;
    @SerializedName("last_name") private String mLastName;
    @SerializedName("email") private String mEmail;
    @SerializedName("address_id") private int mAddressId;
    @SerializedName("active") private int mActive;
    @SerializedName("username") private String mUserName;
    @SerializedName("password") private String mPassword;
    @SerializedName("last_update") private String mLastUpdate;  // TODO: type 'timestamp'
    @SerializedName("picture") private String mPicture;  // TODO: type 'bytea'

    public Staff(Builder builder) {
        mStaffId = builder.mStaffId;
        mStoreId = builder.mStoreId;
        mFirstName = builder.mFirstName;
        mLastName = builder.mLastName;
        mEmail = builder.mEmail;
        mAddressId = builder.mAddressId;
        mActive = builder.mActive;
        mUserName = builder.mUserName;
        mPassword = builder.mPassword;
        mLastUpdate = builder.mLastUpdate;
        mPicture = builder.mPicture;
    }

    public static class Builder {
        private final int mStaffId;
        private int mStoreId;
        private String mFirstName;
        private String mLastName;
        private String mEmail;
        private int mAddressId;
        private int mActive;
        private String mUserName;
        private String mPassword;
        private String mLastUpdate;
        private String mPicture;

        public Builder(int staffId) {
            mStaffId = staffId;
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

        public Builder setActive(int active) {
            mActive = active;
            return this;
        }

        public Builder setUserName(String userName) {
            mUserName = userName;
            return this;
        }

        public Builder setPassword(String password) {
            mPassword = password;
            return this;
        }

        public Builder setLastUpdate(String lastUpdate) {
            mLastUpdate = lastUpdate;
            return this;
        }

        public Builder setPicture(String picture) {
            mPicture = picture;
            return this;
        }

        public Staff build() {
            return new Staff(this);
        }
    }
    
    /* Getters */
    // --------------------------------------------------------------------------------------------
    public int getStaffId() {
        return mStaffId;
    }
    public String getFirstName() {
        return mFirstName;
    }
    public String getLastName() {
        return mLastName;
    }
    public int getAddressId() {
        return mAddressId;
    }
    public String getEmail() {
        return mEmail;
    }
    public int getStoreId() {
        return mStoreId;
    }
    public int getActive() {
        return mActive;
    }
    public String getUserName() {
        return mUserName;
    }
    public String getPassword() {
        return mPassword;
    }
    public String getLastUpdate() {
        return mLastUpdate;
    }
    public String getPicture() {
        return mPicture;
    }
}
