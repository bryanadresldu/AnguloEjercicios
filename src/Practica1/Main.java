package Practica1;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo=new  Vehiculo();
        vehiculo.mostrarDator();
        System.out.println("Cambio kilometraje");
        vehiculo.setKilometraje(80);
        vehiculo.setPlaca("ABDJ323");

        vehiculo.mostrarDator();
    }
}
