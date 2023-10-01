package com.example.saloneventoproyecto.web;

import com.example.saloneventoproyecto.services.ReseniaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/resenias")
public class ReseniaController {

    private ReseniaService reseniaService;

    public ReseniaController(ReseniaService reseniaService) {
        this.reseniaService = reseniaService;
    }
}
