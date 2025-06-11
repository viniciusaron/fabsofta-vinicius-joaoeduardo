package br.univille.projfabsofttireshop.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Estoque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 100, nullable = false)
    private String fabricante;

    @Column(length = 1000, nullable = false)
    private String descricao;

    private int quantidadeItensVendidos;
    private int quantidadeItensDisponivel;

    @Column(nullable = false)
    private LocalDate dataDaUltimaReposicao;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
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

    public LocalDate getDataDaUltimaReposicao() {
        return dataDaUltimaReposicao;
    }

    public void setDataDaUltimaReposicao(LocalDate dataDaUltimaReposicao) {
        this.dataDaUltimaReposicao = dataDaUltimaReposicao;
    }
}