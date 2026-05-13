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
        this.atracciones = new ArrayList<>();
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

        System.out.println("PARQUE: " + mensaje);

    }

    @Override
    public String toString() {
        return "Parque{" +
                "nombre='" + nombre + '\'' +
                "ubicacion='" + ubicacion + '\'' +
                '}';
    }

    public void agregarEmpleado(Empleado empleado){
       empleados.add(empleado);
    }

    public Empleado buscarEmpleado(int idEmpleado){

        for (Empleado empleado : empleados) {
            if (empleado.getIdEmpleado() == idEmpleado) {
                return empleado;
            }
        }
        return null;
    }

    public boolean eliminarEmpleado(int idEmpleado){

        Empleado empleadoEncontrado = buscarEmpleado(idEmpleado);

        if (empleadoEncontrado != null) {
            empleados.remove(empleadoEncontrado);
            return true;
        }

        return false;
    }

    public void agregarVisitante(Visitante visitante){
        visitantes.add(visitante);
    }

    public Visitante buscarVisitante(String documento){
        for (Visitante visitante : visitantes) {
            if (visitante.getDocumento().equals(documento)) {
                return visitante;
            }
        }
        return null;
    }

    public boolean eliminarVisitante(String documento){

        Visitante visitanteEncontrado = buscarVisitante(documento);
        if (visitanteEncontrado != null) {
            visitantes.remove(visitanteEncontrado);
            return true;
        }
        return false;
    }

    public void agregarAtraccion(Atraccion atraccion){
        atracciones.add(atraccion);
    }

    public Atraccion buscarAtraccion(String nombre){

        for (Atraccion atraccion : atracciones) {
            if (atraccion.getNombre().equals(nombre)) {
                return atraccion;
            }
        }
        return null;
    }

    public boolean eliminarAtraccion(String nombre){

        Atraccion atraccion = buscarAtraccion(nombre);
        if (atraccion != null) {
            atracciones.remove(atraccion);
            return true;
        }
        return false;
    }

    public void agregarZona(Zona zona){
        zonas.add(zona);
    }

    public Zona buscarZona(int idZona){
        for (Zona zona : zonas) {
            if (zona.getIdZona() == idZona) {
                return zona;
            }
        }
        return null;
    }

    public boolean eliminarZona(int idZona){
        Zona zonaEncontrado = buscarZona(idZona);
        if (zonaEncontrado != null) {
            zonas.remove(zonaEncontrado);
            return true;
        }
        return false;
    }








}
