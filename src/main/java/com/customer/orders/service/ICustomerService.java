package com.customer.orders.service;

import com.customer.orders.entity.TransferModel;

public interface ICustomerService {

    TransferModel getFinanceTransactionById(Long id);

}
