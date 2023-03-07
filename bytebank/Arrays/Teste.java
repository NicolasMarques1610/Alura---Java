package bytebank.Arrays;

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
  }
}
