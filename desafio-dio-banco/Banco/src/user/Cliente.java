package user;

public class Cliente {
  private String nome;
  private String sobrenome;
  private String tipoDeConta;
  private int numeroDaConta;

  public String getNome() {
    return nome;
  }

  public String getSobrenome() {
    return sobrenome;
  }

  public String getTipoDeConta() {
    return tipoDeConta;
  }

  public int getNumeroDaConta() {
    return numeroDaConta;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setSobrenome(String sobrenome) {
    this.sobrenome = sobrenome;
  }

  public void setTipoDeConta(String tipoDeConta) {
    this.tipoDeConta = tipoDeConta;
  }

  public void setNumeroDaConta(int numeroDaConta) {
    this.numeroDaConta = numeroDaConta;
  }
}
