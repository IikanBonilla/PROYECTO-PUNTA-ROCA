 import Persona.Persona;
import Persona.Extranjero;
import Persona.Nacional;

 import java.sql.SQLOutput;
 import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        int cantidad;
        Scanner entrada = new Scanner(System.in);
        ArrayList<Extranjero> extranjero = new ArrayList<Extranjero>();
        ArrayList<Nacional> nacional = new ArrayList<Nacional>();
        System.out.println("Elija el tipo de turista: ");
        System.out.println("1. Extranjero");
        System.out.println("2. Nacional");
        System.out.println("Elige una opcion: ");
        int Opcion = entrada.nextInt();

        switch (Opcion) {
            case 1:{
                System.out.println("Ingrese la cantidad de personas que va a ingresar:");
                cantidad = entrada.nextInt();
                entrada.nextLine();
                for (int i = 0; i < cantidad; i++) {
                    if (cantidad == 1 || cantidad > 0) {
                        System.out.println("\nDatos (Presiona enter para continuar)");
                        System.out.println("Nombres: ");
                        String nombres = entrada.nextLine();
                        System.out.println("Apellidos: ");
                        String apellidos = entrada.nextLine();
                        System.out.println("Edad: ");
                        int edad = entrada.nextInt();
                        System.out.println("Cedula: ");
                        int cedula = entrada.nextInt();
                        entrada.nextLine();
                        System.out.println("Nacionalidad: ");
                        String nacionalidad = entrada.nextLine();
                        System.out.println("Proveniencia: ");
                        String proveniencia = entrada.nextLine();
                        System.out.println("Proximo destino: ");
                        String proximoDestino = entrada.nextLine();
                        System.out.println("Fecha de ingreso DD/MM/AA: ");
                        String fechaDeIngreso = entrada.nextLine();
                        System.out.println("Fecha de salida DD/MM/AA: ");
                        String fechaDeSalida = entrada.nextLine();
                        extranjero.add(new Extranjero(nombres, apellidos, nacionalidad, proveniencia, proximoDestino, edad, cedula, fechaDeIngreso, fechaDeSalida));
                    } else if (cantidad > 1) {
                        System.out.println("Persona " + (i + 1) +" (Presiona enter para continuar)");
                        entrada.nextLine();
                        System.out.println("Nombres: ");
                        String nombres = entrada.nextLine();
                        System.out.println("Apellidos: ");
                        String apellidos = entrada.nextLine();
                        System.out.println("Edad: ");
                        int edad = entrada.nextInt();
                        System.out.println("Cedula: ");
                        int cedula = entrada.nextInt();
                        entrada.nextLine();
                        System.out.println("Nacionalidad: ");
                        String nacionalidad = entrada.nextLine();
                        System.out.println("Proveniencia: ");
                        String proveniencia = entrada.nextLine();
                        System.out.println("Proximo destino: ");
                        String proximoDestino = entrada.nextLine();
                        System.out.println("Fecha de ingreso DD/MM/AA: ");
                        String fechaDeIngreso = entrada.nextLine();
                        System.out.println("Fecha de salida DD/MM/AA: ");
                        String fechaDeSalida = entrada.nextLine();
                        extranjero.add(new Extranjero(nombres, apellidos, nacionalidad, proveniencia, proximoDestino, edad, cedula, fechaDeIngreso, fechaDeSalida));

                    } else {
                        System.out.println("Cantidad invalida");
                    }
                }
            } break;
            case 2: {
                System.out.println("Ingrese la cantidad de personas que va a ingresar:");
                cantidad = entrada.nextInt();
                entrada.nextLine();
                for (int i = 0; i < cantidad; i++) {
                    if (cantidad == 1 || cantidad > 0) {
                        System.out.println("\nDatos (Presiona enter para continuar)");
                        entrada.nextLine();
                        System.out.println("Ingrese sus nombres: ");
                        String nombres = entrada.nextLine();
                        System.out.println("Ingrese sus apellidos: ");
                        String apellidos = entrada.nextLine();
                        System.out.println("Ingrese su edad: ");
                        int edad = entrada.nextInt();
                        System.out.println("Ingrese su cedula: ");
                        int cedula = entrada.nextInt();
                        entrada.nextLine();
                        System.out.println("Ingrese su nacionalidad: ");
                        String nacionalidad = entrada.nextLine();
                        System.out.println("Ingrese su ciudad de proveniencia: ");
                        String proveniencia = entrada.nextLine();
                        System.out.println("Ingrese su proximo destino: ");
                        String proximoDestino = entrada.nextLine();
                        System.out.println("\nIngrese su fecha de ingreso DD/MM/AA: ");
                        String fechaDeIngreso = entrada.nextLine();
                        System.out.println("\nIngrese su fecha de salida DD/MM/AA: ");
                        String fechaDeSalida = entrada.nextLine();
                        nacional.add(new Nacional(nombres, apellidos, nacionalidad, proveniencia, proximoDestino, edad, cedula, fechaDeIngreso, fechaDeSalida));
                    } else if (cantidad > 1) {
                        System.out.println("Datos Persona " + (i + 1)+" (Presiona enter para continuar)" );
                        entrada.nextLine();
                        System.out.println("Nombres: ");
                        String nombres = entrada.nextLine();
                        System.out.println("Apellidos: ");
                        String apellidos = entrada.nextLine();
                        System.out.println("Edad: ");
                        int edad = entrada.nextInt();
                        System.out.println("Cedula: ");
                        int cedula = entrada.nextInt();
                        entrada.nextLine();
                        System.out.println("Nacionalidad: ");
                        String nacionalidad = entrada.nextLine();
                        System.out.println("Proveniencia: ");
                        String proveniencia = entrada.nextLine();
                        System.out.println("Proximo destino: ");
                        String proximoDestino = entrada.nextLine();
                        System.out.println("Fecha de ingreso DD/MM/AA: ");
                        String fechaDeIngreso = entrada.nextLine();
                        System.out.println("Fecha de salida DD/MM/AA: ");
                        String fechaDeSalida = entrada.nextLine();
                        nacional.add(new Nacional(nombres, apellidos, nacionalidad, proveniencia, proximoDestino, edad, cedula, fechaDeIngreso, fechaDeSalida));

                    } else {
                        System.out.println("Cantidad invalida");
                    }
                }
            }break;
        }

        System.out.println("Datos de turistas: ");
        System.out.println("1. Extranjero");
        System.out.println("2. Nacional");
        System.out.println("Elige una opcion: ");
        int Opcion2 = entrada.nextInt();
        switch (Opcion2){
            case 1: {
                for (Extranjero listaE : extranjero) {
                    System.out.println(listaE);
                }
            }break;
            case 2: {
                for (Nacional listaN : nacional) {
                    System.out.println(listaN);
                }
            }break;
        }

    }
}