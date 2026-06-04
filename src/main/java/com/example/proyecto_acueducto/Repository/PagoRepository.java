package com.example.proyecto_acueducto.Repository;

import com.example.proyecto_acueducto.Model.Pago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PagoRepository extends JpaRepository<Pago, Long> {
    // Ver pagos aplicados a una factura específica
    List<Pago> findByFacturaId(Long facturaId);
    
    // Ver historial de pagos de un cliente
    List<Pago> findByFacturaLecturaClienteId(Long clienteId);
}
