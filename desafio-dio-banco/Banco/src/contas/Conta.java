package contas;

import operacoes.Operacoes;
import user.Cliente;

public abstract class Conta implements Operacoes {

  protected int AGENCIA_PADRAO = 1;
  protected static int SEQUENCIAL = 1;
  protected int agencia;
  protected int numeroDaConta;
  protected double saldo;

  protected Cliente cliente;



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
  public void sacar(double valor) {

  }

  @Override
  public void depositar(double valor) {

  }

  @Override
  public void tranferir(Conta conta, double valor) {

  }

  @Override
  public double extrato() {
    return 0;
  }
}
