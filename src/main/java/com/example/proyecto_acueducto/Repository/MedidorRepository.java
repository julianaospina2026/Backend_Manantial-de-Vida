package com.example.proyecto_acueducto.Repository;

import com.example.proyecto_acueducto.Model.Medidor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface MedidorRepository extends JpaRepository<Medidor, Long> {
    // Buscar medidor por su número de serie único
    Optional<Medidor> findBySerial(String serial);
    
    // Buscar el medidor asignado a un cliente específico
    Optional<Medidor> findByClienteId(Long clienteId);
}
