package sisoperativos;

import java.util.ArrayList;
import java.util.List;

public class Pelicula extends ContenidoAudiovisual {
    private String estudio;
    private List<Actor> actores; // Asociación

    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio) {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
        this.actores = new ArrayList<>();
    }

    public void agregarActor(Actor actor) {
        actores.add(actor);
    }

    // Getters
    public String getEstudio() {
        return estudio;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la película:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Estudio: " + estudio);
        System.out.println("Actores: " + (actores.isEmpty() ? "No hay actores" : actores.stream().map(Actor::getNombre).reduce((a, b) -> a + ", " + b).orElse("")));
        System.out.println("");
    }
}