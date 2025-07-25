package sisoperativos;

import java.util.ArrayList;
import java.util.List;

public class SerieDeTV extends ContenidoAudiovisual {
    private int temporadas;
    private List<Temporada> listaTemporadas; // Asociación

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int temporadas) {
        super(titulo, duracionEnMinutos, genero);
        this.temporadas = temporadas;
        this.listaTemporadas = new ArrayList<>();
    }

    public void agregarTemporada(Temporada temporada) {
        listaTemporadas.add(temporada);
    }

    // Getters
    public int getTemporadas() {
        return temporadas;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la Serie de TV:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Número de temporadas: " + temporadas);
        System.out.println("Temporadas: " + (listaTemporadas.isEmpty() ? "No hay temporadas" : listaTemporadas.stream().map(t -> "Temporada " + t.getNumeroTemporada() + " (" + t.getNumeroEpisodios() + " episodios)").reduce((a, b) -> a + ", " + b).orElse("")));
        System.out.println("");
    }

	public String getDirector() {
		// TODO Auto-generated method stub
		return null;
	}

	public char[] getEpisodios() {
		// TODO Auto-generated method stub
		return null;
	}
}