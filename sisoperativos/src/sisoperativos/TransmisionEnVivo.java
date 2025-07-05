package sisoperativos;

public class TransmisionEnVivo extends ContenidoAudiovisual {
    private String plataforma;
    private int espectadores;

    public TransmisionEnVivo(String titulo, int duracionEnMinutos, String genero, String plataforma, int espectadores) {
        super(titulo, duracionEnMinutos, genero);
        this.plataforma = plataforma;
        this.espectadores = espectadores;
    }

    // Getters
    public String getPlataforma() {
        return plataforma;
    }

    public int getEspectadores() {
        return espectadores;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la Transmisión en Vivo:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Espectadores: " + espectadores);
        System.out.println("");
    }
}