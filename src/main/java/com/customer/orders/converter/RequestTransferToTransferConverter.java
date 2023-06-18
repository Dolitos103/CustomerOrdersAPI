package com.customer.orders.converter;

import com.customer.orders.entity.ClientModel;
import com.customer.orders.model.RequestTransferModel;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
import org.springframework.stereotype.Component;

@Component
public class RequestTransferToTransferConverter implements Converter<RequestTransferModel, ClientModel> {

    @Override
    public ClientModel convert(RequestTransferModel requestTransfer) {
        return new ClientModel();
    }

    @Override
    public JavaType getInputType(TypeFactory typeFactory) {
        return null;
    }

    @Override
    public JavaType getOutputType(TypeFactory typeFactory) {
        return null;
    }
}
