package Practica3;

import javax.naming.LimitExceededException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante=new Estudiante("Bryan Angulo",null,null,
                "Desarrollo de Software","Tercero");
        Docente docente= new Docente("Pedro Alcivar",null,null,4);

        estudiante.mostrarDatos();
        docente.mostrarDatos();

        Scanner leer=new Scanner(System.in);
        System.out.println("\n-----INGRESE LA INFORMACION DEL ESTUDIANTE-----");
        System.out.println("Ingrese el numero de cedula: ");
        estudiante.setNumeroCedula(leer.nextLine());
        System.out.println("Ingrese la direccion: ");
        estudiante.setDireccion(leer.nextLine());

        System.out.println("-----INGRESE LA INFORMACION DEL DOCENTE-----");
        System.out.println("Ingrese el numero de cedula: ");
        docente.setNumeroCedula(leer.nextLine());
        System.out.println("Ingrese la direccion: ");
        docente.setDireccion(leer.nextLine());

        estudiante.mostrarDatos();
        docente.mostrarDatos();

    }
}
