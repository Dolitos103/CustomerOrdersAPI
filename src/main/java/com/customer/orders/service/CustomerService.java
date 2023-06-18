package com.customer.orders.service;

import com.customer.orders.entity.ClientModel;
import com.customer.orders.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
 public class CustomerService implements ICustomerService {

    @Autowired
    ClientRepository clientRepository;

    public ClientModel getFinanceTransactionById(Long id){
        return clientRepository.findById(id).orElse(null);
    }

}
