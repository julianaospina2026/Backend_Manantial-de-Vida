package com.example.proyecto_acueducto.Controller;

import com.example.proyecto_acueducto.Model.Pago;
import com.example.proyecto_acueducto.Service.PagoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/pagos")
@CrossOrigin(origins = "*")
public class PagoController {
    private final PagoService pagoService;

    public PagoController(PagoService pagoService) {
        this.pagoService = pagoService;
    }

    @PostMapping
    public ResponseEntity<Pago> registrarPago(@RequestBody Pago pago) {
        return new ResponseEntity<>(pagoService.registrar(pago), HttpStatus.CREATED);
    }

    @GetMapping("/factura/{facturaId}")
    public List<Pago> obtenerPagosPorFactura(@PathVariable Long facturaId) {
        return pagoService.listarPorFactura(facturaId);
    }
    
}
