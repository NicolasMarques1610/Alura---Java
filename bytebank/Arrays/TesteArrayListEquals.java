package bytebank.Arrays;

import java.util.ArrayList;

import bytebank.POO.*;

public class TesteArrayListEquals {
  public static void main(String[] args) {
    // coloca o <Conta> para dizer que esse ArrayList é do tipo Conta e so guarda
    // esse tipo de objeto, Generics é nome <>
    ArrayList<Conta> lista = new ArrayList<Conta>();

    Conta cc = new ContaCorrente(22, 11);
    lista.add(cc);

    Conta cc1 = new ContaCorrente(22, 22);
    lista.add(cc1);

    Conta cc2 = new ContaCorrente(22, 22);

    // sobreescrevi o equals colocando a regra de negocio na classe conta o que faz
    // a lista já conter esse objeto, mesmo a referencia desse nao estando na lista
    System.out.println("Contém essa conta? " + lista.contains(cc2));

    // transforma o objeto em codigo hash
    System.out.println(cc2.hashCode());

    for (Conta conta : lista) {
      if (conta.equals(cc2)) {
        System.out.println("Conta já existe!");
      }
    }

    // para cada objeto(Conta) da lista, é oq significa esse foreach
    for (Conta c : lista) {
      System.out.println(c);
    }
    // forEach igual do de cima só que simplificado
    lista.forEach(c -> System.out.println(c));
  }
}
