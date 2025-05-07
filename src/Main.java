import javax.naming.SizeLimitExceededException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
     Campeonato camp = new Campeonato("JUF");

     camp.cadastrarTime("Medicina");
     camp.cadastrarTime("Comp");
     camp.cadastrarTime("Meno");

     System.out.println(camp.simularJogos(0, 1));
     System.out.println(camp.simularJogos(0, 2));
     System.out.println(camp.simularJogos(1, 2));

    }
}