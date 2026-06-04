package com.example.proyecto_acueducto.Model;

import java.math.BigDecimal;

public class HistorialConsumo {
    private String periodo;
    private BigDecimal consumoM3;
    private BigDecimal valorFacturado;
    private String estadoFactura;

    public HistorialConsumo() {}

    public HistorialConsumo(String periodo, BigDecimal consumoM3, BigDecimal valorFacturado, String estadoFactura) {
        this.periodo = periodo;
        this.consumoM3 = consumoM3;
        this.valorFacturado = valorFacturado;
        this.estadoFactura = estadoFactura;
    }

    public String getPeriodo() { return periodo; }
    public void setPeriodo(String periodo) { this.periodo = periodo; }

    public BigDecimal getConsumoM3() { return consumoM3; }
    public void setConsumoM3(BigDecimal consumoM3) { this.consumoM3 = consumoM3; }

    public BigDecimal getValorFacturado() { return valorFacturado; }
    public void setValorFacturado(BigDecimal valorFacturado) { this.valorFacturado = valorFacturado; }

    public String getEstadoFactura() { return estadoFactura; }
    public void setEstadoFactura(String estadoFactura) { this.estadoFactura = estadoFactura; }
}
