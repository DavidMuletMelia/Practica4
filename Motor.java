package Practica3.Parte2;

public class Motor {
    //Atributos
    private String fabricante;
    private String potencia;
    private Integer codigo;
    //Constructores
    public Motor(String fabricante, String potencia, Integer codigo) {
        this.fabricante = fabricante;
        this.potencia = potencia;
        this.codigo = codigo;
    }
    public Motor(){
    }
    //Metodo to String

    @Override
    public String toString() {
        return "Motor{" +
                "fabricante='" + fabricante + '\'' +
                ", potencia='" + potencia + '\'' +
                ", codigo=" + codigo +
                '}';
    }
    //Getters y Setters
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
}
