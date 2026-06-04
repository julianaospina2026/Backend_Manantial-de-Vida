package com.example.proyecto_acueducto.Repository;

import com.example.proyecto_acueducto.Model.Financiacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface FinanciacionRepository extends JpaRepository<Financiacion, Long> {
    // Listar acuerdos de pago o financiaciones de un cliente
    List<Financiacion> findByClienteId(Long clienteId);
}
