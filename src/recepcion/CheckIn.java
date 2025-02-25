package recepcion;

public class CheckIn {

    String documentoIdentidad;
    String nombreCompleto;
    String nacionalidad;
    String tipoHabitacion;
    int cantNoches;
    String fechaAlta;


    public CheckIn(String documentoIdentidad, String nombreCompleto, String nacionalidad, String tipoHabitacion, int cantNoches, String fechaAlta) {
        this.documentoIdentidad = documentoIdentidad;
        this.nombreCompleto = nombreCompleto;
        this.nacionalidad = nacionalidad;
        this.tipoHabitacion = tipoHabitacion;
        this.cantNoches = cantNoches;
        this.fechaAlta = fechaAlta;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public int getCantNoches() {
        return cantNoches;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    @Override
    public String toString() {
        return "CheckIn{" +
                "documentoIdentidad='" + documentoIdentidad + '\'' +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", tipoHabitacion='" + tipoHabitacion + '\'' +
                ", cantNoches=" + cantNoches +
                ", fechaAlta='" + fechaAlta + '\'' +
                '}';
    }
}
