package com.sda.ZooApp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@Getter
@AllArgsConstructor
public class CreateAnimalRequest {

    private Integer age;
    private String name;
    private String country;
    private int weight;
    private int height;
    private int numberOfLegs;
   // @JsonDeserialize(using= LocalDateDeserializer.class)
  //  @JsonSerialize(using = LocalDateSerializer.class)
    //private LocalDate birth;
}
