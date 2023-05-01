package com.geekster.University_Event_Management.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private int eventId;

    @NotBlank
    @Size(min=1,max = 50)
    private String eventName;

    @NotBlank
    @Size(min = 1, max = 50)
    private String locationOfEvent;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
    private LocalDate date;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern="HH:mm:ss")
    private String startTime;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern="HH:mm:ss")
    private LocalTime endTime;
}
