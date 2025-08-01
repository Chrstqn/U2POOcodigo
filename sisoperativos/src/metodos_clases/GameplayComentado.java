package metodos_clases;

public class GameplayComentado extends ContenidoAudiovisual {
    private String juego;
    private String comentarista;

    public GameplayComentado(String titulo, int duracionEnMinutos, String genero, String juego, String comentarista) {
        super(titulo, duracionEnMinutos, genero);
        this.juego = juego;
        this.comentarista = comentarista;
    }

    // Getters
    public String getJuego() {
        return juego;
    }

    public String getComentarista() {
        return comentarista;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del Gameplay Comentado:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Juego: " + juego);
        System.out.println("Comentarista: " + comentarista);
        System.out.println("");
    }

	public String getDirector() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected char[] getEpisodios() {
		// TODO Auto-generated method stub
		return null;
	}
}