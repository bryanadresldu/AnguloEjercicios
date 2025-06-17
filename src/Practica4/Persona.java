package Practica4;

public class Persona {
    private int edad;

    public Persona(int edad) {
        this.edad = edad;
    }

    public void setEdad(int edad) {
        if (edad>=0){
            this.edad = edad;
            System.out.println("Edad aceptada: "+edad);}
        else
            System.out.println(" Error: Edad inválida, no actualizada");
    }
}
