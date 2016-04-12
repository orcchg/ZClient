package com.orcchg.zclient.data.model;

import com.google.gson.annotations.SerializedName;

public class City {

    @SerializedName("city_id") private int mCityId;
    @SerializedName("city") private String mCity;
    @SerializedName("country_id") private int mCountryId;
    @SerializedName("last_update") private String mLastUpdate;

    public City(Builder builder) {
        mCityId = builder.mCityId;
        mCity = builder.mCity;
        mCountryId = builder.mCountryId;
        mLastUpdate = builder.mLastUpdate;
    }

    public static class Builder {
        private final int mCityId;
        private String mCity;
        private int mCountryId;
        private String mLastUpdate;

        public Builder(int cityId) {
            mCityId = cityId;
        }

        public Builder setCity(String city) {
            mCity = city;
            return this;
        }

        public Builder setCountryId(int countryId) {
            mCountryId = countryId;
            return this;
        }

        public Builder setLastUpdate(String lastUpdate) {
            mLastUpdate = lastUpdate;
            return this;
        }

        public City build() {
            return new City(this);
        }
    }

    /* Getters */
    // --------------------------------------------------------------------------------------------
    public int getCityId() {
        return mCityId;
    }
    public String getCity() {
        return mCity;
    }
    public int getCountryId() {
        return mCountryId;
    }
    public String getLastUpdate() {
        return mLastUpdate;
    }
}
