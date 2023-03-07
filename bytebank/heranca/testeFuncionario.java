package bytebank.heranca;

public class testeFuncionario {
  public static void main(String args[]) {
    Funcionario nico = new Gerente("Nicolas", "030.464.560-50", 2500);

    System.out.println(nico.getNome());
    System.out.println(nico.getBonificacao());
  }
}
