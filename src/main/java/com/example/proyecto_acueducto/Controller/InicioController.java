package com.example.proyecto_acueducto.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InicioController {
    
    @GetMapping("/")
    public String inicio() {
        return "Backend Acueducto funcionando 🚰";
    }
}
