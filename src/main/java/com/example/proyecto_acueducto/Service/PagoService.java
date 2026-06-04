package com.example.proyecto_acueducto.Service;

import com.example.proyecto_acueducto.Model.Pago;
import com.example.proyecto_acueducto.Model.Factura;
import com.example.proyecto_acueducto.Repository.PagoRepository;
import com.example.proyecto_acueducto.Repository.FacturaRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class PagoService {
    
    private final PagoRepository pagoRepository;
    private final FacturaRepository facturaRepository;

    public PagoService(PagoRepository pagoRepository, FacturaRepository facturaRepository) {
        this.pagoRepository = pagoRepository;
        this.facturaRepository = facturaRepository;
    }

    @Transactional
    public Pago registrar(Pago pago) {
        // 1. Validar que la factura exista
        Factura factura = facturaRepository.findById(pago.getFactura().getId())
                .orElseThrow(() -> new EntityNotFoundException("Factura no encontrada con ID: " + pago.getFactura().getId()));

        // 2. Marcar factura como pagada
        factura.setEstado("PAGADA");
        facturaRepository.save(factura);

        return pagoRepository.save(pago);
    }

    public List<Pago> listarPorFactura(Long facturaId) {
        return pagoRepository.findByFacturaId(facturaId);
    }
}
