package com.example.proyecto_acueducto.Model;

import java.math.BigDecimal;

public class Reportes {
    private String periodo;
    private BigDecimal totalRecaudado;
    private BigDecimal totalFacturado;
    private Long cantidadClientesMorosos;
    private BigDecimal promedioConsumo;

    public Reportes() {}

    public Reportes(String periodo, BigDecimal totalRecaudado, BigDecimal totalFacturado, Long cantidadClientesMorosos, BigDecimal promedioConsumo) {
        this.periodo = periodo;
        this.totalRecaudado = totalRecaudado;
        this.totalFacturado = totalFacturado;
        this.cantidadClientesMorosos = cantidadClientesMorosos;
        this.promedioConsumo = promedioConsumo;
    }

    public String getPeriodo() { return periodo; }
    public void setPeriodo(String periodo) { this.periodo = periodo; }

    public BigDecimal getTotalRecaudado() { return totalRecaudado; }
    public void setTotalRecaudado(BigDecimal totalRecaudado) { this.totalRecaudado = totalRecaudado; }

    public BigDecimal getTotalFacturado() { return totalFacturado; }
    public void setTotalFacturado(BigDecimal totalFacturado) { this.totalFacturado = totalFacturado; }

    public Long getCantidadClientesMorosos() { return cantidadClientesMorosos; }
    public void setCantidadClientesMorosos(Long cantidadClientesMorosos) { this.cantidadClientesMorosos = cantidadClientesMorosos; }

    public BigDecimal getPromedioConsumo() { return promedioConsumo; }
    public void setPromedioConsumo(BigDecimal promedioConsumo) { this.promedioConsumo = promedioConsumo; }
}
