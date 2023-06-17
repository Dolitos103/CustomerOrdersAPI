package com.customer.orders.model;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class RequestTransferModel {

    String originAccount;
    String destinationAccount;
    double value;
    LocalDateTime dateTransfer;
    LocalDateTime dateScheduling;


}
