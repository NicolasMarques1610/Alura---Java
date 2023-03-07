package bytebank.heranca;

public class Gerente extends Funcionario implements Autenticavel {

  private Autenticador aut;

  public Gerente(String nome, String cpf, double salario) {
    super(nome, cpf, salario);
    Autenticador aut = new Autenticador();
  }

  public double getBonificacao() {
    return super.getSalario();
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
