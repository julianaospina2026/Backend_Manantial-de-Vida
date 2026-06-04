package com.example.proyecto_acueducto.Service;

import com.example.proyecto_acueducto.Model.CuotaFinanciacion;
import com.example.proyecto_acueducto.Repository.CuotaFinanciacionRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class CuotaFinanciacionService {
    private final CuotaFinanciacionRepository cuotaRepository;

    public CuotaFinanciacionService(CuotaFinanciacionRepository cuotaRepository) {
        this.cuotaRepository = cuotaRepository;
    }

    public List<CuotaFinanciacion> listarPorFinanciacion(Long financiacionId) {
        return cuotaRepository.findByFinanciacionId(financiacionId);
    }

    @Transactional
    public CuotaFinanciacion pagarCuota(Long id) {
        CuotaFinanciacion cuota = cuotaRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Cuota no encontrada con ID: " + id));
        cuota.setEstado("PAGADA");
        return cuotaRepository.save(cuota);
    }
    
}
