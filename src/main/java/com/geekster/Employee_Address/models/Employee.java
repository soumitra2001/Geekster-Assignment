package com.geekster.Employee_Address.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employee_id;

    @NotBlank
    @Pattern(regexp ="[A-Z][a-z]+")
    private String first_name;

    @NotBlank
    @Pattern(regexp ="[A-Z][a-z]+")
    private String last_name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="address_id")
    private Address address;

}
