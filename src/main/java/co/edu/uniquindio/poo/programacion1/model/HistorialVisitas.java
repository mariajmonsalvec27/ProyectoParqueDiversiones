package co.edu.uniquindio.poo.programacion1.model;

import java.time.LocalDate;

public class HistorialVisitas {

    private int idHistorial;
    private int cantidadVisitas;
    private LocalDate fechaVisita;

    private Visitante visitante;
    private Atraccion atraccion;

    public HistorialVisitas(int idHistorial, int cantidadVisitas, LocalDate fechaVisita, Visitante visitante, Atraccion atraccion) {

        this.idHistorial = idHistorial;
        this.cantidadVisitas = cantidadVisitas;
        this.fechaVisita = fechaVisita;
        this.visitante = visitante;
        this.atraccion = atraccion;
    }

    public int getIdHistorial() {
        return idHistorial;
    }

    public void setIdHistorial(int idHistorial) {
        this.idHistorial = idHistorial;
    }

    public int getCantidadVisitas() {
        return cantidadVisitas;
    }

    public void setCantidadVisitas(int cantidadVisitas) {
        this.cantidadVisitas = cantidadVisitas;
    }

    public LocalDate getFechaVisita() {
        return fechaVisita;
    }

    public void setFechaVisita(LocalDate fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

    public Visitante getVisitante() {
        return visitante;
    }

    public void setVisitante(Visitante visitante) {
        this.visitante = visitante;
    }

    public Atraccion getAtraccion() {
        return atraccion;
    }

    public void setAtraccion(Atraccion atraccion) {
        this.atraccion = atraccion;
    }

    public void registrarVisita(){
        cantidadVisitas++;
    }

    public void reiniciarHistorial(){
        cantidadVisitas = 0;
    }

    @Override
    public String toString() {
        return "HistorialVisitas{" +
                "idHistorial=" + idHistorial +
                "visitante=" + visitante.getNombre() +
                "atraccion=" + atraccion.getNombre() +
                "cantidadVisitas=" + cantidadVisitas +
                '}';
    }
}