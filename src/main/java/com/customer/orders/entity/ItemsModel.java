package com.customer.orders.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "items")
public class ItemsModel {

    @Column(name = "id_items")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idItems;

    @Column(name = "id_requests")
    private Long idRequests;

    @Column(name = "product")
    private String product;

    @Column(name = "amount")
    private String amount;

    @Column(name = "price")
    private String price;

}
