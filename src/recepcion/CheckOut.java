package recepcion;

public class CheckOut {

    String documentoIdentidad;
    String nombreCompleto;
    String nacionalidad;
    String tipoHabitacion;
    int cantNoches;
    String fechaBaja;

    public CheckOut(String documentoIdentidad, String nombreCompleto, String nacionalidad, String tipoHabitacion, int cantNoches, String fechaBaja) {
        this.documentoIdentidad = documentoIdentidad;
        this.nombreCompleto = nombreCompleto;
        this.nacionalidad = nacionalidad;
        this.tipoHabitacion = tipoHabitacion;
        this.cantNoches = cantNoches;
        this.fechaBaja = fechaBaja;
    }

    @Override
    public String toString() {
        return "CheckOut{" +
                "documentoIdentidad='" + documentoIdentidad + '\'' +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", tipoHabitacion='" + tipoHabitacion + '\'' +
                ", cantNoches=" + cantNoches +
                ", fechaBaja='" + fechaBaja + '\'' +
                '}';
    }
}
