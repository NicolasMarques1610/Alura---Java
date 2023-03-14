package bytebank.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraComScanner {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(new File("contas.csv"));

        while(in.hasNextLine()) {
            String linha = in.nextLine();
            //System.out.println(linha);

            Scanner linhaScanner = new Scanner(linha); // criado baseado na linha
            linhaScanner.useLocale(Locale.ENGLISH); // transforma a lingua em ingles usando as regras do ingles porque dava erro com o ponto "." entre numeros
            linhaScanner.useDelimiter(","); // caracter de separaçao, pattern é regex

            String tipoConta = linhaScanner.next(); // cada valor é um elemento entra as virgulas
            int agencia = linhaScanner.nextInt();
            int numero = linhaScanner.nextInt();
            String titular = linhaScanner.next();
            double saldo = linhaScanner.nextDouble();

            // String valorFormatado = String.format("%s - %04d-%06d %s: %.2f", tipoConta, agencia, numero, titular, saldo); // formata a variavel
            // String valorFormatado = String.format(new Locale("pt", "BR"), "%s - %04d-%06d %s: %.2f", 
            // tipoConta, agencia, numero, titular, saldo); // podemos dizer que formatacao queremos a partir do pais ou lingua 
            // System.out.println(valorFormatado);

            System.out.format(new Locale("pt", "BR"), "%s - %04d-%06d %s: %.2f %n", 
            tipoConta, agencia, numero, titular, saldo); // formata e printa direto

            linhaScanner.close();

            // String [] valores = linha.split(","); // O método split quebra uma String em várias substrings a partir de um simbolo definido ou regex
            // System.out.println(valores[3]); // printa determinado valor
            //System.out.println(Arrays.toString(valores)); // printa array com os valores
        }

        in.close();

    }
}
