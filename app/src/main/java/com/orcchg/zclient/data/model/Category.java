package com.orcchg.zclient.data.model;

import com.google.gson.annotations.SerializedName;

public class Category {

    @SerializedName("category_id") private int mCategoryId;
    @SerializedName("name") private String mName;
    @SerializedName("last_update") private String mLastUpdate;  // TODO: type 'timestamp'

    public Category(Builder builder) {
        mCategoryId = builder.mCategoryId;
        mName = builder.mName;
        mLastUpdate = builder.mLastUpdate;
    }

    public static class Builder {
        private final int mCategoryId;
        private String mName;
        private String mLastUpdate;

        public Builder(int categoryId) {
            mCategoryId = categoryId;
        }

        public Builder setName(String name) {
            mName = name;
            return this;
        }

        public Builder setLastUpdate(String lastUpdate) {
            mLastUpdate = lastUpdate;
            return this;
        }

        public Category build() {
            return new Category(this);
        }
    }

    /* Getters */
    // --------------------------------------------------------------------------------------------
    public int getCategoryId() {
        return mCategoryId;
    }
    public String getName() {
        return mName;
    }
    public String getLastUpdate() {
        return mLastUpdate;
    }
}
