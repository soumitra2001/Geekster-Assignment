package com.geekster.EcommerceAPI.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;

    @NotBlank
    @Pattern(regexp = "[A-Z][a-z]{1,20}\\D[A-Z][a-z]+")
    private String productName;

    @Positive
    private Integer productPrice;

    @NotBlank
    @Pattern(regexp = "[A-Za-z0-9\\D]+")
        private String productDescription;

    @NotBlank
    @Pattern(regexp = "[A-Za-z]+")
    private String productCategory;

    @Pattern(regexp = "[A-Za-z\\d]+")
    private String productBrand;

}

