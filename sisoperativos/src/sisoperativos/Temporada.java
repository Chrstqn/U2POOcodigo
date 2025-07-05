package sisoperativos;

public class Temporada {
    private int numeroTemporada;
    private int numeroEpisodios;

    public Temporada(int numeroTemporada, int numeroEpisodios) {
        this.numeroTemporada = numeroTemporada;
        this.numeroEpisodios = numeroEpisodios;
    }

    // Getters
    public int getNumeroTemporada() {
        return numeroTemporada;
    }

    public int getNumeroEpisodios() {
        return numeroEpisodios;
    }
}