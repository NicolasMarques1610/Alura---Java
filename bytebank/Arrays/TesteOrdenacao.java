package bytebank.Arrays;

import java.util.ArrayList;
import java.util.Collections;
//usado para o método sort
import java.util.Comparator;
import java.util.List;

import bytebank.POO.*;

public class TesteOrdenacao {
  public static void main(String[] args) {

    Conta cc1 = new ContaCorrente(22, 33);
    Cliente clienteCC1 = new Cliente();
    clienteCC1.setNome("Nico");
    cc1.setTitular(clienteCC1);
    cc1.deposita(333.0);

    Conta cc2 = new ContaPoupanca(22, 44);
    Cliente clienteCC2 = new Cliente();
    clienteCC2.setNome("Guilherme");
    cc2.setTitular(clienteCC2);
    cc2.deposita(144.0);

    Conta cc3 = new ContaCorrente(22, 11);
    Cliente clienteCC3 = new Cliente();
    clienteCC3.setNome("Paulo");
    cc3.setTitular(clienteCC3);
    cc3.deposita(111.0);

    Conta cc4 = new ContaPoupanca(22, 22);
    Cliente clienteCC4 = new Cliente();
    clienteCC4.setNome("Ana");
    cc4.setTitular(clienteCC4);
    cc4.deposita(222.0);

    List<Conta> lista = new ArrayList<>();
    lista.add(cc1);
    lista.add(cc2);
    lista.add(cc3);
    lista.add(cc4);

    for (Conta conta : lista) {
      System.out.println(conta);
    }

    // function object
    // ComparadorNumeroConta comparar = new ComparadorNumeroConta();

    // ordenação, se substituirmos por null é usado a ordem natural feita na classe
    // Conta
    lista.sort(new ComparadorTitularConta());

    // outra forma de ordenar
    Collections.sort(lista, new ComparadorNumeroConta());

    // embaralha a lista
    // Collections.shuffle(lista);

    // se a lista é do menor pro maior, inverte do maior para o menor
    // Collections.reverse(lista);

    // ordenação de ordem natural
    //Collections.sort(lista);

    System.out.println("------------------");

    for (Conta conta : lista) {
      System.out.println(conta + ", " + conta.getTitular().getNome());
    }
  }
}

class ComparadorTitularConta implements Comparator<Conta> {

  @Override
  public int compare(Conta c1, Conta c2) {
    String nomeC1 = c1.getTitular().getNome();
    String nomeC2 = c2.getTitular().getNome();
    return nomeC1.compareTo(nomeC2);
  }

}

// classe de comparação editada a partir da interface comparator
class ComparadorNumeroConta implements Comparator<Conta> {

  @Override
  public int compare(Conta c1, Conta c2) {
    return Integer.compare(c1.getNumero(), c2.getNumero());
    // return c1.getNumero() - c2.getNumero(); // segunda forma
    // if (c1.getNumero() < c2.getNumero()) {
    // return -1;
    // }
    // if (c1.getNumero() > c2.getNumero()) {
    // return 1;
    // }
    // return 0;
  }

}
