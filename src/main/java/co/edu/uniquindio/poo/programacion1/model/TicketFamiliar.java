package co.edu.uniquindio.poo.programacion1.model;

import java.time.LocalDate;

public class TicketFamiliar extends Ticket{

    private int cantidadPersonas;
    private double descuento;

    public TicketFamiliar(int idTicket, double precio, boolean activo, int cantidadPersonas, double descuento) {

        super(idTicket, precio, activo);

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
        if(descuento >= 0 && descuento <= 1){
            this.descuento = descuento;
        }
    }

    @Override
    public boolean validarAcceso(Visitante visitante) {
        return activo && cantidadPersonas > 0;
    }

    public boolean usarEntrada(){

        if(cantidadPersonas > 0){

            cantidadPersonas--;

            if(cantidadPersonas == 0){
                activo = false;
            }

            return true;
        }

        return false;
    }

    public double calcularPrecioConDescuento(){

        return precio - (precio * descuento);
    }

    @Override
    public String toString() {
        return "TicketFamiliar{" +
                "idTicket=" + idTicket +
                "cantidadPersonas=" + cantidadPersonas +
                "descuento=" + descuento +
                "activo=" + activo +
                '}';
    }

}
