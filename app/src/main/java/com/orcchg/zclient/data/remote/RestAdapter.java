package com.orcchg.zclient.data.remote;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.orcchg.zclient.data.model.Address;
import com.orcchg.zclient.data.model.Customer;
import com.orcchg.zclient.data.model.Response;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

public interface RestAdapter {

    String ENDPOINT = "http://" + DirectClient.IP_ADDRESS + ":" + DirectClient.PORT + "/";

    class Creator {
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
    Observable<List<Customer>> getCustomers(@Query("limit") int limit, @Query("offset") int offset);

    @POST("/customer/")
    Observable<Response> newCustomer(@Body Customer customer);

    @GET("/address/")
    Observable<Address> getAddress(@Query("address_id") int addressId);
}
