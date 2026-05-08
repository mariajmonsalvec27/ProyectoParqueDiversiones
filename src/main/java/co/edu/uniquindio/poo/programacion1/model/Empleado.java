package co.edu.uniquindio.poo.programacion1.model;

public class Empleado extends Persona{

    private double salario;
    private String horario;
    private int idEmpleado;

    public Empleado(String nombre, String documento, int edad, double salario, String horario, int idEmpleado) {

        super(nombre, documento, edad);
        this.salario = salario;
        this.horario = horario;
        this.idEmpleado = idEmpleado;

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
}
