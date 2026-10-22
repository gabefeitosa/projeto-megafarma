package br.com.fiap.to;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

public class ClientesTO {
    private Long codigo;
    @NotBlank private String nome;
    @NotBlank @CPF private String cpf;
    @NotBlank @Email private String email;
    @PastOrPresent private LocalDate dataDeNascimento;

    public ClientesTO(){}

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
}
