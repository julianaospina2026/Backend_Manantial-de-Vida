package com.example.proyecto_acueducto.Service;

import com.example.proyecto_acueducto.Model.Turno;
import com.example.proyecto_acueducto.Repository.TurnoRepository;
import com.example.proyecto_acueducto.Repository.ClienteRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class TurnoService {
    private final TurnoRepository turnoRepository;
    private final ClienteRepository clienteRepository;

    public TurnoService(TurnoRepository turnoRepository, ClienteRepository clienteRepository) {
        this.turnoRepository = turnoRepository;
        this.clienteRepository = clienteRepository;
    }

    public List<Turno> listarTodos() {
        return turnoRepository.findAll();
    }

    public List<Turno> listarPorEstado(String estado) {
        return turnoRepository.findByEstado(estado);
    }

    public List<Turno> listarPorCliente(Long clienteId) {
        return turnoRepository.findByClienteId(clienteId);
    }

    @Transactional
    public Turno guardar(Turno turno) {
        if (turno.getCliente() == null || turno.getCliente().getId() == null) {
            throw new IllegalArgumentException("El turno debe estar asociado a un cliente válido.");
        }

        // Validación de integridad: El cliente debe existir
        clienteRepository.findById(turno.getCliente().getId())
                .orElseThrow(() -> new EntityNotFoundException("No se puede programar el turno: Cliente no encontrado"));

        if (turno.getEstado() == null) {
            turno.setEstado("PROGRAMADO");
        }
        return turnoRepository.save(turno);
    }

    @Transactional
    public Turno cambiarEstado(Long id, String estado) {
        Turno turno = turnoRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Turno no encontrado con ID: " + id));
        turno.setEstado(estado);
        return turnoRepository.save(turno);
    }

    @Transactional
    public void eliminar(Long id) {
        if (!turnoRepository.existsById(id)) {
            throw new EntityNotFoundException("No se puede eliminar: Turno no encontrado con ID: " + id);
        }
        turnoRepository.deleteById(id);
    }
    
}
