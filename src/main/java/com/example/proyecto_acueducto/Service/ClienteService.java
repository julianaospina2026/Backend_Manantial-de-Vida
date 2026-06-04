package com.example.proyecto_acueducto.Service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.proyecto_acueducto.Model.Cliente;
import com.example.proyecto_acueducto.Repository.ClienteRepository;

import jakarta.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    private final ClienteRepository clientesRepository;

    public ClienteService(ClienteRepository clientesRepository) {
        this.clientesRepository = clientesRepository;
    }

    // ✅ Listar todos los clientes
    public List<Cliente> listarTodos() {
        return clientesRepository.findAll();
    }

    // ✅ Buscar cliente por ID
    public Optional<Cliente> buscarPorId(Long id) {
        return clientesRepository.findById(id);
    }

    // ✅ Buscar por correo
    public Optional<Cliente> buscarPorCorreo(String correo) {
        return clientesRepository.findByCorreo(correo);
    }

    // ✅ Guardar cliente
    @Transactional
    public Cliente guardar(Cliente cliente) {
        return clientesRepository.save(cliente);
    }

    // ✅ Actualizar cliente
    @Transactional
    public Cliente actualizar(Long id, Cliente clienteActualizado) {
        return clientesRepository.findById(id).map(cliente -> {

            cliente.setNombre(clienteActualizado.getNombre());
            cliente.setApellido(clienteActualizado.getApellido());
            cliente.setCodigoCliente(clienteActualizado.getCodigoCliente());
            cliente.setDireccion(clienteActualizado.getDireccion());
            cliente.setTelefono(clienteActualizado.getTelefono());
            cliente.setCorreo(clienteActualizado.getCorreo());
            cliente.setDocumentoIdentidad(clienteActualizado.getDocumentoIdentidad());
            cliente.setLecturaMedidor(clienteActualizado.getLecturaMedidor());
            cliente.setEstado(clienteActualizado.getEstado());
            cliente.setEstrato(clienteActualizado.getEstrato());

            return clientesRepository.save(cliente);

        }).orElseThrow(() -> new EntityNotFoundException("Cliente no encontrado con ID: " + id));
    }

    // ✅ Eliminar cliente
    @Transactional
    public void eliminar(Long id) {
        if (!clientesRepository.existsById(id)) {
            throw new EntityNotFoundException("No se puede eliminar: Cliente no encontrado");
        }
        clientesRepository.deleteById(id);
    }
}
