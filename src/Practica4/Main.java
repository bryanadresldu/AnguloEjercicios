package Practica4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Persona persona1=new Persona(0);
        Persona persona2=new Persona(0);
        Scanner leer=new Scanner(System.in);

        System.out.println("Ingrese la edad: ");
        int edad= leer.nextInt();
        persona1.setEdad(edad);

        System.out.println("Ingrese la edad: ");
        edad= leer.nextInt();
        persona2.setEdad(edad);
    }
}
