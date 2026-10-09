package br.edu.fatecpg.autodrive.view;
import br.edu.fatecpg.autodrive.model.Carro;

public class Main {

    public static void main(String[] args) {
        Carro novocarro = new Carro("Ford", "Ka", 2022);

        System.out.println("Marca: " + novocarro.marca + "\nModelo: " + novocarro.modelo + "\nAno: " + novocarro.ano);
    }
}