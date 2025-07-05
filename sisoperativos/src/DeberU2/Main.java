package DeberU2;

import sisoperativos.Actor;
import sisoperativos.Documental;
import sisoperativos.GameplayComentado;
import sisoperativos.Investigador;
import sisoperativos.Pelicula;
import sisoperativos.SerieDeTV;
import sisoperativos.Temporada;
import sisoperativos.TransmisionEnVivo;

public class Main {
    public static void main(String[] args) {
        // Crear un investigador
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