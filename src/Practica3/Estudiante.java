package Practica3;

public class Estudiante extends Persona{

    private String carrera;
    private String semestre;

    public Estudiante(String nombre, String numeroCedula, String direccion, String carrera, String semestre) {
        super(nombre, numeroCedula, direccion);
        this.carrera = carrera;
        this.semestre = semestre;
    }
    public  void mostrarDatos(){
        System.out.println("---------ESTUDIANTE----------");
        super.mostrarDatos();
        System.out.println("Carrera: "+carrera);
        System.out.println("Semestre: "+semestre);
    }

}
