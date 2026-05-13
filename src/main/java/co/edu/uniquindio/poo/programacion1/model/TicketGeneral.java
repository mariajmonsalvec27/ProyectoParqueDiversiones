package co.edu.uniquindio.poo.programacion1.model;

import java.time.LocalDate;

public class TicketGeneral extends Ticket{

    private int cantidadAtracciones;

    public TicketGeneral(int idTicket, double precio, boolean activo, int cantidadAtracciones){

        super(idTicket, precio, activo);

        this.cantidadAtracciones = cantidadAtracciones;
    }

    public int getCantidadAtracciones() {
        return cantidadAtracciones;
    }

    public void setCantidadAtracciones(int cantidadAtracciones) {
        this.cantidadAtracciones = cantidadAtracciones;
    }

    @Override
    public boolean validarAcceso(Visitante visitante) {

        if(!activo){
            return false;
        }
        return cantidadAtracciones > 0;
    }

    public boolean usarAtraccion(){

        if(cantidadAtracciones > 0){

            cantidadAtracciones--;

            if(cantidadAtracciones == 0){
                activo = false;
            }

            return true;
        }

        return false;
    }

    public boolean verificarDisponibilidad(){

        return cantidadAtracciones > 0;
    }

    @Override
    public String toString() {
        return "TicketGeneral{" +
                "idTicket=" + idTicket +
                "cantidadAtracciones=" + cantidadAtracciones +
                "activo=" + activo +
                '}';
    }




}
