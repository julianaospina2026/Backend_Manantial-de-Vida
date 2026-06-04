package com.example.proyecto_acueducto.Model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "medidores")
public class Medidor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String serial;

    private String marca;

    @Column(name = "fecha_instalacion")
    private LocalDate fechaInstalacion;

    private String estado; // NUEVO, USADO, DAÑADO

    @OneToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getSerial() { return serial; }
    public void setSerial(String serial) { this.serial = serial; }
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public LocalDate getFechaInstalacion() { return fechaInstalacion; }
    public void setFechaInstalacion(LocalDate fechaInstalacion) { this.fechaInstalacion = fechaInstalacion; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }
    
}
