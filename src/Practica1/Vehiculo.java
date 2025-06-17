package Practica1;

public class Vehiculo {
    private int kilometraje=0;
    private String placa;

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void mostrarDator(){
        System.out.println("-----informacion vehiculo");
        System.out.println("Kilometraje: "+kilometraje);
        System.out.println("placa: "+placa);
    }
}
