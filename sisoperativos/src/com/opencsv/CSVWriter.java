package com.opencsv;

import java.io.FileWriter;
import java.io.IOException;

public class CSVWriter implements AutoCloseable { // Implementa AutoCloseable

    private final FileWriter fileWriter;
    private char separator;
    private char quotechar;
    private String lineEnd;

    public CSVWriter(FileWriter fileWriter) {
        this(fileWriter, ',', '"', "\n");
    }

    public CSVWriter(FileWriter fileWriter, char separator, char quotechar, String lineEnd) {
        if (fileWriter == null) {
            throw new IllegalArgumentException("FileWriter no puede ser null");
        }
        this.fileWriter = fileWriter;
        this.separator = separator;
        this.quotechar = quotechar;
        this.lineEnd = lineEnd;
    }

    public void writeNext(String[] nextLine) throws IOException {
        // Implementación del método writeNext... (la misma que antes)
        if (nextLine == null) {
            return; // No escribe nada si la línea es null
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nextLine.length; i++) {
            String value = nextLine[i];
            if (value == null) {
                value = ""; // Maneja valores null como cadenas vacías
            }

            // Añade comillas si es necesario (si el valor contiene el separador, comillas, o saltos de línea)
            if (value.contains(String.valueOf(separator)) || value.contains(String.valueOf(quotechar)) || value.contains(lineEnd)) {
                sb.append(quotechar);
                sb.append(value.replace(String.valueOf(quotechar), String.valueOf(quotechar) + String.valueOf(quotechar))); // Escapa las comillas dentro del valor
                sb.append(quotechar);
            } else {
                sb.append(value);
            }

            if (i < nextLine.length - 1) {
                sb.append(separator); // Añade el separador entre los campos
            }
        }
        sb.append(lineEnd); // Añade el fin de línea al final de la fila

        fileWriter.write(sb.toString()); // Escribe la línea en el archivo
    }

    @Override
    public void close() throws IOException { // Implementa el método close
        fileWriter.close();
    }
}
