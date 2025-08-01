import org.junit.jupiter.api.Test;

import metodos_clases.*;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class MainTest {

    @Test
    public void testLeerContenidoDesdeArchivo() {
        ArchivoContenidoManager manager = new ArchivoContenidoManager();
        List<ContenidoAudiovisual> contenidos = manager.leerContenido("contenido.csv");
        assertNotNull(contenidos, "La lista de contenidos no debería ser nula.");
    }

    @Test
    public void testCrearDocumental() {
        Investigador investigador = new Investigador("Jane Doe", "Crimen y suspenso");
        Documental documental = new Documental("El Misterio de las Pirámides", 90, "Documental", "Arqueología", investigador);

        assertEquals("El Misterio de las Pirámides", documental.getTitulo(), "El título del documental debería ser 'El Misterio de las Pirámides'.");
        assertEquals(90, documental.getDuracionEnMinutos(), "La duración del documental debería ser 90 minutos.");
        assertEquals("Arqueología", documental.getGenero(), "El género del documental debería ser 'Arqueología'.");
    }

    @Test
    public void testCrearPelicula() {
        Pelicula pelicula = new Pelicula("Inception", 148, "Ciencia Ficción", "Warner Bros");
        pelicula.agregarActor(new Actor("Leonardo DiCaprio", 45, "EE.UU."));

        assertEquals("Inception", pelicula.getTitulo(), "El título de la película debería ser 'Inception'.");
        assertEquals(148, pelicula.getDuracionEnMinutos(), "La duración de la película debería ser 148 minutos.");
    }

    @Test
    public void testCrearSerieDeTV() {
        SerieDeTV serie = new SerieDeTV("Breaking Bad", 45, "Drama", 5);
        serie.agregarTemporada(new Temporada(1, 7));

        assertEquals("Breaking Bad", serie.getTitulo(), "El título de la serie debería ser 'Breaking Bad'.");
        assertEquals(5, serie.getTemporadas(), "La cantidad de temporadas debería ser 5.");
    }

    @Test
    public void testCrearTransmisionEnVivo() {
        TransmisionEnVivo transmision = new TransmisionEnVivo("Anime EXPO día 3", 120, "IRL", "Twitch", 35400);
        
        assertEquals("Anime EXPO día 3", transmision.getTitulo(), "El título de la transmisión debería ser 'Anime EXPO día 3'.");
        assertEquals(120, transmision.getDuracionEnMinutos(), "La duración de la transmisión debería ser 120 minutos.");
        assertEquals("Twitch", transmision.getPlataforma(), "La plataforma de transmisión debería ser 'Twitch'.");
    }

    @Test
    public void testCrearGameplayComentado() {
        GameplayComentado gameplay = new GameplayComentado("Gameplay de Minecraft", 90, "Videojuegos", "Planeta Minecraft", "Vegetta777");
        
        assertEquals("Gameplay de Minecraft", gameplay.getTitulo(), "El título del gameplay debería ser 'Gameplay de Minecraft'.");
        assertEquals("Vegetta777", gameplay.getComentarista(), "El comentador del gameplay debería ser 'Vegetta777'.");
    }
}
