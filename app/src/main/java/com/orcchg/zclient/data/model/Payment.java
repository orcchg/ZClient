package com.orcchg.zclient.data.model;

import com.google.gson.annotations.SerializedName;

public class Payment {

    @SerializedName("payment_id") private int mPaymentId;
    @SerializedName("customer_id") private int mCustomerId;
    @SerializedName("staff_id") private int mStaffId;
    @SerializedName("rental_id") private int mRentalId;
    @SerializedName("amount") private String mAmount;
    @SerializedName("payment_date") private String mPaymentDate;
    
    public Payment(Builder builder) {
        mPaymentId = builder.mPaymentId;
        mCustomerId = builder.mCustomerId;
        mStaffId = builder.mStaffId;
        mRentalId = builder.mRentalId;
        mAmount = builder.mAmount;
        mPaymentDate = builder.mPaymentDate;
    }

    public static class Builder {
        private final int mPaymentId;
        private int mCustomerId;
        private int mStaffId;
        private int mRentalId;
        private String mAmount;
        private String mPaymentDate;
        
        public Builder(int paymentId) {
            mPaymentId = paymentId;
        }

        public Builder setCustomerId(int customerId) {
            mCustomerId = customerId;
            return this;
        }

        public Builder setStaffId(int staffId) {
            mStaffId = staffId;
            return this;
        }

        public Builder setRentalId(int rentalId) {
            mRentalId = rentalId;
            return this;
        }

        public Builder setAmount(String amount) {
            mAmount = amount;
            return this;
        }

        public Builder setPaymentDate(String paymentDate) {
            mPaymentDate = paymentDate;
            return this;
        }
        
        public Payment build() {
            return new Payment(this);
        }
    }

    /* Getters */
    // --------------------------------------------------------------------------------------------
    public int getPaymentId() {
        return mPaymentId;
    }
    public int getCustomerId() {
        return mCustomerId;
    }
    public int getStaffId() {
        return mStaffId;
    }
    public int getRentalId() {
        return mRentalId;
    }
    public String getAmount() {
        return mAmount;
    }
    public String getPaymentDate() {
        return mPaymentDate;
    }
}
