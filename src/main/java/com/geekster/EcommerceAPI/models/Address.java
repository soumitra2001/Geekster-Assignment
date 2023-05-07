package com.geekster.EcommerceAPI.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addressId;

    @NotBlank
    @Pattern(regexp = "[A-Za-z\\D0-9]+")
    private String addressName;

    @NotBlank
    private String landmark;

    @NotBlank
    @Pattern(regexp = "[0-9]{10,12}")
    private String addressPhoneNumber;

    @NotBlank
    @Pattern(regexp = "[0-9]+")
    private String pinCode;

    @NotBlank
    private String state;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_userId")
    @JsonIgnore
    private User addressUserId;
}
