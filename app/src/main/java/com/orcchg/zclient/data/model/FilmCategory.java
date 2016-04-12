package com.orcchg.zclient.data.model;

import com.google.gson.annotations.SerializedName;

public class FilmCategory {

    @SerializedName("film_id") private int mFilmId;
    @SerializedName("category_id") private int mCategoryId;
    @SerializedName("last_update") private String mLastUpdate;

    public FilmCategory(Builder builder) {
        mFilmId = builder.mFilmId;
        mCategoryId = builder.mCategoryId;
        mLastUpdate = builder.mLastUpdate;
    }

    public static class Builder {
        private final int mFilmId;
        private final int mCategoryId;
        private String mLastUpdate;

        public Builder(int filmId, int categoryId) {
            mFilmId = filmId;
            mCategoryId = categoryId;
        }

        public Builder setLastUpdate(String lastUpdate) {
            mLastUpdate = lastUpdate;
            return this;
        }

        public FilmCategory build() {
            return new FilmCategory(this);
        }
    }

    /* Getters */
    // --------------------------------------------------------------------------------------------
    public int getFilmId() {
        return mFilmId;
    }
    public int getCategoryId() {
        return mCategoryId;
    }
    public String getLastUpdate() {
        return mLastUpdate;
    }
}
