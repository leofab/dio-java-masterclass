package contas;

import operacoes.Operacoes;

public class ContaCorrente extends Conta {

  public ContaCorrente(){
    super.agencia = AGENCIA_PADRAO;
    super.numeroDaConta = SEQUENCIAL++;
    saldo = 0;
  }

  @Override
  public void tranferir(Conta conta, double valor) {

  }

  @Override
  public double extrato() {
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

  @Override
  public void transferir(int agencia, int conta, double valor) {

  }

  @Override
  public void transferir(Conta conta, double valor) {

  }

}
