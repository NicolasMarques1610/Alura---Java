package bytebank.io;

import java.io.*;

public class TesteCopiarArquivo {
  public static void main(String[] args) throws IOException {

    // Via Rede
    // Socket s = new Socket();
    // InputStream f = s.getInputStream();
    // OutputStream out = s.getInputStream();

    // Fluxo de Entrada com Arquivos
    InputStream f = System.in; // new FileInputStream("lorem.txt");
    InputStreamReader r = new InputStreamReader(f); // transforma os bytes em characteres
    BufferedReader b = new BufferedReader(r); // junta vários characteres

    OutputStream out = System.out; // new FileOutputStream("lorem2.txt");
    Writer w = new OutputStreamWriter(out);
    BufferedWriter bw = new BufferedWriter(w);

    String linha = b.readLine();

    while (linha != null && !(linha.isEmpty())) {
      bw.write(linha);
      bw.newLine();
      bw.flush();// escreve logo sem precisar fechar o bufferooooo
      linha = b.readLine();
    }

    b.close();
    bw.close();
  }
}
