package com.example.saloneventoproyecto.web;

import com.example.saloneventoproyecto.services.DuenioService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/duenios")
public class DuenioController {

    private DuenioService duenioService;

    public DuenioController(DuenioService duenioService) {
        this.duenioService = duenioService;
    }
}
