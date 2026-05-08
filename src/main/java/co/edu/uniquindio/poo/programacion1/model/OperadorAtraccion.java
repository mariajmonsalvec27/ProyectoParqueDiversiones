package co.edu.uniquindio.poo.programacion1.model;

public class OperadorAtraccion extends Empleado{

    private boolean disponible;
    private Atraccion atraccionAsignada;

    public OperadorAtraccion (String nombre, String documento, int edad, double salario, String horario, int idEmpleado) {

        super(nombre, documento, edad, salario, horario, idEmpleado);
        this.disponible = false;
        this.atraccionAsignada = new Atraccion( 1001, "Brinca brinca", 7, 10, 6,
        4, 168, 10);
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
}
