package com.example.proyecto_acueducto.Service;

import com.example.proyecto_acueducto.Model.Usuario;
import com.example.proyecto_acueducto.Repository.UsuarioRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> listarTodos() {
        return usuarioRepository.findAll();
    }

    public Usuario guardar(Usuario usuario) {
        // Aquí podrías agregar lógica para cifrar la contraseña
        return usuarioRepository.save(usuario);
    }

    public Optional<Usuario> buscarPorUsername(String username) {
        return usuarioRepository.findByUsername(username);
    }

    public Optional<Usuario> autenticarUsuario(String username, String password) {
        return usuarioRepository.findByUsernameAndPassword(username, password);
    }
}
