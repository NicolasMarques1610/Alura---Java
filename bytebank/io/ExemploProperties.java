package bytebank.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class ExemploProperties {
    public static void main(String[] args) throws IOException {
        //import deve ser java.util.Properties
        Properties props = new Properties(); 
        props.setProperty("login", "alura"); //chave, valor
        props.setProperty("senha", "alurapass");
        props.setProperty("endereco", "www.alura.com.br");

        props.store(new FileWriter("conf.properties"), "algum comentário");

        Properties props2 = new Properties();  
        props2.load(new FileReader("conf.properties"));

        String login = props.getProperty("login");
        String senha = props.getProperty("senha");
        String endereco = props.getProperty("endereco");

        System.out.println(login + ", " + senha  + ", " +  endereco);
    }
}
