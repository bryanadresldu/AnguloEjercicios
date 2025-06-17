package Practica2;

public class Main {
    public static void main(String[] args) {
        Casa casa=new Casa("Quitumbe",504332,"Luis Agurre",4);
        Departamento departamento=new Departamento("Ponceano",100232,"Maria Lopez",120.3);

        casa.mostrarDatos();
        departamento.mostrarDatos();
    }
}
