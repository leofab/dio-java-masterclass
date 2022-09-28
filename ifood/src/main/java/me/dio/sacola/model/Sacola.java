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
}
