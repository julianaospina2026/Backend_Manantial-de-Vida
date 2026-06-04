package com.example.proyecto_acueducto.Model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class HistorialPagos {
    private LocalDateTime fechaPago;
    private BigDecimal monto;
    private String metodoPago;
    private String periodoFactura;

    public HistorialPagos() {}

    public HistorialPagos(LocalDateTime fechaPago, BigDecimal monto, String metodoPago, String periodoFactura) {
        this.fechaPago = fechaPago;
        this.monto = monto;
        this.metodoPago = metodoPago;
        this.periodoFactura = periodoFactura;
    }

    public LocalDateTime getFechaPago() { return fechaPago; }
    public void setFechaPago(LocalDateTime fechaPago) { this.fechaPago = fechaPago; }

    public BigDecimal getMonto() { return monto; }
    public void setMonto(BigDecimal monto) { this.monto = monto; }

    public String getMetodoPago() { return metodoPago; }
    public void setMetodoPago(String metodoPago) { this.metodoPago = metodoPago; }

    public String getPeriodoFactura() { return periodoFactura; }
    public void setPeriodoFactura(String periodoFactura) { this.periodoFactura = periodoFactura; }
}
