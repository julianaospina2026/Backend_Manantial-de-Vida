package com.example.proyecto_acueducto.Controller;

import com.example.proyecto_acueducto.Model.Financiacion;
import com.example.proyecto_acueducto.Service.FinanciacionService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/financiaciones")
@CrossOrigin(origins = "*")
public class FinanciacionController {
    private final FinanciacionService financiacionService;

    public FinanciacionController(FinanciacionService financiacionService) {
        this.financiacionService = financiacionService;
    }

    @PostMapping
    public Financiacion crear(@RequestBody Financiacion financiacion) {
        return financiacionService.crear(financiacion);
    }

    @GetMapping("/cliente/{clienteId}")
    public List<Financiacion> listarPorCliente(@PathVariable Long clienteId) {
        return financiacionService.listarPorCliente(clienteId);
    }
    
}
