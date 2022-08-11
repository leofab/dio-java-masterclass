package contas;

import operacoes.Operacoes;

public class Conta implements Operacoes {
  private int agencia;
  private int numeroDaConta;
  private double saldo;

  public Conta(int agencia, int numeroDaConta, double saldo) {
    this.agencia = agencia;
    this.numeroDaConta = numeroDaConta;
    this.saldo = saldo;
  }

  public int getAgencia() {
    return agencia;
  }

  public int getNumeroDaConta() {
    return numeroDaConta;
  }

  public double getSaldo() {
    return saldo;
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
