package Aula5;

import java.math.BigDecimal;

public class Agencia {
    public static void main(String[] args) {
        Conta contaJessica = new Conta("Jessica", "14543", "43560972834", 245.30);
        Conta contaFranklin = new Conta("Franklin", "9743024", "87693467234", 100.0);

        Pix novoPix = new Pix(BigDecimal.TEN, contaJessica, contaFranklin, false);

        novoPix.transferir();
    }


}