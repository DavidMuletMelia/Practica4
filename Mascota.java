package Practica3.Parte2;

public abstract class Mascota implements Sonido {
    //Atributos
    private String nombre = new String();
    private int edad;
    //Constructores
    public Mascota(){}
    public Mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    //Metodo toString
    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    //Otros Metodos
}
