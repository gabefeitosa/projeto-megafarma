package br.com.fiap.to;

public class ItensVendidos {
    private Long codVenda;
    private Long codRemedio;
    private Integer quantidade;

    public ItensVendidos(){};

    public Long getCodVenda() {
        return codVenda;
    }

    public void setCodVenda(Long codVenda) {
        this.codVenda = codVenda;
    }

    public Long getCodRemedio() {
        return codRemedio;
    }

    public void setCodRemedio(Long codRemedio) {
        this.codRemedio = codRemedio;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
