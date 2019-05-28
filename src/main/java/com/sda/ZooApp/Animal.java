package com.sda.ZooApp;


import com.sun.javafx.beans.IDProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection ="animals" )
@Data
@AllArgsConstructor
@Builder
public class Animal{
    @Id
    private String Id;
    private Integer age;
    private String name;
    private String country;
    private int weight;
    private int height;
    private int numberOfLegs;
    private LocalDate birth;


}
