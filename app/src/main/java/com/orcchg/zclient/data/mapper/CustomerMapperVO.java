package com.orcchg.zclient.data.mapper;

import com.orcchg.zclient.data.mapper.Mapper;
import com.orcchg.zclient.data.model.Customer;
import com.orcchg.zclient.ui.customer.CustomerVO;

public class CustomerMapperVO implements Mapper<Customer, CustomerVO> {

    @Override
    public CustomerVO map(Customer customer) {
        return new CustomerVO.Builder()
                .setFirstName(customer.getFirstName())
                .setLastName(customer.getLastName())
                .setEmail(customer.getEmail())
                .build();
    }
}
