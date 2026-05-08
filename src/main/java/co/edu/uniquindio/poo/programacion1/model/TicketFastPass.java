package co.edu.uniquindio.poo.programacion1.model;

import java.time.LocalDate;

public class TicketFastPass extends Ticket {

    private boolean accesoFastPass;

    public TicketFastPass(int idTicket, double precio, boolean activo, LocalDate fechaCompra, boolean accesoFastPass) {

        super(idTicket, precio, activo, fechaCompra);

        this.accesoFastPass = accesoFastPass;
    }

    public boolean isAccesoFastPass() {
        return accesoFastPass;
    }

    public void setAccesoFastPass(boolean accesoFastPass) {
        this.accesoFastPass = accesoFastPass;
    }
}
