package bytebank.POO;

public class ContaCorrente extends Conta implements Tributavel {

  public ContaCorrente(int agencia, int numero) {
    super(agencia, numero);
  }

  @Override
  public boolean saca(double valor) {
    double valSacar = valor + 0.2;
    return super.saca(valSacar);
  }

  @Override
  public double getValorImposto() {
    return super.getSaldo() * 0.01;
  }

  @Override
  public String toString() {
    return "Conta Corrente, \n" + super.toString();
  }

}
