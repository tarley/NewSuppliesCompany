package br.newtonpaiva.dominio;

import java.util.List;
import java.util.ArrayList;

public class Categoria {
  private String nome;
  private List<Produto> produtos = new ArrayList<>();

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public List<Produto> getProdutos() {
    return produtos;
  }

  public void setProdutos(List<Produto> produtos) {
    this.produtos = produtos;
  }
} 