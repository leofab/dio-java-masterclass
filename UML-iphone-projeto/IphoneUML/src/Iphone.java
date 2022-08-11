public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet {
  @Override
  public void tocar() {
    System.out.println("Tocando musica no Iphone");
  }

  @Override
  public void pausar() {
    System.out.println("Pausando musica no Iphone");

  }

  @Override
  public void selecionarMusica() {
    System.out.println("Selecionando musica no Iphone");

  }

  @Override
  public void ligar() {
    System.out.println("Ligando do Iphone");

  }

  @Override
  public void atender() {
    System.out.println("Atendendo o Iphone");

  }

  @Override
  public void iniciarCorreioVoz() {
    System.out.println("Ouvindo o Correio de voz do Iphone");

  }

  @Override
  public void exibirPagina() {
    System.out.println("Exibindo Página Web no Iphone");
  }

  @Override
  public void adicionarNovaAba() {
    System.out.println("Adicionando Aba de Página Web no Iphone");

  }

  @Override
  public void atualizarPagina() {
    System.out.println("Atualizando Página Web no Iphone");

  }
}
