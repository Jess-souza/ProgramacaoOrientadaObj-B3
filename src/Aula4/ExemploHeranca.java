package Aula4;

import java.math.BigDecimal;

public class ExemploHeranca {

    public static void main(String[] args) {
        Gerente gerente = new Gerente("Angela", 123, BigDecimal.TEN);

        Estagiario estagiario = new Estagiario("ana", 12, BigDecimal.ONE);
        estagiario.pegarCafe();

        gerente.contratar(estagiario);
        System.out.println(gerente);
    }
}
