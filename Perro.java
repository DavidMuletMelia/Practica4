package Practica3.Parte2;

public class Perro extends Mascota {
    //Atributos
    private String raza = new String();
    //Constructores
    public Perro(){}

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "Perro{" +
                "nombre='" + getNombre() + '\'' +
                ", edad=" + getEdad() + '\'' +
                "raza='" + getRaza() + '\'' +
                '}';
    }
    //Getters y Setters

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    //Otros metodos

    @Override
    public void sonido(){}
}
