package Practica2;

public class Casa extends Inmobiliario{
    private int numeroPisos;

    public Casa(String direccion, double precio, String nombreDueno,int numeroPisos) {
        super(direccion,precio,nombreDueno);
        this.numeroPisos = numeroPisos;
    }

    public void mostrarDatos(){
        System.out.println("--------Casa-------");
        super.mostrarDatos();
        System.out.println("Numero de pisos: "+numeroPisos);
    }
}
