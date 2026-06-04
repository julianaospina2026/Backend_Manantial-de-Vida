package com.example.proyecto_acueducto.Controller;

import com.example.proyecto_acueducto.Model.Factura;
import com.example.proyecto_acueducto.Service.FacturaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/facturas")
@CrossOrigin(origins = "*")
public class FacturaController {
    private final FacturaService facturaService;

    public FacturaController(FacturaService facturaService) {
        this.facturaService = facturaService;
    }

    @GetMapping
    public List<Factura> listar() {
        return facturaService.listarTodas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Factura> obtenerPorId(@PathVariable Long id) {
        return facturaService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/cliente/{clienteId}")
    public List<Factura> listarPorCliente(@PathVariable Long clienteId) {
        return facturaService.listarPorCliente(clienteId);
    }

    @PostMapping("/generar-periodo")
    public ResponseEntity<String> generarFacturasMes(@RequestParam String periodo) {
        facturaService.generarFacturasMasivas(periodo);
        return ResponseEntity.ok("Proceso de facturación iniciado para el periodo: " + periodo);
    }
    
}
