package com.diolistanoduplo;

public class Main {
  public static void main(String[] args){

    ListaDuploNo<String> listaDupla = new ListaDuploNo<>();

    listaDupla.add("c1");
    listaDupla.add("c2");
    listaDupla.add("c3");
    listaDupla.add("c4");
    listaDupla.add("c5");
    listaDupla.add("c6");
    listaDupla.add("c7");

    System.out.println(listaDupla);

    listaDupla.remove(3);
    listaDupla.add(3,"99");

    System.out.println(listaDupla);


  }
}
