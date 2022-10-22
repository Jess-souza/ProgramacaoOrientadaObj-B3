package Exercicio4;

public class Main {
    public static void main(String[] args) {
        Mamifero camelo = new Mamifero("Camelo", "Marrom", Ambiente.TERRA, 65.0, 4);
        Ave pinguim = new Ave("Pinguim", "Preto e Branco", Ambiente.GELO, 7.9, true);

        camelo.amamentar();
        pinguim.voa();
    }
}
