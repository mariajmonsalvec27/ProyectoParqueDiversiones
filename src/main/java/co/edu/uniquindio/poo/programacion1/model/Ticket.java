package co.edu.uniquindio.poo.programacion1.model;

import co.edu.uniquindio.poo.programacion1.interfaces.IGestionable;
import co.edu.uniquindio.poo.programacion1.interfaces.IValidable;

import java.time.LocalDate;

public abstract class Ticket implements IValidable {

    protected int idTicket;
    protected double precio;
    protected boolean activo;
    protected LocalDate fechaCompra;

    public Ticket(int idTicket, double precio, boolean activo, LocalDate fechaCompra) {

        this.idTicket = idTicket;
        this.precio = precio;
        this.activo = activo;
        this.fechaCompra = LocalDate.now();

    }

    public int getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    @Override
    public boolean validarAcceso(Visitante visitante){
        return  true;
    }
}
