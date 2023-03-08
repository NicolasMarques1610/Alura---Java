package bytebank.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import bytebank.POO.*;
import bytebank.POO.Cliente;
import bytebank.heranca.*;

public class TesteArrayReferencias {
  public static void main(String[] args) {
    ContaCorrente[] contas = new ContaCorrente[5];
    Conta[] contas2 = new Conta[5];
    Object[] refs = new Object[5];
    int[] nums = { 1, 2, 3, 4, 5, 6 };
    // transforma um array em uma List
    List<Object> trans = Arrays.asList(refs);
    List<Integer> num = new ArrayList<>();

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] % 2 == 0) {
        num.add(nums[i]);
      }
    }

    num.forEach(n -> System.out.println(n));

    contas2[0] = new ContaCorrente(22, 33);
    contas2[1] = new ContaPoupanca(22, 43);

    Cliente c = new Cliente();
    refs[0] = c;
    refs[1] = new ContaCorrente(0, 0);
    refs[2] = new ContaPoupanca(22, 43);

    for (int i = 1; i < contas.length + 1; i++) {
      contas[i - 1] = new ContaCorrente(1, i * i);
    }

    Object ref = refs[1];

    ContaCorrente[] contas1 = { new ContaCorrente(11, 22), new ContaCorrente(2, 3) };

    System.out.println(contas[0].getAgencia());
    // type cast os parenteses do ContaCorrente, que transforma a referencia
    // generica Object em ContaCorrente uma referencia especifica
    System.out.println(((ContaCorrente) ref).getNumero());
  }
}
