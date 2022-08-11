package contas;

public class ContaCorrente {

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
}
