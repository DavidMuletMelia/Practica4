package Practica3.Parte1;

public class Adulto extends Persona {
    //Atributos
    private String NSS = new String();
    private String direccion = new String ();
    //Constructores
    public Adulto(){}

    public Adulto(String nombre, String DNI, int edad, String NSS, String direccion) {
        super(nombre, DNI, edad);
        this.NSS = NSS;
        this.direccion = direccion;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "Adulto{" +
                "nombre='" + getNombre() + '\'' +
                ", DNI='" + getDNI() + '\'' +
                ", edad=" + getEdad() + '\'' +
                "NSS='" + getNSS() + '\'' +
                ", direccion='" + getDireccion() + '\'' +
                '}';
    }
    //Getters y Setters
    public String getNSS() {
        return NSS;
    }

    public void setNSS(String NSS) {
        this.NSS = NSS;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
