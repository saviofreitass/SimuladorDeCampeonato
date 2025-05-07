import javax.naming.SizeLimitExceededException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Campeonato {
    private String nome;
    private ArrayList<Time> times;
    private ArrayList<Jogo> jogos;
    private Set<String> jogosRealizados;

    public Campeonato(String nome) {
        this.nome = nome;
        this.times = new ArrayList<>();
        this.jogos = new ArrayList<>();
        this.jogosRealizados = new HashSet<>();
    }

    public void cadastrarTime(String nome) throws SizeLimitExceededException {
        if(this.times.size()==10){
            throw new SizeLimitExceededException();
        }
        Time time = new Time(nome);
        this.times.add(time);
    }

    public String simularJogos(int timeA, int timeB) throws Exception {

        validarFinalCamp();

        String jogoA = times.get(timeA).getNome() + "-" + times.get(timeB).getNome();
        if(jogosRealizados.contains(jogoA)){
            throw new Exception("Erro ja realizado!");
        }
        jogosRealizados.add(jogoA);

        ArrayList<Time> timesJogo = new ArrayList<>();
        timesJogo.add(times.get(timeA));
        timesJogo.add(times.get(timeB));
        Jogo jogo = new Jogo(timesJogo);
        jogos.add(jogo);

        Random random = new Random();
        int golsTimeA = random.nextInt(6);
        int golsTimeB = random.nextInt(6);

        jogo.encerrarJogo(golsTimeA, golsTimeB);

        return times.get(timeA).getNome() + ": " + golsTimeA + " x " + times.get(timeB).getNome() + ": " + golsTimeB;
    }

    public void validarFinalCamp(){
        if(jogosRealizados.size() == (jogos.size() * jogos.size() - 1) ){
            System.out.println("Campeonato Finalizado!");
        }
    }
}
