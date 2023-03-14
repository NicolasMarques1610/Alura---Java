package bytebank.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;

public class TesteEscritaPrintStream {
  public static void main(String[] args) throws IOException {
      // Fluxo de Entrada com Arquivos
      // FileOutputStream f = new FileOutputStream("lorem.txt");// cria um novo arquivo txt ou pode sobreescrever um arquivo
      // Writer w = new OutputStreamWriter(f); // transforma os bytes em characteres
      // BufferedWriter b = new BufferedWriter(w); // junta vários characteres

      //transforma arquivo em characteres direto
      //FileWriter fw = new FileWriter("lorem2.txt");
      //BufferedWriter b = new BufferedWriter(new FileWriter("lorem2.txt"));

      //imprimir characteres
      double init = System.currentTimeMillis();
      PrintStream ps = new PrintStream(new File("lorem3.txt"));
      //PrintWriter pw = new PrintWriter("lorem2.txt"); // parecido com o PrintStream

      ps.println("Caraca que coisa mais fofa");
      ps.print("Mas ele fede muito");
  
      ps.close();

      double fim = System.currentTimeMillis();
      System.out.println("Passaram " + (fim - init)/1000 + " segundos");
    }
}
