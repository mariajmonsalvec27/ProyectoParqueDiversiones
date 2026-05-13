package co.edu.uniquindio.poo.programacion1.model;

public class OperadorAtraccion extends Empleado{

    private boolean disponible;
    private Atraccion atraccionAsignada;

    public OperadorAtraccion (String nombre, String documento, int edad, double salario, String horario, int idEmpleado) {

        super(nombre, documento, edad, salario, horario, idEmpleado);
        this.disponible = false;
        this.atraccionAsignada = null;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Atraccion getAtraccionAsignada() {
        return atraccionAsignada;
    }

    public void setAtraccionAsignada(Atraccion atraccionAsignada) {
        this.atraccionAsignada = atraccionAsignada;
    }

    public void asignarAtraccion(Atraccion atraccion){

        atraccionAsignada = atraccion;
        disponible = false;
    }

    public void liberarAtraccion(){

        atraccionAsignada = null;
        disponible = true;
    }

    public boolean verificarDisponibilidad(){
        return disponible;
    }

    @Override
    public String toString() {
        return "OperadorAtraccion{" +
                "nombre='" + getNombre() + '\'' +
                "disponible=" + disponible +
                '}';
    }
}
