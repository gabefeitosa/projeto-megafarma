package br.com.fiap.to;

import java.time.LocalDate;

public class VendasTO {
    private Long codigo;
    private Long codigoCliente;
    private LocalDate dataDaVenda;

    public VendasTO(){}

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Long getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(Long codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public LocalDate getDataDaVenda() {
        return dataDaVenda;
    }

    public void setDataDaVenda(LocalDate dataDaVenda) {
        this.dataDaVenda = dataDaVenda;
    }
}
