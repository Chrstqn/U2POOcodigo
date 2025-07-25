package sisoperativos;

import java.io.FileWriter;
import java.io.IOException;

public class CSVWriter {
    private final FileWriter fileWriter;

    public CSVWriter(FileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    // Método para escribir una fila en el CSV (ejemplo)
    public void writeNext(String[] record) throws IOException {
        // Implementa la lógica para escribir una fila en el archivo CSV
        // Usando el FileWriter y la librería opencsv
        try (com.opencsv.CSVWriter csvWriter = new com.opencsv.CSVWriter(fileWriter)) {
            csvWriter.writeNext(record);
        } catch (IOException e) {
            // Manejo de la excepción (puede ser relanzar, registrar, etc.)
            throw e; // Relanzamos la excepción para que se maneje en el método que llama a writeNext
        }
    }

    // Método para cerrar el escritor (ejemplo)
    public void close() throws IOException {
        if (fileWriter != null) {
            fileWriter.close();
        }
    }
}
