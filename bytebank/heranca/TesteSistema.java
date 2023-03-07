package bytebank.heranca;

public class TesteSistema {
  public static void main(String args[]) {
    Gerente g = new Gerente(null, null, 0);
    g.setSenha(2222);

    Administrador adm = new Administrador(null, null, 0);
    adm.setSenha(3333);

    Cliente cliente = new Cliente();
    cliente.setSenha(2222);

    SistemaInterno si = new SistemaInterno();
    si.autentica(g);
    si.autentica(adm);
    si.autentica(cliente);
  }

}
