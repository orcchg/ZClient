package com.orcchg.zclient.data.model;

import com.google.gson.annotations.SerializedName;

public class Language {

    @SerializedName("language_id") private int mLanguageId;
    @SerializedName("name") private String mName;
    @SerializedName("last_update") private String mLastUpdate;  // TODO: type 'timestamp'

    public Language(Builder builder) {
        mLanguageId = builder.mLanguageId;
        mName = builder.mName;
        mLastUpdate = builder.mLastUpdate;
    }

    public static class Builder {
        private final int mLanguageId;
        private String mName;
        private String mLastUpdate;

        public Builder(int languageId) {
            mLanguageId = languageId;
        }

        public Builder setName(String name) {
            mName = name;
            return this;
        }

        public Builder setLastUpdate(String lastUpdate) {
            mLastUpdate = lastUpdate;
            return this;
        }

        public Language build() {
            return new Language(this);
        }
    }

    /* Getters */
    // --------------------------------------------------------------------------------------------
    public int getLanguageId() {
        return mLanguageId;
    }
    public String getName() {
        return mName;
    }
    public String getLastUpdate() {
        return mLastUpdate;
    }
}
