package com.orcchg.zclient.data.model;

import com.google.gson.annotations.SerializedName;

public class Country {

    @SerializedName("country_id") private int mCountryId;
    @SerializedName("country") private String mCountry;
    @SerializedName("last_update") private String mLastUpdate;

    public Country(Builder builder) {
        mCountryId = builder.mCountryId;
        mCountry = builder.mCountry;
        mLastUpdate = builder.mLastUpdate;
    }

    public static class Builder {
        private final int mCountryId;
        private String mCountry;
        private String mLastUpdate;

        public Builder(int countryId) {
            mCountryId = countryId;
        }

        public Builder setCountry(String country) {
            mCountry = country;
            return this;
        }

        public Builder setLastUpdate(String lastUpdate) {
            mLastUpdate = lastUpdate;
            return this;
        }

        public Country build() {
            return new Country(this);
        }
    }

    /* Getters */
    // --------------------------------------------------------------------------------------------
    public int getCountryId() {
        return mCountryId;
    }
    public String getCountry() {
        return mCountry;
    }
    public String getLastUpdate() {
        return mLastUpdate;
    }
}
