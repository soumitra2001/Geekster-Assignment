package com.geekster.Employee_Address.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
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

    @Positive
    private Integer pinCode;

}
