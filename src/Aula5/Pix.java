package Aula5;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Pix extends Transferencia {
    private boolean devolvida;
    private BigDecimal valorLimiteNoturno;

    public Pix(
            BigDecimal valor,
            Conta contaOrigem,
            Conta contaDestino,
            boolean devolvida
    ) {
        super(valor, contaOrigem, contaDestino, LocalDate.now(), TipoTransferencia.PIX);
        this.devolvida = devolvida;
        this.valorLimiteNoturno = BigDecimal.valueOf(1000.0);
    }



    public void devolverDinheiro() {
        System.out.println("Devolver dinheiro!");
    }

    @Override
    public void transferir(){
        System.out.println("Transferencia pix realizada!");
    }
}
