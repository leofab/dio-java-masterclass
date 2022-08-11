package operacoes;

public interface Operacoes {
  void sacar(double valor);
  void depositar(double valor);
  void checarSaldo(int agencia, int conta, double valor);

  void sacar();

  void depositar();

  void checarSaldo();
}
