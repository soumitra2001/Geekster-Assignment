package com.geekster.EcommerceAPI.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    @NotBlank
    @Pattern(regexp = "[A-Z][a-z]{1,20}\\D[A-Z][a-z]+")
    private String userName;

    @NotBlank
    @Email
    private String userEmail;

    @Pattern(regexp = "[a-z\\D0-9]+")
    private String userPassword;

    @NotBlank
    @Pattern(regexp = "[0-9]{10,12}")
    private String userPhoneNumber;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "addressUserId")
    private Address userAddress;
}
