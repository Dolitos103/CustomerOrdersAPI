package com.customer.orders.repository;

import com.customer.orders.entity.TransferModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransferRepository extends JpaRepository<TransferModel, Long> {

}
