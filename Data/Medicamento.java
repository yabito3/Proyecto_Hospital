package Data;

public class Medicamento {
    private String nombre;
    private String dosis;

    public Medicamento(String nombre, String dosis) {
        this.nombre = nombre;
        this.dosis = dosis;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDosis() {
        return dosis;
    }

    @Override
    public String toString() {
        return nombre + " (" + dosis + ")";
    }
}
