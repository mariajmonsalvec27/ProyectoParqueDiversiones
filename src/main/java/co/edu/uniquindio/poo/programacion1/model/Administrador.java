package co.edu.uniquindio.poo.programacion1.model;

import co.edu.uniquindio.poo.programacion1.interfaces.INotificable;

public class Administrador extends Empleado implements INotificable {

    private String usuario;
    private String contrasenia;

    public Administrador(String nombre, String documento, int edad, double salario, String horario, int idEmpleado, String usuario, String contrasenia) {

        super(nombre, documento, edad, salario, horario, idEmpleado);
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    @Override
    public void enviarNotificacion(String mensaje) {

        System.out.println("Notificacion enviada: " + mensaje);
    }

    @Override
    public String toString(){

        return "Administrador{" +
                "Nombre= " + getNombre() + '\'' +
                "usuario= " + usuario + '\'' +
                "id = " + getIdEmpleado() + '}';

    }

    public boolean iniciarSesion(String usuario, String contrasenia) {
        return this.usuario.equals(usuario)
                && this.contrasenia.equals(contrasenia);
    }


}


