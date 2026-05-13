package co.edu.uniquindio.poo.programacion1.model;

import co.edu.uniquindio.poo.programacion1.interfaces.IGestionable;
import co.edu.uniquindio.poo.programacion1.interfaces.IValidable;

public class Atraccion implements IGestionable, IValidable{

    //atributos basicos de las atracciones
    private int id;
    private String nombre;
    private int capacidadMaxima;
    private double estaturaMinima;
    private int edadMinima;

    //cantidad de personas dentro de la atraccion y la cantidad de personas que la han montado
    private int visitantesDentroAtraccion;
    private int visitantesTotalesDeAtraccion;

    //tiempo de espera de la atraccion
    private int tiempoEspera;

    //estado y tipo de la atraccion + el operador que la maneja
    private EstadoAtraccion estadoAtraccion;
    private TipoAtraccion tipoAtraccion;
    private OperadorAtraccion operadorAtraccion;

    public Atraccion(int id, String nombre, int capacidadMaxima, double estaturaMinima, int edadMinima,
                     int visitantesDentroAtraccion, int visitantesTotalesDeAtraccion, int tiempoEspera) {

        this.id = id;
        this.nombre = nombre;
        this.capacidadMaxima = capacidadMaxima;
        this.estaturaMinima = estaturaMinima;
        this.edadMinima = edadMinima;
        this.visitantesDentroAtraccion = visitantesDentroAtraccion;
        this.visitantesTotalesDeAtraccion = visitantesTotalesDeAtraccion;
        this.tiempoEspera = tiempoEspera;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getEstaturaMinima() {
        return estaturaMinima;
    }

    public void setEstaturaMinima(double estaturaMinima) {
        this.estaturaMinima = estaturaMinima;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public int getVisitantesDentroAtraccion() {
        return visitantesDentroAtraccion;
    }

    public void setVisitantesDentroAtraccion(int visitantesDentroAtraccion) {
        this.visitantesDentroAtraccion = visitantesDentroAtraccion;
    }

    public int getVisitantesTotalesDeAtraccion() {
        return visitantesTotalesDeAtraccion;
    }

    public void setVisitantesTotalesDeAtraccion(int visitantesTotalesDeAtraccion) {
        this.visitantesTotalesDeAtraccion = visitantesTotalesDeAtraccion;
    }

    public int getTiempoEspera() {
        return tiempoEspera;
    }

    public void setTiempoEspera(int tiempoEspera) {
        this.tiempoEspera = tiempoEspera;
    }

    public EstadoAtraccion getEstadoAtraccion() {
        return estadoAtraccion;
    }

    public void setEstadoAtraccion(EstadoAtraccion estadoAtraccion) {
        this.estadoAtraccion = estadoAtraccion;
    }

    public TipoAtraccion getTipoAtraccion() {
        return tipoAtraccion;
    }

    public void setTipoAtraccion(TipoAtraccion tipoAtraccion) {
        this.tipoAtraccion = tipoAtraccion;
    }

    public OperadorAtraccion getOperadorAtraccion() {
        return operadorAtraccion;
    }

    public void setOperadorAtraccion(OperadorAtraccion operadorAtraccion) {
        this.operadorAtraccion = operadorAtraccion;
    }

    @Override
    public void abrir(){
        estadoAtraccion = EstadoAtraccion.ACTIVA;
    }

    @Override
    public void cerrar(){
        estadoAtraccion = EstadoAtraccion.CERRADA;
    }

    @Override
    public void cambiarEstado(String estado){

        if(estado.equalsIgnoreCase("ACTIVA")){
            estadoAtraccion = EstadoAtraccion.ACTIVA;
        }

        else if(estado.equalsIgnoreCase("CERRADA")){
            estadoAtraccion = EstadoAtraccion.CERRADA;
        }

        else if(estado.equalsIgnoreCase("MANTENIMIENTO")){
            estadoAtraccion = EstadoAtraccion.MANTENIMIENTO;
        }
    }

    @Override
    public boolean validarAcceso(Visitante visitante){

        if(estadoAtraccion != EstadoAtraccion.ACTIVA){
            return false;
        }

        if(visitantesDentroAtraccion >= capacidadMaxima){
            return false;
        }

        if(visitante.getEdad() < edadMinima){
            return false;
        }

        if(visitante.getEstatura() < estaturaMinima){
            return false;
        }
        return true;
    }

    public boolean ingresarVisitante(Visitante visitante){

        if(validarAcceso(visitante)){

            visitantesDentroAtraccion++;
            visitantesTotalesDeAtraccion++;
            return true;
        }
        return false;
    }

    public void salirVisitante(Visitante visitante){

        if(visitantesDentroAtraccion > 0){
            visitantesDentroAtraccion--;
        }
    }

    @Override
    public String toString() {
        return "Atraccion{" +
                "id=" + id +
                "nombre='" + nombre + '\'' +
                "estado=" + estadoAtraccion +
                '}';
    }



}
