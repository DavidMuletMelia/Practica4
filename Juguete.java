package Practica3.Parte1;

public class Juguete {
    //Atributos
    private String nombre = new String();
    private int precio;
    private int edadRecomendada;
    //Constructores
    public Juguete(){}
    public Juguete(String nombre, int precio, int edadRecomendada) {
        this.nombre = nombre;
        this.precio = precio;
        this.edadRecomendada = edadRecomendada;
    }
    //Metodo toString
    @Override
    public String toString() {
        return "Juguete{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio + '\''+
                ", edadRecomendada=" + edadRecomendada +
                '}';
    }
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getEdadRecomendada() {
        return edadRecomendada;
    }

    public void setEdadRecomendada(int edadRecomendada) {
        this.edadRecomendada = edadRecomendada;
    }
}
