package Practica3.Parte2;

public class Gato extends Mascota{
    //Atributos
    private String raza = new String();
    //Constructores
    public Gato(){}
    public Gato(String nombre, int edad, String raza) {
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setRaza(raza);
    }
    //Metodo toString
    @Override
    public String toString() {
        return "Gato{" +
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
