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
}
