package metodos_clases;

import com.opencsv.CSVWriter; // Importa la clase CSVWriter de opencsv
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ArchivoContenidoManager {

    // Método para escribir contenido en un archivo CSV
    public void escribirContenido(String archivo, List<ContenidoAudiovisual> contenidos) {
        try (FileWriter fileWriter = new FileWriter(archivo);
             CSVWriter csvWriter = new CSVWriter(fileWriter)) { // Usa tu clase CSVWriter
            // Escribir encabezados
            String[] header = {"Tipo", "Título", "Género", "Director", "Temporadas", "Episodios"};
            csvWriter.writeNext(header);

            // Escribir cada contenido
            for (ContenidoAudiovisual contenido : contenidos) {
                String[] record = crearRegistro(contenido);
                csvWriter.writeNext(record);
            }
        } catch (IOException e) {
            e.printStackTrace();
            // Manejar la excepción (log, lanzar una excepción personalizada, etc.)
        }
    }

    private String[] crearRegistro(ContenidoAudiovisual contenido) {
        // Aquí debes adaptar el método según las clases que tienes
        if (contenido instanceof Pelicula) {
            Pelicula pelicula = (Pelicula) contenido;
            return new String[]{"Película", pelicula.getTitulo(), pelicula.getGenero(), pelicula.getDirector(), "", ""};
        } else if (contenido instanceof SerieDeTV) {
            SerieDeTV serie = (SerieDeTV) contenido;
            return new String[]{"Serie", serie.getTitulo(), serie.getGenero(), serie.getDirector(), String.valueOf(serie.getTemporadas()), String.valueOf(serie.getEpisodios())};
        } else if (contenido instanceof Documental) {
            Documental documental = (Documental) contenido;
            return new String[]{"Documental", documental.getTitulo(), documental.getGenero(), documental.getDirector(), "", ""};
        } else if (contenido instanceof GameplayComentado) {
            GameplayComentado gameplay = (GameplayComentado) contenido;
            return new String[]{"Gameplay Comentado", gameplay.getTitulo(), gameplay.getGenero(), gameplay.getDirector(), "", ""};
        } else if (contenido instanceof TransmisionEnVivo) {
            TransmisionEnVivo transmision = (TransmisionEnVivo) contenido;
            return new String[]{"Transmisión en Vivo", transmision.getTitulo(), "", "", "", ""};
        }
        return new String[]{"", "", "", "", "", ""}; // Retorna un registro vacío si no coincide
    }

	public List<ContenidoAudiovisual> leerContenido(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
