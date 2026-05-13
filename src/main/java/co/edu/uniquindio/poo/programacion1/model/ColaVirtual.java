package co.edu.uniquindio.poo.programacion1.model;

import co.edu.uniquindio.poo.programacion1.interfaces.IGestionable;
import co.edu.uniquindio.poo.programacion1.interfaces.IValidable;

import java.util.ArrayList;

public class ColaVirtual implements IGestionable {

    private int idColaEspera;
    private int capacidadMaxima;
    private int tiempoEstimadoEspera;
    private boolean activa;

    private Atraccion atraccion;
    private ArrayList<Visitante> visitantesEsperando;

    public ColaVirtual(int idColaEspera, int capacidadMaxima, int tiempoEstimadoEspera,  boolean activa) {


        this.idColaEspera = idColaEspera;
        this.capacidadMaxima = capacidadMaxima;
        this.tiempoEstimadoEspera = tiempoEstimadoEspera;
        this.activa = activa;
        this.visitantesEsperando = new ArrayList<>();

    }

    public int getIdColaEspera() {
        return idColaEspera;
    }

    public void setIdColaEspera(int idColaEspera) {
        this.idColaEspera = idColaEspera;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getTiempoEstimadoEspera() {
        return tiempoEstimadoEspera;
    }

    public void setTiempoEstimadoEspera(int tiempoEstimadoEspera) {
        this.tiempoEstimadoEspera = tiempoEstimadoEspera;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public Atraccion getAtraccion() {
        return atraccion;
    }

    public void setAtraccion(Atraccion atraccion) {
        this.atraccion = atraccion;
    }

    public ArrayList<Visitante> getVisitantesEsperando() {
        return visitantesEsperando;
    }

    public void setVisitantesEsperando(ArrayList<Visitante> visitantesEsperando) {
        this.visitantesEsperando = visitantesEsperando;
    }

    @Override
    public void abrir(){
        activa = true;
    }

    @Override
    public void cerrar(){
        activa = false;
    }

    @Override
    public void cambiarEstado(String estado){

        if(estado.equalsIgnoreCase("ACTIVA")){
            activa = true;
        }

        else if(estado.equalsIgnoreCase("CERRADA")){
            activa = false;
        }
    }

    public boolean agregarVisitante(Visitante visitante){

        if(activa && visitantesEsperando.size() < capacidadMaxima){

            visitantesEsperando.add(visitante);
            return true;
        }

        return false;
    }

    public boolean removerVisitante(Visitante visitante){

        return visitantesEsperando.remove(visitante);
    }

    public int obtenerCantidadVisitantes(){
        return visitantesEsperando.size();
    }

    public boolean colaLlena(){
        return visitantesEsperando.size() >= capacidadMaxima;
    }

    @Override
    public String toString() {
        return "ColaVirtual{" +
                "idColaEspera=" + idColaEspera +
                ", activa=" + activa +
                ", visitantesEnEspera=" + visitantesEsperando.size() +
                '}';
    }

}
