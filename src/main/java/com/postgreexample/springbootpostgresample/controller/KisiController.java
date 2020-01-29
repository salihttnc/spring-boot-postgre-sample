package com.postgreexample.springbootpostgresample.controller;

import com.postgreexample.springbootpostgresample.entity.Kisi;
import com.postgreexample.springbootpostgresample.repository.KisiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class KisiController {
    @Autowired
    private KisiRepository kisiRepository;

    @GetMapping
    public String ekle(){
        Kisi kisi=new Kisi();
        kisi.setDescription("deneme");
        kisi.setTitle("deneme");
        kisiRepository.save(kisi);
        return "calisti";

    }

}
