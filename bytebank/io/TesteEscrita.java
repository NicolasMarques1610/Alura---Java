package bytebank.io;

import java.io.*;

public class TesteEscrita {
  public static void main(String[] args) throws IOException {

    // Fluxo de Entrada com Arquivos
    FileOutputStream f = new FileOutputStream("lorem.txt");// cria um novo arquivo txt ou pode sobreescrever um arquivo
    Writer w = new OutputStreamWriter(f); // transforma os bytes em characteres
    BufferedWriter b = new BufferedWriter(w); // junta vários characteres

    b.write("Caraca que coisa mais fofa");
    b.newLine();
    b.write("Mas ele fede muito");

    b.close();
  }
}