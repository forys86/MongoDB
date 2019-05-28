package com.sda.ZooApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {

    private ZooRepository repository;

    @Autowired
    public AnimalService(ZooRepository repository) {
        this.repository = repository;
    }

    public void createAnimal(CreateAnimalRequest request) {
        Animal animal = Animal.builder()
                .age(request.getAge())
                .country(request.getCountry())
                .name(request.getName())
                .weight(request.getWeight())
                .height(request.getHeight())
                .numberOfLegs((request.getNumberOfLegs()))
                //.birth(request.getBirth())
                .build();
        repository.save(animal);
    }

    public Page<Animal> getAllAnimal(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public List<Animal> findAnimalByName(String name) {
        return repository.findAnimalByName(name);
    }

    public List<Animal> findAnimalByNameAndAge(String name, Integer age) {
        return repository.findAnimalByNameAndAge(name, age);
    }

    public List<Animal> findAnimalByNameLikeAndCountry(String name, String country) {
        return repository.findAnimalByNameLikeAndCountry(name, country);
    }
    public List<Animal> findAnimalByNameOrCountryOrHeight(String name, String country, int height){
        return repository.findAnimalByNameOrCountryOrHeight(name,country,height);
    }
}
