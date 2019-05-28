package com.sda.ZooApp;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ZooRepository extends MongoRepository<Animal, String> {
    List<Animal> findAnimalByName(String name);
    List<Animal> findAnimalByNameAndAge(String name,Integer age);
    List<Animal> findAnimalByNameLikeAndCountry(String name, String country);
    List<Animal> findAnimalByNameOrCountryOrHeight(String name,String country, int height);

}
