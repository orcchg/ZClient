package com.orcchg.zclient.data.model;

import com.google.gson.annotations.SerializedName;

public class FilmActor {

    @SerializedName("actor_id") private int mActorId;
    @SerializedName("film_id") private int mFilmId;
    @SerializedName("last_update") private String mLastUpdate;

    public FilmActor(Builder builder) {
        mActorId = builder.mActorId;
        mFilmId = builder.mFilmId;
        mLastUpdate = builder.mLastUpdate;
    }

    public static class Builder {
        private final int mActorId;
        private int mFilmId;
        private String mLastUpdate;

        public Builder(int actorId) {
            mActorId = actorId;
        }

        public Builder setFilmId(int filmId) {
            mFilmId = filmId;
            return this;
        }

        public Builder setLastUpdate(String lastUpdate) {
            mLastUpdate = lastUpdate;
            return this;
        }

        public FilmActor build() {
            return new FilmActor(this);
        }
    }

    /* Getters */
    // --------------------------------------------------------------------------------------------
    public int getActorId() {
        return mActorId;
    }
    public int getFilmId() {
        return mFilmId;
    }
    public String getLastUpdate() {
        return mLastUpdate;
    }
}
