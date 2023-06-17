package com.customer.orders.service;

import com.customer.orders.entity.TransferModel;
import com.customer.orders.repository.TransferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
 public class CustomerService implements ICustomerService {

    @Autowired
    TransferRepository transferRepository;

    public TransferModel getFinanceTransactionById(Long id){
        return transferRepository.findById(id).orElse(null);
    }

}
