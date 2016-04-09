package com.orcchg.zclient.data.remote;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.orcchg.zclient.data.model.Customer;

import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

public interface RestAdapter {

    String ENDPOINT = "http://194.190.63.180/";

    public static class Creator {
        public static RestAdapter create() {
            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();
            Gson gson = new GsonBuilder()
                    .setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
                    .create();
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(RestAdapter.ENDPOINT)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .client(client)
                    .build();
            return retrofit.create(RestAdapter.class);
        }
    }

    @GET("/customers/")
    Observable<List<Customer>> getCustomers(@Query("path") int limit, @Query("offset") int offset);
}
