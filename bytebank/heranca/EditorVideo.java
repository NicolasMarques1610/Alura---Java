package bytebank.heranca;

public class EditorVideo extends Funcionario {

  public EditorVideo(String nome, String cpf, double salario) {
    super(nome, cpf, salario);
  }

  public double getBonificacao() {
    return 200;
  }
}
