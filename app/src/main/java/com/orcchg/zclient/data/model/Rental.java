package com.orcchg.zclient.data.model;

import com.google.gson.annotations.SerializedName;

public class Rental {

    @SerializedName("rental_id") private int mRentalId;
    @SerializedName("rental_date") private String mRentalDate;
    @SerializedName("inventory_id") private int mInventoryId;
    @SerializedName("customer_id") private int mCustomerId;
    @SerializedName("return_date") private String mReturnDate;
    @SerializedName("staff_id") private int mStaffId;
    @SerializedName("last_update") private String mLastUpdate;  // TODO: type 'timestamp'
    
    public Rental(Builder builder) {
        mRentalId = builder.mRentalId;
        mRentalDate = builder.mRentalDate;
        mInventoryId = builder.mInventoryId;
        mCustomerId = builder.mCustomerId;
        mReturnDate = builder.mReturnDate;
        mStaffId = builder.mStaffId;
        mLastUpdate = builder.mLastUpdate;
    }

    public static class Builder {
        private final int mRentalId;
        private String mRentalDate;
        private int mInventoryId;
        private int mCustomerId;
        private String mReturnDate;
        private int mStaffId;
        private String mLastUpdate;
        
        public Builder(int rentalId) {
            mRentalId = rentalId;
        }

        public Builder setRentalDate(String rentalDate) {
            mRentalDate = rentalDate;
            return this;
        }

        public Builder setInventoryId(int inventoryId) {
            mInventoryId = inventoryId;
            return this;
        }

        public Builder setCustomerId(int customerId) {
            mCustomerId = customerId;
            return this;
        }

        public Builder setReturnDate(String returnDate) {
            mReturnDate = returnDate;
            return this;
        }

        public Builder setStaffId(int staffId) {
            mStaffId = staffId;
            return this;
        }

        public Builder setLastUpdate(String lastUpdate) {
            mLastUpdate = lastUpdate;
            return this;
        }

        public Rental build() {
            return new Rental(this);
        }
    }

    /* Getters */
    // --------------------------------------------------------------------------------------------
    public int getRentalId() {
        return mRentalId;
    }
    public String getRentalDate() {
        return mRentalDate;
    }
    public int getInventoryId() {
        return mInventoryId;
    }
    public int getCustomerId() {
        return mCustomerId;
    }
    public String getReturnDate() {
        return mReturnDate;
    }
    public int getStaffId() {
        return mStaffId;
    }
    public String getLastUpdate() {
        return mLastUpdate;
    }
}
