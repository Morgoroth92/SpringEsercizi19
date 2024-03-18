package com.example.SpringEsercizi19.Controller;

import com.example.SpringEsercizi19.Services.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {
    @Autowired
    BasicService serviceBase;

    @GetMapping(path = "/")
    public String getAllSituationInProfile(){
        return serviceBase.getProperty();
    }
}

