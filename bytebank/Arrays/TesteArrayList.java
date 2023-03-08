package bytebank.Arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import bytebank.POO.*;

public class TesteArrayList {
  public static void main(String[] args) {
    // coloca o <Conta> para dizer que esse ArrayList é do tipo Conta e so guarda
    // esse tipo de objeto, Generics é nome <>
    // List<Conta> lista = new Vector<Conta>();// Vector thread safe
    // Collection<Conta> lista = new ArrayList<Conta>();//Collection é uma interface
    // que as List implementam, List tb eh interface
    List<Conta> lista = new ArrayList<Conta>();

    Conta cc = new ContaCorrente(22, 11);
    lista.add(cc);

    Conta cc1 = new ContaCorrente(22, 22);
    lista.add(cc1);

    System.out.println(lista.size());

    Conta ref = lista.get(0);
    System.out.println(ref.getNumero());

    lista.remove(0);
    System.out.println("Tamanho: " + lista.size());

    Conta cc2 = new ContaCorrente(32, 311);
    lista.add(cc2);

    Conta cc3 = new ContaCorrente(32, 322);
    lista.add(cc3);

    // for (int i = 0; i < lista.size(); i++) {
    // System.out.println(lista.get(i));
    // }

    // para cada objeto(Conta) da lista, é oq significa esse foreach
    for (Conta c : lista) {
      System.out.println(c);
    }


    //Iteretor podemos usar para verificar se existe um proximo elemento e pedir esse elemento,
    //funciona com qualquer implementeçao
    List<String> nomes = new ArrayList<>();
    nomes.add("Super Mario");
    nomes.add("Yoshi"); 
    nomes.add("Donkey Kong"); 

    Iterator<String> it = nomes.iterator();

    while(it.hasNext()) {
      System.out.println(it.next());
    }

    //usando set que nao deixa repeti elemento
    Set<String> n = new HashSet<>();
    n.add("Super Mario");
    n.add("Yoshi"); 
    n.add("Donkey Kong"); 
    n.add("Super Mario");
    n.add("Donkey Kong"); 
    

    Iterator<String> lit = nomes.iterator();

    while(lit.hasNext()) {
      System.out.println(lit.next());
    }   
  }
}
