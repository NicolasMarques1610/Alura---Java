package bytebank.io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscritaFileWriter {
    public static void main(String[] args) throws IOException {

        // Fluxo de Entrada com Arquivos
        // FileOutputStream f = new FileOutputStream("lorem.txt");// cria um novo arquivo txt ou pode sobreescrever um arquivo
        // Writer w = new OutputStreamWriter(f); // transforma os bytes em characteres
        // BufferedWriter b = new BufferedWriter(w); // junta vários characteres

        //transforma arquivo em characteres direto
        //FileWriter fw = new FileWriter("lorem2.txt");
        BufferedWriter b = new BufferedWriter(new FileWriter("lorem2.txt"));
    
        b.write("Caraca que coisa mais fofa");
        //fw.write(System.lineSeparator()); // separador de linha 
        b.newLine();
        //fw.write("\n");
        b.write("Mas ele fede muito");
    
        b.close();
      }
}
