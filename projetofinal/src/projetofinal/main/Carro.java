package projetofinal.main;

public class Carro {

    private String marca;
    private String modelo;

    // Construtor privado
    Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Método de fábrica para criar um novo carro
    public static Carro criarCarro(String marca, String modelo) {
        return new Carro(marca, modelo);
    }

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
