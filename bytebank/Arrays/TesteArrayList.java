package bytebank.Arrays;

import java.util.ArrayList;

import bytebank.POO.*;

public class TesteArrayList {
  public static void main(String[] args) {
    // coloca o <Conta> para dizer que esse ArrayList é do tipo Conta e so guarda
    // esse tipo de objeto, Generics é nome <>
    ArrayList<Conta> lista = new ArrayList<Conta>();

    Conta cc = new ContaCorrente(22, 11);
    lista.add(cc);

    Conta cc1 = new ContaCorrente(22, 22);
    lista.add(cc1);

    System.out.println(lista.size());

    Conta ref = lista.get(0);
    System.out.println(ref.getNumero());

    lista.remove(0);
    System.out.println("Tamanho: " + lista.size());

    Conta cc2 = new ContaCorrente(32, 311);
    lista.add(cc2);

    Conta cc3 = new ContaCorrente(32, 322);
    lista.add(cc3);

    // for (int i = 0; i < lista.size(); i++) {
    // System.out.println(lista.get(i));
    // }

    // para cada objeto(Conta) da lista, é oq significa esse foreach
    for (Conta c : lista) {
      System.out.println(c);
    }
  }
}
