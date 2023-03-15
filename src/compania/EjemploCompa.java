package compania;

public class EjemploCompa {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Maicol", "Mora", "254", "calle 16",
                256.6, 02,8.469);

        System.out.println(gerente);

                //System.out.println("Nombre de gerente :" + gerente.getNombre());
                //System.out.println ("Apellido: " + gerente.getApellido());
                //System.out.println ("Numero Fiscal: " + gerente.getNumeroFiscal());
                //System.out.println ("Direccion: " + gerente.getDireccion());
                //System.out.println ("Remuneracion: " + gerente.getRemuneracion());
                //System.out.println ("ID empleado: " + gerente.getEmpleadoID());
                //System.out.println ("presupuesto: " +  gerente.getPresupuesto());
    }
}
