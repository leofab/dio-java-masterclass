package one.digitalinnovation;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args){

    List<Carro> listaCarros = new ArrayList<>();

    listaCarros.add(new Carro("Ford"));
    listaCarros.add(new Carro("Chevrolet"));
    listaCarros.add(new Carro("Fiat"));

    System.out.println(listaCarros.contains(new Carro("Ford")));

  }
}
