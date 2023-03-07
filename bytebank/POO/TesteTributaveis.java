package bytebank;

public class TesteTributaveis {
  public static void main(String args[]) {
    ContaCorrente cc = new ContaCorrente(0, 0);
    cc.deposita(100);
    cc.setTitular(null);

    ContaCorrente cc1 = new ContaCorrente(1, 1);
    cc1.deposita(1000);
    cc1.transfere(200, cc);

    SeguroVida seguro = new SeguroVida();

    CalculadorImposto calc = new CalculadorImposto();
    calc.registra(cc);
    calc.registra(seguro);

    System.out.println(calc.getTotal());
    System.out.println(cc.getSaldo());
    System.out.println(cc.toString());
  }
}
