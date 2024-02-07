public class Main {
    public static void main(String[] args) {

        PodCast podcast1 = new PodCast();
        podcast1.setTitulo("Java Orientado a Objetos");
        podcast1.setAutor("Marla Ingridh");
        podcast1.setDuracao(25);
        podcast1.reproduzir();
        podcast1.curtir();
        podcast1.setClassificacao(5);
        System.out.println(podcast1.getTitulo()+ " do autor: "+ podcast1.getAutor()+ ". Obteve "+ podcast1.getCurtidas()+ " Curtida." );
        podcast1.getClassificacao();

        Musica musica1 = new Musica();
        musica1.setCantor("Maria Maçal");
        musica1.setTitulo("Deixa");
        musica1.setDuracao(5.14);
        musica1.reproduzir();
        musica1.curtir();
        musica1.setClassificacao(2);
        System.out.println(musica1.getTitulo()+ " do Cantor: "+ musica1.getCantor()+ ". Obteve "+ musica1.getCurtidas()+ " curtida.");
        musica1.getClassificacao();

    }
}