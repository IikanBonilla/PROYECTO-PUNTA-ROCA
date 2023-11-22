package Persona;
public class Extranjero extends Persona{

    public Extranjero(String nombres, String apellidos, String nacionalidad, String proveniencia, String proximoDestino, int edad, int cedula, String fechaDeIngreso, String fechaDeSalida) {
        super(nombres, apellidos, nacionalidad, proveniencia, proximoDestino, edad, cedula, fechaDeIngreso, fechaDeSalida);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
