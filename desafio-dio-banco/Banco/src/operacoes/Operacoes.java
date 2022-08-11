package operacoes;

import contas.Conta;

public interface Operacoes {
  void sacar(double valor);
  void depositar(double valor);
  void tranferir(Conta conta, double valor);
  double extrato();

  void sacar();

  void depositar();

  void checarSaldo();

  void transferir(int agencia, int conta, double valor);

  void transferir(Conta conta, double valor);
}
