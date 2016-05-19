package com.orcchg.zclient.mock;

import com.orcchg.zclient.data.model.Customer;

import java.util.ArrayList;
import java.util.List;

import rx.Observable;

public class MockProvider {

    public static List<Customer> createCustomers() {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer.Builder(1000).setFirstName("Maxim").setLastName("Alov").setEmail("orcchg@yandex.ru").build());
        customers.add(new Customer.Builder(1001).setFirstName("Oleg").setLastName("Muratov").setEmail("o.muratov@samsung.com").build());
        customers.add(new Customer.Builder(1002).setFirstName("Artem").setLastName("Shamsuarov").setEmail("a.shamsuarov@samsung.com").build());
        customers.add(new Customer.Builder(1003).setFirstName("Vladimir").setLastName("Putin").setEmail("v.putin@kremlin.ru").build());
        customers.add(new Customer.Builder(1004).setFirstName("Denis").setLastName("Kirillov").setEmail("kirillov@wamba.com").build());
        customers.add(new Customer.Builder(1005).setFirstName("Sergey").setLastName("Navasardian").setEmail("sergey.nava@samsung.com").build());
        customers.add(new Customer.Builder(1006).setFirstName("Alexander").setLastName("Rodin").setEmail("rodin@phystech.edu").build());
        customers.add(new Customer.Builder(1007).setFirstName("Jake").setLastName("Wharton").setEmail("jakewharton@gmail.com").build());
        customers.add(new Customer.Builder(1008).setFirstName("Mike").setLastName("Petz").setEmail("mikepetz@gmail.com").build());
        customers.add(new Customer.Builder(1009).setFirstName("Olga").setLastName("Frolova").setEmail("frolova@wamba.com").build());
        customers.add(new Customer.Builder(1010).setFirstName("Marina").setLastName("Beeva").setEmail("beeva@wamba.com").build());
        customers.add(new Customer.Builder(1011).setFirstName("Vladimir").setLastName("Sidorov").setEmail("vladimir@sidorov.com").build());
        customers.add(new Customer.Builder(1012).setFirstName("Michael").setLastName("Rychagov").setEmail("m.rychagov@samsung.com").build());
        customers.add(new Customer.Builder(1013).setFirstName("Jaehyun").setLastName("Kim").setEmail("jhyun.kim@samsung.com").build());
        customers.add(new Customer.Builder(1014).setFirstName("Joshua").setLastName("Cho").setEmail("cho@samsung.com").build());
        customers.add(new Customer.Builder(1015).setFirstName("Jihwan").setLastName("Choi").setEmail("jihwan.choi@samsung.com").build());
        return customers;
    }

    public static Observable<List<Customer>> createCustomersObservable() {
        return Observable.just(createCustomers());
    }
}
