package Exercicio2;

public class Animal {
    public String especie;
    public String nomePet;
    public String dono;
    public int idade;

    public Animal(String especie, String nomePet, String dono) {
        this.especie = especie;
        this.nomePet = nomePet;
        this.dono = dono;
    }

    public Animal() {
    }

    @Override
    public String toString() {
        return "Animal: " +
                "Especie = " + especie + '\'' +
                " Nome do Pet = " + nomePet + '\'' +
                " Dono = " + dono + '\'' +
                " Idade = " + idade ;
    }
}
