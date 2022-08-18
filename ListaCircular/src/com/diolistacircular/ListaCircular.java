package com.diolistacircular;

public class ListaCircular<T> {
  private No<T> cabeça;
  private No<T> cauda;
  private int tamanhoLista;

  public T get(int index){
    return this.getNo(index).getConteudo();
  }

  private No<T> getNo(int index){
    if(this.isEmpty())
      throw new IndexOutOfBoundsException("A lista está vazia");

    if(index == 0){
      return this.cauda;
    }
    No<T> noAuxiliar = this.cauda;
    for(int i =0; (i < index) && (noAuxiliar != null); i++){
      noAuxiliar = noAuxiliar.getNoProximo();
    }
    return noAuxiliar;
  }


  public boolean isEmpty(){
    return this.tamanhoLista == 0 ?  true : false;
  }



  public int size(){
    return this.tamanhoLista;
  }

}
