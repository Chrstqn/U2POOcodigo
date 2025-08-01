package DeberU2;

import java.util.ArrayList; // Importa ArrayList
import java.util.List;

import metodos_clases.Actor;
import metodos_clases.ArchivoContenidoManager;
import metodos_clases.ContenidoAudiovisual;
import metodos_clases.Documental;
import metodos_clases.GameplayComentado;
import metodos_clases.Investigador;
import metodos_clases.Pelicula;
import metodos_clases.SerieDeTV;
import metodos_clases.Temporada;
import metodos_clases.TransmisionEnVivo;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de ArchivoContenidoManager
        ArchivoContenidoManager manager = new ArchivoContenidoManager();

        // Leer contenido desde el archivo CSV
        List<ContenidoAudiovisual> contenidos = manager.leerContenido("contenido.csv");

        // Asegurarse de que la lista no sea null antes de iterar
        if (contenidos != null) {
            // Procesar la lista de contenidos y mostrar detalles
            for (ContenidoAudiovisual contenido : contenidos) {
                if (contenido instanceof Documental) {
                    Documental documental = (Documental) contenido;
                    documental.mostrarDetalles(); // Mostrar detalles del documental
                } else if (contenido instanceof Pelicula) {
                    Pelicula pelicula = (Pelicula) contenido;
                    pelicula.mostrarDetalles(); // Mostrar detalles de la película
                } else if (contenido instanceof SerieDeTV) {
                    SerieDeTV serie = (SerieDeTV) contenido;
                    serie.mostrarDetalles(); // Mostrar detalles de la serie
                } else if (contenido instanceof TransmisionEnVivo) {
                    TransmisionEnVivo transmision = (TransmisionEnVivo) contenido;
                    transmision.mostrarDetalles(); // Mostrar detalles de la transmisión
                } else if (contenido instanceof GameplayComentado) {
                    GameplayComentado gameplay = (GameplayComentado) contenido;
                    gameplay.mostrarDetalles(); // Mostrar detalles del gameplay comentado
                }
                // Puedes agregar más tipos de contenido aquí si es necesario
            }
        } else {
            System.out.println("No se pudo leer el contenido del archivo o el archivo no existe.");
            // Puedes agregar un manejo de error más robusto aquí, como crear una lista vacía o salir del programa.
            contenidos = new ArrayList<>(); // Inicializa la lista con una lista vacía para evitar errores posteriores
        }

        // Ejemplo de cómo crear un investigador y otros contenidos manualmente
        Investigador investigador = new Investigador("Jane Doe", "Crimen y suspenso");

        // Crear un documental
        Documental documental = new Documental("El Misterio de las Pirámides", 90, "Documental", "Arqueología", investigador);
        documental.mostrarDetalles(); // Mostrar detalles del documental

        // Crear una película
        Pelicula pelicula = new Pelicula("Inception", 148, "Ciencia Ficción", "Warner Bros");
        pelicula.agregarActor(new Actor("Leonardo DiCaprio", 45, "EE.UU."));
        pelicula.mostrarDetalles(); // Mostrar detalles de la película

        // Crear una serie de TV
        SerieDeTV serie = new SerieDeTV("Breaking Bad", 45, "Drama", 5);
        serie.agregarTemporada(new Temporada(1, 7));
        serie.mostrarDetalles(); // Mostrar detalles de la serie

        // Crear una transmisión en vivo
        TransmisionEnVivo transmision = new TransmisionEnVivo("Anime EXPO día 3", 120, "IRL", "Twitch", 35400);
        transmision.mostrarDetalles(); // Mostrar detalles de la transmisión

        // Crear un gameplay comentado
        GameplayComentado gameplay = new GameplayComentado("Gameplay de Minecraft", 90, "Videojuegos", "Planeta Minecraft", "Vegetta777");
        gameplay.mostrarDetalles(); // Mostrar detalles del gameplay comentado
    }
}
