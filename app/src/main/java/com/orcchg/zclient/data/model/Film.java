package com.orcchg.zclient.data.model;

import com.google.gson.annotations.SerializedName;

public class Film {

    @SerializedName("film_id") private int mFilmId;
    @SerializedName("title") private String mTitle;
    @SerializedName("description") private String mDescription;
    @SerializedName("release_year") private int mReleaseYear;
    @SerializedName("language_id") private int mLanguageId;
    @SerializedName("rental_duration") private int mRentalDuration;
    @SerializedName("rental_rate") private String mRentalRate;
    @SerializedName("length") private int mLength;
    @SerializedName("replacement_cost") private String mReplacementCost;
    @SerializedName("rating") private int mRating;
    @SerializedName("last_update") private String mLastUpdate;
    @SerializedName("special_features") private String mSpecialFeatures;
    @SerializedName("fulltext") private String mFullText;
    
    public Film(Builder builder) {
        mFilmId = builder.mFilmId;
        mTitle = builder.mTitle;
        mDescription = builder.mDescription;
        mReleaseYear = builder.mReleaseYear;
        mLanguageId = builder.mLanguageId;
        mRentalDuration = builder.mRentalDuration;
        mRentalRate = builder.mRentalRate;
        mLength = builder.mLength;
        mReplacementCost = builder.mReplacementCost;
        mRating = builder.mRating;
        mLastUpdate = builder.mLastUpdate;
        mSpecialFeatures = builder.mSpecialFeatures;
        mFullText = builder.mFullText;
    }

    public static class Builder {
        private final int mFilmId;
        private String mTitle;
        private String mDescription;
        private int mReleaseYear;
        private int mLanguageId;
        private int mRentalDuration;
        private String mRentalRate;
        private int mLength;
        private String mReplacementCost;
        private int mRating;
        private String mLastUpdate;
        private String mSpecialFeatures;
        private String mFullText;

        public Builder(int filmId) {
            mFilmId = filmId;
        }

        public Builder setTitle(String title) {
            mTitle = title;
            return this;
        }

        public Builder setDescription(String description) {
            mDescription = description;
            return this;
        }

        public Builder setReleaseYear(int year) {
            mReleaseYear = year;
            return this;
        }

        public Builder setLanguageId(int languageId) {
            mLanguageId = languageId;
            return this;
        }

        public Builder setRentalDuration(int rentalDuration) {
            mRentalDuration = rentalDuration;
            return this;
        }

        public Builder setRentalRate(String rentalRate) {
            mRentalRate = rentalRate;
            return this;
        }

        public Builder setLength(int length) {
            mLength = length;
            return this;
        }

        public Builder setReplacementCost(String replacementCost) {
            mReplacementCost = replacementCost;
            return this;
        }

        public Builder setRating(int rating) {
            mRating = rating;
            return this;
        }

        public Builder setLastUpdate(String lastUpdate) {
            mLastUpdate = lastUpdate;
            return this;
        }

        public Builder setSpecialFeatures(String specialFeatures) {
            mSpecialFeatures = specialFeatures;
            return this;
        }

        public Builder setFullText(String fullText) {
            mFullText = fullText;
            return this;
        }

        public Film build() {
            return new Film(this);
        }
    }

    /* Getters */
    // --------------------------------------------------------------------------------------------
    public int getFilmId() {
        return mFilmId;
    }
    public String getTitle() {
        return mTitle;
    }
    public String getDescription() {
        return mDescription;
    }
    public int getReleaseYear() {
        return mReleaseYear;
    }
    public int getLanguageId() {
        return mLanguageId;
    }
    public int getRentalDuration() {
        return mRentalDuration;
    }
    public String getRentalRate() {
        return mRentalRate;
    }
    public int getLength() {
        return mLength;
    }
    public String getReplacementCost() {
        return mReplacementCost;
    }
    public int getRating() {
        return mRating;
    }
    public String getLastUpdate() {
        return mLastUpdate;
    }
    public String getSpecialFeatures() {
        return mSpecialFeatures;
    }
    public String getFullText() {
        return mFullText;
    }
}
