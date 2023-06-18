package com.customer.orders.repository;

import com.customer.orders.entity.ItemsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestsRepository extends JpaRepository<ItemsModel, Long> {

}
