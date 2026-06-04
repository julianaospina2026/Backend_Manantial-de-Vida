package com.example.proyecto_acueducto.Service;

import com.example.proyecto_acueducto.Model.Medidor;
import com.example.proyecto_acueducto.Repository.MedidorRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class MedidorService {
    
    private final MedidorRepository medidorRepository;

    public MedidorService(MedidorRepository medidorRepository) {
        this.medidorRepository = medidorRepository;
    }

    public List<Medidor> listarTodos() {
        return medidorRepository.findAll();
    }

    public Medidor guardar(Medidor medidor) {
        return medidorRepository.save(medidor);
    }

    public Optional<Medidor> buscarPorSerial(String serial) {
        return medidorRepository.findBySerial(serial);
    }
}
