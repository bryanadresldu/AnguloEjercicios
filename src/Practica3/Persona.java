package Practica3;

public class Persona {
    private String nombre;
    private String numeroCedula;
    private String direccion;

    public Persona(String nombre, String numeroCedula, String direccion) {
        this.nombre = nombre;
        this.numeroCedula = numeroCedula;
        this.direccion = direccion;
    }

    public void setNumeroCedula(String numeroCedula) {
        this.numeroCedula = numeroCedula;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public  void mostrarDatos(){
        System.out.println("---------INFORMACION REGISTRADA----------");
        System.out.println("Nombre: "+nombre);
        System.out.println("Numero de cedula: "+numeroCedula);
        System.out.println("Direccion: "+direccion);
    }
}
