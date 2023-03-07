package bytebank.POO;

public abstract class Conta {
  private double saldo;
  private int agencia;
  private int numero;
  private Cliente titular;
  private static int total;

  public Conta(int agencia, int numero) {
    total++;
    this.agencia = agencia;
    this.numero = numero;
    System.out.println("Conta " + numero + " criada com sucesso!");
  }

  public double getSaldo() {
    return this.saldo;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    if (numero <= 0) {
      System.out.println("Não pode valores iguais ou menores que zero!");
      return;
    }
    this.numero = numero;
  }

  public int getAgencia() {
    return agencia;
  }

  public void setAgencia(int agencia) {
    if (agencia <= 0) {
      System.out.println("Não pode valores iguais ou menores que zero!");
      return;
    }
    this.agencia = agencia;
  }

  public Cliente getTitular() {
    return titular;
  }

  public void setTitular(Cliente titular) {
    this.titular = titular;
  }

  public static int getTotal() {
    return total;
  }

  public void deposita(double valor) {
    if (valor <= 0) {
      System.out.println("Não pode deposita valores iguais ou menores que zero!");
      return;
    }
    this.saldo += valor;
  }

  public boolean subtrai(double valor) {
    if (this.saldo >= valor) {
      this.saldo -= valor;
      return true;
    }
    return false;
  }

  public boolean saca(double valor) {
    return subtrai(valor);
  }

  public boolean transfere(double valor, Conta destino) {
    if (saca(valor)) {
      destino.deposita(valor);
      return true;
    }
    return false;
  }

  @Override
  public String toString() {
    return "Agência: " + getAgencia() + "\nNúmero: " + getNumero() + "\nSaldo: "
        + getSaldo(); // + "\nTitular: "
    // + getTitular().getNome();
  }
}
