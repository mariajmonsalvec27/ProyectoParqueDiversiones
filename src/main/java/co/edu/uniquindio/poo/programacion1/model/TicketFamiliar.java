package co.edu.uniquindio.poo.programacion1.model;

import java.time.LocalDate;

public class TicketFamiliar extends Ticket{

    private int cantidadPersonas;
    private double descuento;

    public TicketFamiliar(int idTicket, double precio, boolean activo, LocalDate fechaCompra, int cantidadPersonas, double descuento) {

        super(idTicket, precio, activo, fechaCompra);

        this.cantidadPersonas = cantidadPersonas;
        this.descuento = descuento;

    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
}
