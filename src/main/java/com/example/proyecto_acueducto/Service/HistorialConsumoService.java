package com.example.proyecto_acueducto.Service;

import com.example.proyecto_acueducto.Model.Lectura;
import com.example.proyecto_acueducto.Repository.LecturaRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HistorialConsumoService {
    private final LecturaRepository lecturaRepository;

    public HistorialConsumoService(LecturaRepository lecturaRepository) {
        this.lecturaRepository = lecturaRepository;
    }

    public List<Lectura> obtenerPorCliente(Long clienteId) {
        return lecturaRepository.findByClienteId(clienteId, Pageable.unpaged()).getContent();
    }
    
}
