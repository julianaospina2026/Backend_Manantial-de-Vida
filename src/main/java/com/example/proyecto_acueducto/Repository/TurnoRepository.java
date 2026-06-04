package com.example.proyecto_acueducto.Repository;

import com.example.proyecto_acueducto.Model.Turno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TurnoRepository extends JpaRepository<Turno, Long> {
    // Obtener turnos pendientes para el fontanero
    List<Turno> findByEstado(String estado);
    
    // Ver los turnos programados para un cliente en particular
    List<Turno> findByClienteId(Long clienteId);
}
