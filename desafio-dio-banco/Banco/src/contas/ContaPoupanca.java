package contas;

import operacoes.Operacoes;

public class ContaPoupanca implements Operacoes {

  private int agencia;
  private int numeroContaP;

  public int getAgencia() {
    return agencia;
  }

  public int getNumeroContaP() {
    return numeroContaP;
  }

  public void setAgencia(int agencia) {
    this.agencia = agencia;
  }

  public void setNumeroContaP(int numeroContaP) {
    this.numeroContaP = numeroContaP;
  }

  @Override
  public void sacar() {

  }

  @Override
  public void depositar() {

  }

  @Override
  public void checarSaldo() {

  }
}
