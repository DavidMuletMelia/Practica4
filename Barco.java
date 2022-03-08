package Practica3.Parte2;
import java.util.Date;

public class Barco implements Sonido{
    //Atributos
    private String nombre;
    private Date fechaConstruccion;
    private Integer numCamarotes;
    private  Motor motor = new Motor();
    //Constructores
    public Barco(){
        Motor motor = new Motor();
    }
    public Barco(String nombre, Date fechaConstruccion, Integer numCamarotes, Motor motor) {
        this.nombre = nombre;
        this.fechaConstruccion = fechaConstruccion;
        this.numCamarotes = numCamarotes;
        this.motor = motor;
    }
    //Metodo toString

    @Override
    public String toString() {
        return "Barco{" +
                "nombre='" + nombre + '\'' +
                ", fechaConstruccion=" + fechaConstruccion +
                ", numCamarotes=" + numCamarotes +
                ", motor=" + motor +
                '}';
    }
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaConstruccion() {
        return fechaConstruccion;
    }

    public void setFechaConstruccion(Date fechaConstruccion) {
        this.fechaConstruccion = fechaConstruccion;
    }

    public Integer getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(Integer numCamarotes) {
        this.numCamarotes = numCamarotes;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    //Otros metodos
    public void sonido(){}
}
