public class Audio {
    private String titulo;
    private double duracao;
    private int totalReproducoes;
    private int curtidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public void setTotalReproducoes(int totalReproducoes) {
        this.totalReproducoes = totalReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public void getClassificacao() {
        if(this.classificacao <= 2){
            System.out.println("Classificação modesta.");
        }else if(this.classificacao > 3 ){
            System.out.println("Boa classificação");
        }else {
            System.out.println("Ótima classificação");
        }

    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public void curtir(){
        this.curtidas ++;
        System.out.println("Total de curtidas: "+ this.curtidas);
    }

    public void reproduzir(){
        this.totalReproducoes ++;
        System.out.println("Total de reproduções: " + this.totalReproducoes);
    }


}
