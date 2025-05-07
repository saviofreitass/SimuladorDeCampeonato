import javax.naming.SizeLimitExceededException;
import java.util.*;

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

        String jogoA = times.get(timeA).getNome() + "-" + times.get(timeB).getNome();
        String jogoB = times.get(timeB).getNome() + "-" + times.get(timeA).getNome();

        if(jogosRealizados.contains(jogoA) || jogosRealizados.contains(jogoB)){
            throw new Exception("Jogo ja realizado!");
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

        if(!validarFinalCamp()){
            return imprimirTabela();
        };

        return "";
    }

    public boolean validarFinalCamp(){
        return jogosRealizados.size() != ((times.size() * (times.size() - 1) / 2));
    }

    public String imprimirTabela(){
        Collections.sort(times, new Comparator<Time>(){
            public int compare(Time time1, Time time2){
                return Integer.compare(time2.getPontos(), time1.getPontos());
            }
        } );

        StringBuilder tabela = new StringBuilder();

        for(Time time : times){
            tabela.append("Nome: ").append(time.getNome()).append(" || Total de Jogos: ").append(time.getJogos())
                    .append(" || Vitorias: ").append(time.getVitorias()).append(" || Empates: ").append(time.getEmpates())
                    .append(" || Derrotas: ").append(time.getDerrotas())
                    .append(" || Pontos: ").append(time.getPontos()).append(" || Gols Pro: ").append(time.getGolsPro())
                    .append(" || Gols Contra: ").append(time.getGolsContra())
                    .append(" || Saldo Gols: ").append((time.getGolsPro()-time.getGolsContra()))
                    .append("\n");
        }

        return tabela.toString();
    }
}
