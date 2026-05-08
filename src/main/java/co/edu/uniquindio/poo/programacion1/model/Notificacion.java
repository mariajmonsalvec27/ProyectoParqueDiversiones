package co.edu.uniquindio.poo.programacion1.model;

import java.time.LocalDate;

public class Notificacion {

    private int idNotificacion;
    private String mensaje;
    private LocalDate fecha;
    private boolean leida;

    private TipoNotificacion tipo;

    public Notificacion(int idNotificacion, String mensaje, LocalDate fecha, TipoNotificacion tipo) {

        this.idNotificacion = idNotificacion;
        this.mensaje = mensaje;
        this.fecha = fecha;
        this.leida = false;
        this.tipo = tipo;

    }

    public int getIdNotificacion() {
        return idNotificacion;
    }

    public void setIdNotificacion(int idNotificacion) {
        this.idNotificacion = idNotificacion;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public boolean isLeida() {
        return leida;
    }

    public void setLeida(boolean leida) {
        this.leida = leida;
    }

    public TipoNotificacion getTipo() {
        return tipo;
    }

    public void setTipo(TipoNotificacion tipo) {
        this.tipo = tipo;
    }
}
