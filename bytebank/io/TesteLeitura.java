package bytebank.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura {
  public static void main(String[] args) throws IOException {

    // Fluxo de Entrada com Arquivos
    FileInputStream f = new FileInputStream("lorem.txt"); // ou so InputStream
    InputStreamReader r = new InputStreamReader(f); // transforma os bytes em characteres
    BufferedReader b = new BufferedReader(r); // junta vários characteres

    String linha = b.readLine();

    while (linha != null) {
      System.out.println(linha);
      linha = b.readLine();
    }

    b.close();
  }
}