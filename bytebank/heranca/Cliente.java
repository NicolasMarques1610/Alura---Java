package bytebank.heranca;

public class Cliente implements Autenticavel {

  private Autenticador aut;

  public Cliente() {
    Autenticador aut = new Autenticador();
  }

  @Override
  public boolean autentica(int senha) {
    return this.aut.autentica(senha);
  }

  @Override
  public void setSenha(int senha) {
    this.aut.setSenha(senha);
  }

}
