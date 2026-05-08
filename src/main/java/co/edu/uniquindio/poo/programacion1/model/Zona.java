package co.edu.uniquindio.poo.programacion1.model;

import java.util.ArrayList;

public class Zona {

    private int idZona;
    private String nombre;
    private String descripcion;
    private boolean activa;
    private int capacidadMaxima;

    private ArrayList<Atraccion> atracciones;

    public Zona(int idZona, String nombre, String descripcion, boolean activa, int capacidadMaxima) {

        this.idZona = idZona;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.activa = activa;
        this.capacidadMaxima = capacidadMaxima;
        this.atracciones = new ArrayList<>();
    }

    public int getIdZona() {
        return idZona;
    }

    public void setIdZona(int idZona) {
        this.idZona = idZona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public ArrayList<Atraccion> getAtracciones() {
        return atracciones;
    }

    public void setAtracciones(ArrayList<Atraccion> atracciones) {
        this.atracciones = atracciones;
    }
}
