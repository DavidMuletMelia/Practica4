package Practica3.Parte1;

public class Niño extends Persona {
    //Atributos
    private String colegio = new String();
    private Juguete juguete = new Juguete();
    //Constructores
    public Niño(){}

    public Niño(String nombre, String DNI, int edad, String colegio, Juguete juguete) {
        super(nombre, DNI, edad);
        this.colegio = colegio;
        this.juguete = juguete;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "Niño{" +
                "nombre='" + getNombre() + '\'' +
                ", DNI='" + getDNI() + '\'' +
                ", edad=" + getEdad() + '\'' +
                "colegio='" + getColegio() + '\'' +
                ", juguete=" + getJuguete() +
                '}';
    }
    //Getters y Setters
    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    public Juguete getJuguete() {
        return juguete;
    }

    public void setJuguete(Juguete juguete) {
        this.juguete = juguete;
    }

    //Otros metodos
    public void comprar(Juguete juguete){
        this.juguete = juguete;
    }
}
