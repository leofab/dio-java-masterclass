package me.dio.sacola.model;

import javax.persistence.*;
import java.util.List;

public class Restaurante {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String nome;
  @OneToMany(cascade = CascadeType.ALL)
  private List<Produto> cardapio;
  @Embedded
  private Endereco endereco;

}
