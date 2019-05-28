package com.sda.ZooApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class AnimalController {

    private AnimalService animalService;

    @Autowired
    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void createAnimal(@RequestBody @Valid CreateAnimalRequest request) {
        animalService.createAnimal(request);

    }

    @GetMapping("/all")
    public Page<Animal> findAll(@PageableDefault(size = 2) Pageable pageable) {
        return animalService.getAllAnimal(pageable);
    }

    @GetMapping("/search")
    public List<Animal> findByName(@RequestParam String name) {
        return animalService.findAnimalByName(name);

    }
    @GetMapping("/search1")
    public List<Animal>findByNameAndAge(@RequestParam String name, @RequestParam Integer age){
    return animalService.findAnimalByNameAndAge(name,age);
    }
    @GetMapping("/search2")
    public List<Animal>findByNameLikeAndCountry(@RequestParam String name,@RequestParam String country){
        return animalService.findAnimalByNameLikeAndCountry(name,country);
    }
    @GetMapping("/search3")
    public List<Animal> findAnimalByNameOrCountryOrHeight(@RequestParam String name, @RequestParam String country, @RequestParam int height){
        return animalService.findAnimalByNameOrCountryOrHeight(name,country,height);
    }
}
