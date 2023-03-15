package compania;

public class Empleado extends Persona{
    private Double remuneracion;
    private int empleadoId;

    public Empleado(String nombre, String apellido, String numeroFiscal,
                    String direccion, Double remuneraccion, int empleadoId) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneraccion;
        this.empleadoId = empleadoId;
    }

    public Double getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(Double remuneraccion) {
        this.remuneracion = remuneraccion;
    }

    public int getEmpleadoID() {
        return empleadoId;
    }

    public void setEmpleadoID(int empleadoID) {
        this.empleadoId = empleadoID;
    }
    @Override
    public String toString() {
        return "empleadoId=" + empleadoId + ", remuneracion=" + remuneracion + ", " + super.toString();
    }

}
