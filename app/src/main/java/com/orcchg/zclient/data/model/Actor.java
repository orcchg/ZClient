package com.orcchg.zclient.data.model;

import com.google.gson.annotations.SerializedName;

public class Actor {
    
    @SerializedName("actor_id") private int mActorId;
    @SerializedName("first_name") private String mFirstName;
    @SerializedName("last_name") private String mLastName;
    @SerializedName("last_update") private String mLastUpdate;  // TODO: type 'timestamp'
    
    public Actor(Builder builder) {
        mActorId = builder.mActorId;
        mFirstName = builder.mFirstName;
        mLastName = builder.mLastName;
        mLastUpdate = builder.mLastUpdate;
    }
    
    public static class Builder {
        private final int mActorId;
        private String mFirstName;
        private String mLastName;
        private String mLastUpdate;
        
        public Builder(int actorId) {
            mActorId = actorId;
        }

        public Builder setFirstName(String firstName) {
            mFirstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            mLastName = lastName;
            return this;
        }

        public Builder setLastUpdate(String lastUpdate) {
            mLastUpdate = lastUpdate;
            return this;
        }
        
        public Actor build() {
            return new Actor(this);
        }
    }
    
    /* Getters */
    // --------------------------------------------------------------------------------------------
    public int getActorId() {
        return mActorId;
    }
    public String getFirstName() {
        return mFirstName;
    }
    public String getLastName() {
        return mLastName;
    }
    public String getLastUpdate() {
        return mLastUpdate;
    }
}
