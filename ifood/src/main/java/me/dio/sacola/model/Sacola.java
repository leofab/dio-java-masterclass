package me.dio.sacola.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import me.dio.sacola.enumeration.FormaPagamento;


import javax.persistence.*;
import java.util.List;

@Entity
public class Sacola {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JsonIgnore
  private Cliente cliente;
  @OneToMany(cascade = CascadeType.ALL)
  private List<Item> itens;
  private Double valorTotal;
  @Enumerated
  private me.dio.sacola.enumeration.FormaPagamento FormaPagamento;
  private boolean fechada;

  public Sacola() {}

  public Sacola(
          Long id,
          Cliente cliente,
          List<Item> itens,
          Double valorTotal,
          me.dio.sacola.enumeration.FormaPagamento formaPagamento,
          boolean fechada) {
    this.id = id;
    this.cliente = cliente;
    this.itens = itens;
    this.valorTotal = valorTotal;
    FormaPagamento = formaPagamento;
    this.fechada = fechada;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public List<Item> getItens() {
    return itens;
  }

  public void setItens(List<Item> itens) {
    this.itens = itens;
  }

  public Double getValorTotal() {
    return valorTotal;
  }

  public void setValorTotal(Double valorTotal) {
    this.valorTotal = valorTotal;
  }

  public me.dio.sacola.enumeration.FormaPagamento getFormaPagamento() {
    return FormaPagamento;
  }

  public void setFormaPagamento(me.dio.sacola.enumeration.FormaPagamento formaPagamento) {
    FormaPagamento = formaPagamento;
  }

  public boolean isFechada() {
    return fechada;
  }

  public void setFechada(boolean fechada) {
    this.fechada = fechada;
  }
}
