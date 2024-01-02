package dev.brunopatrick.compass.exercise6.model;

import dev.brunopatrick.compass.exercise6.exception.ProdutoException;

import java.util.UUID;

public class Produto {
    private String nome;
    private UUID codigo;
    private Double preco;
    private Integer quantidadeEstoque;

    public Produto(String nome, UUID codigo, Double preco, Integer quantidadeEstoque) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public UUID getCodigo() {
        return codigo;
    }

    public void setCodigo(UUID codigo) {
        this.codigo = codigo;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void comprar(Integer quantidade) {
        this.quantidadeEstoque += quantidade;
    }

    public void vender(Integer quantidade) {
        if (quantidade > this.quantidadeEstoque) {
            throw new ProdutoException("Não há estoque suficiente para a venda.");
        }
        this.quantidadeEstoque -= quantidade;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\n" +
                "Código: " + getCodigo() + "\n" +
                "Preço: " + String.format("%.2f", getPreco()) + "\n" +
                "Quantidade em Estoque: " + getQuantidadeEstoque();
    }
}
