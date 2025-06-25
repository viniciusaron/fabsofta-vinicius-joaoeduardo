package br.univille.projfabsofttireshop.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Estoque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 100, nullable = false)
    private String fornecedor;

    @Column(length = 1000, nullable = false)
    private String descricao;

    private int quantidadeItensVendidos;
    private int quantidadeItensDisponivel;

    @Temporal(jakarta.persistence.TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dataDaUltimaReposicao;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidadeItensVendidos() {
        return quantidadeItensVendidos;
    }

    public void setQuantidadeItensVendidos(int quantidadeItensVendidos) {
        this.quantidadeItensVendidos = quantidadeItensVendidos;
    }

    public int getQuantidadeItensDisponivel() {
        return quantidadeItensDisponivel;
    }

    public void setQuantidadeItensDisponivel(int quantidadeItensDisponivel) {
        this.quantidadeItensDisponivel = quantidadeItensDisponivel;
    }

    public Date getDataDaUltimaReposicao() {
        return dataDaUltimaReposicao;
    }

    public void setDataDaUltimaReposicao(Date dataDaUltimaReposicao) {
        this.dataDaUltimaReposicao = dataDaUltimaReposicao;
    }
}