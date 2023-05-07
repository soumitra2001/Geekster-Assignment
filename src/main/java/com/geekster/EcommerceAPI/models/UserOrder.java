package com.geekster.EcommerceAPI.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;

    @Positive
    private Integer product_quantity;

    @OneToOne
    @JoinColumn(name = "order_userid")
    private User user_id;

    @OneToOne
    @JoinColumn(name = "order_productId")
    private Product product_id;

    @OneToOne
    @JoinColumn(name = "order_address_id")
    private Address address_id;

}
