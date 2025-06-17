package Practica3;

public class Docente extends Persona {
    private int numeroMaterias;

    public Docente(String nombre, String numeroCedula, String direccion, int numeroMaterias) {
        super(nombre, numeroCedula, direccion);
        this.numeroMaterias = numeroMaterias;
    }

    public  void mostrarDatos(){
        System.out.println("---------DOCENTE----------");
        super.mostrarDatos();
        System.out.println("Numero de materias: "+numeroMaterias);
    }
}
