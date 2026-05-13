package co.edu.uniquindio.poo.programacion1.model;

import java.time.LocalDate;

public class TicketFastPass extends Ticket {

    private boolean accesoFastPass;

    public TicketFastPass(int idTicket, double precio, boolean activo, boolean accesoFastPass) {

        super(idTicket, precio, activo);

        this.accesoFastPass = accesoFastPass;
    }

    public boolean isAccesoFastPass() {
        return accesoFastPass;
    }

    public void setAccesoFastPass(boolean accesoFastPass) {
        this.accesoFastPass = accesoFastPass;
    }

    @Override
    public boolean validarAcceso(Visitante visitante) {
        return activo && accesoFastPass;
    }

    public void desactivarFastPass() {
        accesoFastPass = false;
    }

    public void activarFastPass(){
        accesoFastPass = true;
    }

    @Override
    public String toString() {
        return "TicketFastPass{" +
                "idTicket=" + idTicket +
                "accesoFastPass=" + accesoFastPass +
                "activo=" + activo +
                '}';
    }
}
