package Practica4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Persona persona=new Persona(0);
        Scanner leer=new Scanner(System.in);

        System.out.println("Ingrese la edad: ");
        int edad= leer.nextInt();
        persona.setEdad(edad);

    }
}
