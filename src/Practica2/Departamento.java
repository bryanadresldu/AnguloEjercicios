package Practica2;

public class Departamento extends Inmobiliario{
    private double area;

    public Departamento(String direccion, double precio, String nombreDueno, double area) {
        super(direccion, precio, nombreDueno);
        this.area=area;
    }
    public void mostrarDatos(){
        System.out.println("---------Departamento-------");
        super.mostrarDatos();
        System.out.println("Area: "+area);
    }
}
