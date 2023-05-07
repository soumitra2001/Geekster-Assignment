package com.geekster.Employee_Address.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer address_id;

    @NotBlank
    @Pattern(regexp = "[a-z][a-z]+")
    private String street;

    @NotBlank
    @Pattern(regexp = "[a-z][a-z]+")
    private String city;

    @NotBlank
    @Pattern(regexp = "[a-z][a-z]+")
    private String state;

    @Size(min = 4,max = 8)
    private Integer pinCode;
}
