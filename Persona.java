package Practica3.Parte1;

public abstract class Persona {
    //Atributos
    private String nombre = new String();
    private String DNI = new String();
    private int edad;
    //Constructores
    public Persona(){}
    public Persona(String nombre, String DNI, int edad){
        this.nombre = nombre;
        this.DNI = DNI;
        this.edad = edad;
    }
    //Metodo toString
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                ", edad=" + edad +
                '}';
    }
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
