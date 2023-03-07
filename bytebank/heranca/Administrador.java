package bytebank.heranca;

public class Administrador extends Funcionario implements Autenticavel {

  private Autenticador aut;

  public Administrador(String nome, String cpf, double salario) {
    super(nome, cpf, salario);
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

  @Override
  public double getBonificacao() {
    return 50;
  }

}
