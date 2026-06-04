package com.example.proyecto_acueducto.Repository;

import com.example.proyecto_acueducto.Model.Factura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface FacturaRepository extends JpaRepository<Factura, Long> {
    // Obtener todas las facturas de un cliente a través de la lectura
    List<Factura> findByLecturaClienteId(Long clienteId);
    
    // Filtrar facturas por estado (PENDIENTE, PAGADA)
    List<Factura> findByEstado(String estado);
}
