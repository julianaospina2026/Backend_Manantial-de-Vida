package com.example.proyecto_acueducto.Model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "facturas")
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "lectura_id", nullable = false)
    private Lectura lectura;

    @Column(name = "fecha_emision", nullable = false)
    private LocalDate fechaEmision;

    @Column(name = "fecha_vencimiento", nullable = false)
    private LocalDate fechaVencimiento;

    @Column(name = "valor_consumo", nullable = false, precision = 12, scale = 2)
    private BigDecimal valorConsumo;

    @Column(name = "cargo_fijo", nullable = false, precision = 12, scale = 2)
    private BigDecimal cargoFijo;

    @Column(name = "otros_cobros", precision = 12, scale = 2)
    private BigDecimal otrosCobros; // Ejemplo: reparaciones o multas

    @Column(name = "total_pagar", nullable = false, precision = 12, scale = 2)
    private BigDecimal totalPagar;

    @Column(nullable = false)
    private String estado; // PENDIENTE, PAGADA, ANULADA

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Lectura getLectura() { return lectura; }
    public void setLectura(Lectura lectura) { this.lectura = lectura; }
    public LocalDate getFechaEmision() { return fechaEmision; }
    public void setFechaEmision(LocalDate fechaEmision) { this.fechaEmision = fechaEmision; }
    public LocalDate getFechaVencimiento() { return fechaVencimiento; }
    public void setFechaVencimiento(LocalDate fechaVencimiento) { this.fechaVencimiento = fechaVencimiento; }
    public BigDecimal getValorConsumo() { return valorConsumo; }
    public void setValorConsumo(BigDecimal valorConsumo) { this.valorConsumo = valorConsumo; }
    public BigDecimal getCargoFijo() { return cargoFijo; }
    public void setCargoFijo(BigDecimal cargoFijo) { this.cargoFijo = cargoFijo; }
    public BigDecimal getOtrosCobros() { return otrosCobros; }
    public void setOtrosCobros(BigDecimal otrosCobros) { this.otrosCobros = otrosCobros; }
    public BigDecimal getTotalPagar() { return totalPagar; }
    public void setTotalPagar(BigDecimal totalPagar) { this.totalPagar = totalPagar; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
    
}
