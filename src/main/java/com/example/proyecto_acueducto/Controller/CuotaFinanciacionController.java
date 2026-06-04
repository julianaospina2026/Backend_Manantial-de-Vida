package com.example.proyecto_acueducto.Controller;

import com.example.proyecto_acueducto.Model.CuotaFinanciacion;
import com.example.proyecto_acueducto.Service.CuotaFinanciacionService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/cuotas-financiacion")
@CrossOrigin(origins = "*")
public class CuotaFinanciacionController {
    private final CuotaFinanciacionService cuotaFinanciacionService;

    public CuotaFinanciacionController(CuotaFinanciacionService cuotaFinanciacionService) {
        this.cuotaFinanciacionService = cuotaFinanciacionService;
    }

    @GetMapping("/financiacion/{financiacionId}")
    public List<CuotaFinanciacion> listarPorFinanciacion(@PathVariable Long financiacionId) {
        return cuotaFinanciacionService.listarPorFinanciacion(financiacionId);
    }

    @PatchMapping("/{id}/pagar")
    public CuotaFinanciacion marcarComoPagada(@PathVariable Long id) {
        return cuotaFinanciacionService.pagarCuota(id);
    }
    
}
