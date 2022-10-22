/*Criar classe Mamifero

        * Atributos
        - quantidade de patas

        * Métodos
        - amamentar()
        - construtor
        - get e set*/
package Exercicio4;

public class Mamifero extends Animal {
    private int quatidadeDePatas;

    public Mamifero(String nome, String cor, Ambiente ambiente, Double velocidadeMedia, int quatidadeDePatas) {
        super(nome, cor, ambiente, velocidadeMedia);
        this.quatidadeDePatas = quatidadeDePatas;
    }

    public void amamentar() {
        System.out.printf("O %s realiza amamentação!\n", getNome());
    }
}
