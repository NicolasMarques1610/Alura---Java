package bytebank.Arrays;

import bytebank.POO.Conta;

public class GuardadorDeReferencias {

  private Object[] referencias;
  private int posLivre;

  public GuardadorDeReferencias() {
    this.referencias = new Object[10];
    // nao precisa porque já é inicializado com valor padrao zero
    this.posLivre = 0;
  }

  public void adiciona(Object ref) {
    this.referencias[this.posLivre] = ref;
    this.posLivre++;
  }

  public int getQuantidadeDeElementos() {
    return this.posLivre;
  }

  public Object getReferencia(int pos) {
    return this.referencias[pos];
  }

}
