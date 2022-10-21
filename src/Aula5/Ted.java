package Aula5;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class Ted extends Transferencia {
    private LocalTime horaLimite;

    public Ted(BigDecimal valor, Conta contaDestino, LocalDate dataTransferencia, TipoTransferencia tipoTransferencia, LocalTime horaLimite) {
        super(valor, contaDestino, contaDestino, dataTransferencia, tipoTransferencia);
        this.horaLimite = horaLimite;
    }
}
