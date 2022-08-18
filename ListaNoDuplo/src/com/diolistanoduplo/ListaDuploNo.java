package com.diolistanoduplo;

public class ListaDuploNo<T> {

  private NoDuplo<T> primeiroNo;
  private NoDuplo<T> ultimoNo;

  private int tamanhoLista;

  public ListaDuploNo(){
    this.primeiroNo = null;
    this.ultimoNo = null;
    this.tamanhoLista = 0;
  }

  public T get(int index){
    return this.getNo(index).getConteudo();
  }

  public void add(T elemento){
    NoDuplo<T> novoNo = new NoDuplo<>(elemento);
    novoNo.setNoProximo(null);
    novoNo.setNoPrevio(ultimoNo);
    if(primeiroNo == null){
      primeiroNo = novoNo;
    }
    if(ultimoNo != null){
      ultimoNo.setNoProximo(novoNo);
    }
    ultimoNo = novoNo;
    tamanhoLista++;
  }

  public void add(int index, T elemento){
    NoDuplo<T> noAuxiliar = getNo(index);
    NoDuplo<T> novoNo = new NoDuplo<>(elemento);

    if(novoNo.getNoProximo() !=null){
      novoNo.setNoPrevio(noAuxiliar.getNoPrevio());
      novoNo.getNoProximo().setNoPrevio(novoNo);
    }else{
      novoNo.setNoPrevio(ultimoNo);
      ultimoNo = novoNo;
    }

    if (index == 0){
      primeiroNo = novoNo;
    }else{
      novoNo.getNoPrevio().setNoProximo(novoNo);
    }

    tamanhoLista++;
  }


  private NoDuplo<T> getNo(int index){
    NoDuplo<T> noAuxiliar = primeiroNo;

    for(int i = 0; (i < index) && (noAuxiliar != null); i++){
      noAuxiliar = noAuxiliar.getNoProximo();
    }
    return noAuxiliar;
  }


  public int size(){
    return this.tamanhoLista;
  }
}