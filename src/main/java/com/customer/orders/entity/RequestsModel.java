package com.customer.orders.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "requests")
public class RequestsModel {

    @Column(name = "id_requests")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRequests;

    @Column(name = "id_client")
    private Long idClient;

    @Column(name = "quantity_of_items")
    private String quantityOfItems;

}
