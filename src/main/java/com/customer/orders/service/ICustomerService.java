package com.customer.orders.service;

import com.customer.orders.entity.ClientModel;

public interface ICustomerService {

    ClientModel getFinanceTransactionById(Long id);

}
