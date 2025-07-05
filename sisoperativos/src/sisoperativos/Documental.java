package sisoperativos;

public class Documental extends ContenidoAudiovisual {
    private String tema;
    private Investigador investigador; // Composición

    public Documental(String titulo, int duracionEnMinutos, String genero, String tema, Investigador investigador) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
        this.investigador = investigador;
    }

    // Getters
    public String getTema() {
        return tema;
    }

    public Investigador getInvestigador() {
        return investigador;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del Documental:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Tema: " + tema);
        System.out.println("Investigador: " + (investigador != null ? investigador.getNombre() : "No especificado"));
        System.out.println("");
    }
}