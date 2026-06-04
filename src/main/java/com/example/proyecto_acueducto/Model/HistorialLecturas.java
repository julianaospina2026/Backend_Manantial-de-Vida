package com.example.proyecto_acueducto.Model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class HistorialLecturas {
    private LocalDate fechaLectura;
    private String periodo;
    private BigDecimal lecturaAnterior;
    private BigDecimal lecturaActual;
    private BigDecimal consumoM3;

    public HistorialLecturas() {}

    public HistorialLecturas(LocalDate fechaLectura, String periodo, BigDecimal lecturaAnterior, BigDecimal lecturaActual, BigDecimal consumoM3) {
        this.fechaLectura = fechaLectura;
        this.periodo = periodo;
        this.lecturaAnterior = lecturaAnterior;
        this.lecturaActual = lecturaActual;
        this.consumoM3 = consumoM3;
    }

    public LocalDate getFechaLectura() { return fechaLectura; }
    public void setFechaLectura(LocalDate fechaLectura) { this.fechaLectura = fechaLectura; }

    public String getPeriodo() { return periodo; }
    public void setPeriodo(String periodo) { this.periodo = periodo; }

    public BigDecimal getLecturaAnterior() { return lecturaAnterior; }
    public void setLecturaAnterior(BigDecimal lecturaAnterior) { this.lecturaAnterior = lecturaAnterior; }

    public BigDecimal getLecturaActual() { return lecturaActual; }
    public void setLecturaActual(BigDecimal lecturaActual) { this.lecturaActual = lecturaActual; }

    public BigDecimal getConsumoM3() { return consumoM3; }
    public void setConsumoM3(BigDecimal consumoM3) { this.consumoM3 = consumoM3; }
}
