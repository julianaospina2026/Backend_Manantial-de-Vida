package com.example.proyecto_acueducto.Service;

import com.example.proyecto_acueducto.Model.Factura;
import com.example.proyecto_acueducto.Repository.FacturaRepository;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ReportesService {
    
    private final FacturaRepository facturaRepository;

    public ReportesService(FacturaRepository facturaRepository) {
        this.facturaRepository = facturaRepository;
    }

    public Map<String, BigDecimal> calcularRecaudoPeriodo(String periodo) {
        List<Factura> facturas = facturaRepository.findByEstado("PAGADA");
        
        // En este ejemplo simple, sumamos las facturas pagadas que coincidan con el periodo de lectura
        BigDecimal total = facturas.stream()
                .filter(f -> f.getLectura().getPeriodo().equals(periodo))
                .map(Factura::getTotalPagar)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        Map<String, BigDecimal> reporte = new HashMap<>();
        reporte.put("totalRecaudado", total);
        return reporte;
    }

    public Long contarClientesConDeuda() {
        return facturaRepository.findByEstado("PENDIENTE").stream()
                .map(f -> f.getLectura().getCliente().getId())
                .distinct().count();
    }
}
