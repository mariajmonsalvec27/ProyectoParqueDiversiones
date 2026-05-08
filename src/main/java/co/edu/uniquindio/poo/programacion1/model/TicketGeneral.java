package co.edu.uniquindio.poo.programacion1.model;

import java.time.LocalDate;

public class TicketGeneral extends Ticket{

    private int cantidadAtracciones;

    public TicketGeneral(int idTicket, double precio, boolean activo, LocalDate fechaCompra, int cantidadAtracciones){

        super(idTicket, precio, activo, fechaCompra);

        this.cantidadAtracciones = cantidadAtracciones;
    }

    public int getCantidadAtracciones() {
        return cantidadAtracciones;
    }

    public void setCantidadAtracciones(int cantidadAtracciones) {
        this.cantidadAtracciones = cantidadAtracciones;
    }
}
