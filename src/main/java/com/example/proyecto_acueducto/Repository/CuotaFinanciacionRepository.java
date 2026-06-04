package com.example.proyecto_acueducto.Repository;

import com.example.proyecto_acueducto.Model.CuotaFinanciacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CuotaFinanciacionRepository extends JpaRepository<CuotaFinanciacion, Long> {
    // Obtener el plan de cuotas de una deuda específica
    List<CuotaFinanciacion> findByFinanciacionId(Long financiacionId);
    
    // Buscar cuotas pendientes para cobrarlas en la factura del mes
    List<CuotaFinanciacion> findByEstado(String estado);
}
