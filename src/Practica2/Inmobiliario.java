package Practica2;

public class Inmobiliario {
    private String direccion;
    private double precio;
    private String nombreDueno;

    public Inmobiliario(String direccion, double precio, String nombreDueno) {
        this.direccion = direccion;
        this.precio = precio;
        this.nombreDueno = nombreDueno;
    }

    public void mostrarDatos(){
        System.out.println("-----Datos del inmueble------");
        System.out.println("Direccion: "+direccion);
        System.out.println("Precio: "+precio);
        System.out.println("Nombre propietario: "+nombreDueno);
    }
}
