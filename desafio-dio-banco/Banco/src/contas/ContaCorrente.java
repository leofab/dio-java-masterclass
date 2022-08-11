package contas;

import operacoes.Operacoes;

public class ContaCorrente implements Operacoes {

  private int agencia;
  private int numeroContaC;
  private double saldo;

  public int getAgencia() {
    return agencia;
  }

  public int getNumeroContaC() {
    return numeroContaC;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setAgencia(int agencia) {
    this.agencia = agencia;
  }

  public void setNumeroContaC(int numeroContaC) {
    this.numeroContaC = numeroContaC;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
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
