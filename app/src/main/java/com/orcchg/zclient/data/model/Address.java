package com.orcchg.zclient.data.model;

import com.google.gson.annotations.SerializedName;

public class Address {

    @SerializedName("address_id") private int mAddressId;
    @SerializedName("address") private String mAddress;
    @SerializedName("address2") private String mAddress2;
    @SerializedName("district") private String mDistrict;
    @SerializedName("city_id") private int mCityId;
    @SerializedName("postal_code") private String mPostalCode;
    @SerializedName("phone") private String mPhone;
    @SerializedName("last_update") private String mLastUpdate;

    public Address(Builder builder) {
        mAddressId = builder.mAddressId;
        mAddress = builder.mAddress;
        mAddress2 = builder.mAddress2;
        mDistrict = builder.mDistrict;
        mCityId = builder.mCityId;
        mPostalCode = builder.mPostalCode;
        mPhone = builder.mPhone;
        mLastUpdate = builder.mLastUpdate;
    }

    public static class Builder {
        private final int mAddressId;
        private String mAddress;
        private String mAddress2;
        private String mDistrict;
        private int mCityId;
        private String mPostalCode;
        private String mPhone;
        private String mLastUpdate;

        public Builder(int addressId) {
            mAddressId = addressId;
        }

        public Builder setAddress(String address) {
            mAddress = address;
            return this;
        }

        public Builder setAddress2(String address2) {
            mAddress2 = address2;
            return this;
        }

        public Builder setDistrict(String district) {
            mDistrict = district;
            return this;
        }

        public Builder setCityId(int cityId) {
            mCityId = cityId;
            return this;
        }

        public Builder setPostalCode(String postalCode) {
            mPostalCode = postalCode;
            return this;
        }

        public Builder setPhone(String phone) {
            mPhone = phone;
            return this;
        }

        public Builder setLastUpdate(String lastUpdate) {
            mLastUpdate = lastUpdate;
            return this;
        }

        public Address build() {
            return new Address(this);
        }
    }

    /* Getters */
    // --------------------------------------------------------------------------------------------
    public int getAddressId() {
        return mAddressId;
    }
    public String getAddress() {
        return mAddress;
    }
    public String getAddress2() {
        return mAddress2;
    }
    public String getDistrict() {
        return mDistrict;
    }
    public int getCityId() {
        return mCityId;
    }
    public String getPostalCode() {
        return mPostalCode;
    }
    public String getPhone() {
        return mPhone;
    }
    public String getLastUpdate() {
        return mLastUpdate;
    }
}
