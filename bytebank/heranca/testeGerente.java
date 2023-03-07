package bytebank.heranca;

public class testeGerente {
  public static void main(String args[]) {
    Gerente g1 = new Gerente("Marco", "222232323.50", 5000);
    Autenticavel referencia = new Gerente(null, null, 0);
    // Polimorfismo, é um objeto gerente mas o tipo da referência de g2 é
    // funcionario pois todo gerente é um funcionario mas o contrário não é
    // verdade.
    Funcionario g2 = new Gerente(null, null, 2000);
    EditorVideo e1 = new EditorVideo("Marcos", "777732323.50", 2000);

    System.out.println(g1.getNome());
    System.out.println(g1.getCpf());
    System.out.println(g1.getSalario());
    System.out.println(g1.getBonificacao() + "\nS1\n");

    System.out.println(g2.getNome());
    System.out.println(g2.getCpf());
    System.out.println(g2.getSalario());
    System.out.println(g2.getBonificacao());

    System.out.println(g1.autentica(1234));
    System.out.println(g1.autentica(5040));

    g1.setSenha(5040);
    System.out.println(g1.autentica(5040));

    ControleBonificacao controle = new ControleBonificacao();
    controle.registra(g1);
    controle.registra(e1);

    System.out.println(controle.getSoma());
  }
}
