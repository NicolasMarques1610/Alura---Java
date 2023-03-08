package bytebank.Arrays;

import java.util.*;

import bytebank.POO.*;

public class Teste {
  public static void main(String[] args) {
    GuardadorDeReferencias guardador = new GuardadorDeReferencias();

    Conta cc = new ContaCorrente(22, 11);
    guardador.adiciona(cc);

    Conta cc1 = new ContaCorrente(22, 22);
    guardador.adiciona(cc1);

    int tamanho = guardador.getQuantidadeDeElementos();
    System.out.println(tamanho);

    Object ref = guardador.getReferencia(0);
    System.out.println(((Conta) ref).getNumero());

    String s = "10";
    Integer n = Integer.valueOf(29);
    Integer n2 = Integer.valueOf(s);
    System.out.println(n);

    int val = n.intValue();
    int val2 = n2.intValue();
    System.out.println(val);
    System.out.println(val2);

    System.out.println(Integer.MAX_VALUE);
    System.out.println(Integer.MIN_VALUE);
    System.out.println(Integer.SIZE);
    System.out.println(Integer.BYTES);

    int numero = Integer.parseInt(s);
    System.out.println(numero);
    char[] a = { 'a', 'l', 'o' };
    System.out.println(String.copyValueOf(a));

    List<Number> lista = new ArrayList<>();
    lista.add(10);
    lista.add(10.6);
    lista.add(25.6f);

    List<Object> lista2 = new ArrayList<>();
    lista2.add(Integer.valueOf(10));

    List<Integer> lista3 = new ArrayList<>();
    lista3.add(10);
    lista3.add(1);
    lista3.add(0);
    lista3.add(11);
    lista3.add(9);

    lista3.sort((valor, valor2) -> Integer.compare(valor, valor2));

    lista3.forEach(v -> {
      if(v == 0) {
        System.out.println("Neutro: " + v);
      } else if(v % 2 == 0) { 
        System.out.println("Par: " + v);
      } else System.out.println("Ímpar: " + v);
    });

    // Ordenação de números de um array
    int[] val5 = { 44, 33, 98, 2, 10, 1, 34 };
    Arrays.sort(val5);
    System.out.println(Arrays.toString(val5));
  }
}
