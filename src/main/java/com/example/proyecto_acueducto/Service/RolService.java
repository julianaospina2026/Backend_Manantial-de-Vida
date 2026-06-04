package com.example.proyecto_acueducto.Service;

import com.example.proyecto_acueducto.Model.Rol;
import com.example.proyecto_acueducto.Repository.RolRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RolService {
    private final RolRepository rolRepository;

    public RolService(RolRepository rolRepository) {
        this.rolRepository = rolRepository;
    }

    public List<Rol> listarTodos() {
        return rolRepository.findAll();
    }
    
}
