package com.customer.orders.controller;

import com.customer.orders.entity.ClientModel;
import com.customer.orders.model.RequestTransferModel;
import com.customer.orders.model.ResponseTransferModel;
import com.customer.orders.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CustomerController {

    @Autowired
    ICustomerService customerService;

    @PostMapping("/createFinanceTransaction")
    public ResponseEntity<ResponseTransferModel> createFinanceTransaction(@RequestBody RequestTransferModel requestTransfer) {

        ResponseTransferModel responseTransferModel = new ResponseTransferModel();

        if (responseTransferModel.getResponse().isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(responseTransferModel);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClientModel> getFinanceTransaction(@PathVariable Long id) {

        ClientModel clientModel = customerService.getFinanceTransactionById(id);

        if (ObjectUtils.isEmpty(clientModel)) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(clientModel);
        }
    }

}
