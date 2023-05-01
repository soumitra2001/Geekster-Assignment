package com.geekster.University_Event_Management.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;

    @NotBlank(message = "{validation.firstName.not.Blank}")
    @Pattern(regexp = "^[A-Z][a-z]*$")
    @Size(min = 2, max = 50, message = "{validation.name.Size}")
    private String firstName;

    @NotBlank(message = "{validation.firstName.not.Blank}")
    @Size(min = 2, max = 50, message = "{validation.name.Size}")
    @Pattern(regexp = "^[A-Z][a-z]*$")
    private String lastName;

    @Max(value = 25,message = "{validation.age.Maximum}" )
    @Min(value = 18,message = "{validation.age.Maximum}")
    private int age;

    @Enumerated(EnumType.STRING)
    private Department department;
}
