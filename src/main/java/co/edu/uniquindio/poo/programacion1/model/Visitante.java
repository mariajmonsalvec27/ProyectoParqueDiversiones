package co.edu.uniquindio.poo.programacion1.model;

public class Visitante extends Persona{

    private double estatura;
    private double saldoVirtual;

    private  Ticket ticket;
    private boolean accesoFastPass;

    public Visitante(String nombre, String documento, int edad, double estatura, double saldoVirtual, boolean accesoFastPass) {

        super(nombre, documento, edad);
        this.estatura = estatura;
        this.saldoVirtual = saldoVirtual;

        this.accesoFastPass = accesoFastPass;


    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getSaldoVirtual() {
        return saldoVirtual;
    }

    public void setSaldoVirtual(double saldoVirtual) {
        this.saldoVirtual = saldoVirtual;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public boolean isAccesoFastPass() {
        return accesoFastPass;
    }

    public void setAccesoFastPass(boolean accesoFastPass) {
        this.accesoFastPass = accesoFastPass;
    }

    public void recargarSaldo(double saldoRecarga){

        if(saldoRecarga > 0){
            saldoVirtual += saldoRecarga;
        }
    }

    public boolean descontarSaldo(double valor){

        if(saldoVirtual >= valor){
            saldoVirtual -= valor;
            return true;
        }
        return false;
    }

    public boolean tieneTicket(){

        return ticket != null;
    }

    public boolean puedeUsarFastPass(){
        return accesoFastPass;
    }

    @Override
    public String toString() {
        return "Visitante{" +
                "nombre='" + getNombre() + '\'' +
                "documento='" + getDocumento() + '\'' +
                "saldo=" + saldoVirtual +
                '}';
    }



}
