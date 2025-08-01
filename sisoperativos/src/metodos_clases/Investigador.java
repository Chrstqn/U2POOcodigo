package metodos_clases;

public class Investigador {
    private String nombre;
    private String areaDeEstudio;

    public Investigador(String nombre, String areaDeEstudio) {
        this.nombre = nombre;
        this.areaDeEstudio = areaDeEstudio;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getAreaDeEstudio() {
        return areaDeEstudio;
    }
}