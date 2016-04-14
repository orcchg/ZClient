package com.orcchg.zclient.data.local.sql;

import android.provider.BaseColumns;

public class DatabaseContract {

    public interface Customer extends BaseColumns {
        final String TABLE_NAME = "customer";
        final String COLUMN_NAME_CUSTOMER_ID = "customer_id";
        final String COLUMN_NAME_STORE_ID = "store_id";
        final String COLUMN_NAME_FIRST_NAME = "first_name";
        final String COLUMN_NAME_LAST_NAME = "last_name";
        final String COLUMN_NAME_EMAIL = "email";
        final String COLUMN_NAME_ADDRESS_ID = "address_id";
        final String COLUMN_NAME_ACTIVEBOOL = "activebool";
        final String COLUMN_NAME_CREATE_DATE = "create_date";
        final String COLUMN_NAME_LAST_UPDATE = "last_update";
        final String COLUMN_NAME_ACTIVE = "active";

        final String SQL_CREATE_TABLE = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME + "(" +
                _ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_NAME_CUSTOMER_ID + " INTEGER, " +
                COLUMN_NAME_STORE_ID + " INTEGER, " +
                COLUMN_NAME_FIRST_NAME + " TEXT, " +
                COLUMN_NAME_LAST_NAME + " TEXT, " +
                COLUMN_NAME_EMAIL + " TEXT, " +
                COLUMN_NAME_ADDRESS_ID + " INTEGER, " +
                COLUMN_NAME_ACTIVEBOOL + " INTEGER, " +
                COLUMN_NAME_CREATE_DATE + " TEXT, " +
                COLUMN_NAME_LAST_UPDATE + " TEXT, " +
                COLUMN_NAME_ACTIVE + " INTEGER);";

        final String SQL_DROP_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME + ";";
    }
}
