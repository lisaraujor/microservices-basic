package com.microservices.initialservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.microservices.initialservice.model.InitialModel;

@RestController
@RequestMapping("/api/initial")
public class InitialController {
    
    @GetMapping
    public List<InitialModel> getAll(){
        
        // Simulating data rescue from the database
        InitialModel firstModel = new InitialModel();
        firstModel.setId(1);
        firstModel.setEmail("anne.mary@email.com");
        firstModel.setName("Anne Mary");

        InitialModel secondModel = new InitialModel();
        secondModel.setId(2);
        secondModel.setEmail("luy.johnson@email.com");
        secondModel.setName("Luy Johnson");
        
        ArrayList<InitialModel> initialList = new ArrayList<InitialModel>();

        initialList.add(firstModel);
        initialList.add(secondModel);

        return initialList;
    }
}
