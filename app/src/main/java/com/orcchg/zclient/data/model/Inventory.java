package com.orcchg.zclient.data.model;

import com.google.gson.annotations.SerializedName;

public class Inventory {

    @SerializedName("inventory_id") private int mInventoryId;
    @SerializedName("film_id") private int mFilmId;
    @SerializedName("store_id") private int mStoreId;
    @SerializedName("last_update") private String mLastUpdate;
    
    public Inventory(Builder builder) {
        mInventoryId = builder.mInventoryId;
        mFilmId = builder.mFilmId;
        mStoreId = builder.mStoreId;
        mLastUpdate = builder.mLastUpdate;
    }

    public static class Builder {
        private final int mInventoryId;
        private int mFilmId;
        private int mStoreId;
        private String mLastUpdate;
        
        public Builder(int inventoryId) {
            mInventoryId = inventoryId;
        }

        public Builder setFilmId(int filmId) {
            mFilmId = filmId;
            return this;
        }

        public Builder setStoreId(int storeId) {
            mStoreId = storeId;
            return this;
        }

        public Builder setLastUpdate(String lastUpdate) {
            mLastUpdate = lastUpdate;
            return this;
        }

        public Inventory build() {
            return new Inventory(this);
        }
    }

    /* Getters */
    // --------------------------------------------------------------------------------------------
    public int getInventoryId() {
        return mInventoryId;
    }
    public int getFilmId() {
        return mFilmId;
    }
    public int getStoreId() {
        return mStoreId;
    }
    public String getLastUpdate() {
        return mLastUpdate;
    }
}
