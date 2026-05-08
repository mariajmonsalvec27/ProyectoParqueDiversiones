package co.edu.uniquindio.poo.programacion1.model;

import co.edu.uniquindio.poo.programacion1.interfaces.IGestionable;
import co.edu.uniquindio.poo.programacion1.interfaces.INotificable;

import java.util.ArrayList;

public class Parque implements INotificable{

    private String nombre;
    private String ubicacion;
    private String horario;
    private boolean climaPeligroso;

    private ArrayList<Zona> zonas;
    private ArrayList<Visitante> visitantes;
    private ArrayList<Empleado> empleados;
    private ArrayList<Atraccion> atracciones;

    public Parque(String nombre, String ubicacion, String horario,  boolean climaPeligroso) {

        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.horario = horario;
        this.climaPeligroso = climaPeligroso;

        this.zonas = new ArrayList<>();
        this.visitantes = new ArrayList<>();
        this.empleados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public boolean isClimaPeligroso() {
        return climaPeligroso;
    }

    public void setClimaPeligroso(boolean climaPeligroso) {
        this.climaPeligroso = climaPeligroso;
    }

    public ArrayList<Zona> getZonas() {
        return zonas;
    }

    public void setZonas(ArrayList<Zona> zonas) {
        this.zonas = zonas;
    }

    public ArrayList<Visitante> getVisitantes() {
        return visitantes;
    }

    public void setVisitantes(ArrayList<Visitante> visitantes) {
        this.visitantes = visitantes;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public ArrayList<Atraccion> getAtracciones() {
        return atracciones;
    }

    public void setAtracciones(ArrayList<Atraccion> atracciones) {
        this.atracciones = atracciones;
    }

    @Override
    public void enviarNotificacion(String mensaje) {

    }
}
