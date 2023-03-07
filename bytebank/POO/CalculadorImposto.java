package bytebank;

public class CalculadorImposto {

  private double total;

  public void registra(Tributavel t) {
    double valor = t.getValorImposto();
    this.total += valor;
  }

  public double getTotal() {
    return total;
  }
}
