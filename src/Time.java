public class Time {
    private String nome;
    private int pontos;

    public Time(String nome) {
        this.nome = nome;
        this.pontos = 0;
    }

    public void adicionarPontos(int pontos) {
        this.pontos += pontos;
    }

    public String getNome() {
        return nome;
    }
}
