package Persona;
public abstract class Persona {

    private String nombres, apellidos, nacionalidad, proveniencia, proximoDestino, fechaDeIngreso, fechaDeSalida;
    private int edad, cedula;

    public Persona(String nombres, String apellidos, String nacionalidad, String proveniencia, String proximoDestino, int edad, int cedula, String fechaDeIngreso, String fechaDeSalida) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.nacionalidad = nacionalidad;
        this.proveniencia = proveniencia;
        this.proximoDestino = proximoDestino;
        this.edad = edad;
        this.cedula = cedula;
        this.fechaDeIngreso = fechaDeIngreso;
        this.fechaDeSalida = fechaDeSalida;
    }

    @Override
    public String toString() {
        return "\nNombres: "+this.nombres+"\nApellidos: "+this.apellidos+"\nEdad: "+this.edad+"\nCedula: "+this.cedula+"\nNacionalidad: "+this.nacionalidad+"\nCiudad anterior: "+this.proveniencia+"\nProximo destino: "+this.proximoDestino+"\nFecha de ingreso: "+this.fechaDeIngreso+"\nFecha de salida: "+this.fechaDeSalida;
    }

    public String getNombres() {
        return nombres;
    }
    public String getApellidos(){
        return apellidos;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getProveniencia() {
        return proveniencia;
    }

    public String getProximoDestino() {
        return proximoDestino;
    }

    public int getEdad() {
        return edad;
    }

    public int getCedula() {
        return cedula;
    }

    public String getFechaDeIngreso() {
        return fechaDeIngreso;
    }

    public String getFechaDeSalida() {
        return fechaDeSalida;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setProveniencia(String proveniencia) {
        this.proveniencia = proveniencia;
    }

    public void setProximoDestino(String proximoDestino) {
        this.proximoDestino = proximoDestino;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setFechaDeIngreso(String fechaDeIngreso) {
        this.fechaDeIngreso = fechaDeIngreso;
    }

    public void setFechaDeSalida(String fechaDeSalida) {
        this.fechaDeSalida = fechaDeSalida;
    }


}
