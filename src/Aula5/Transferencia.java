package Aula5;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Transferencia {
private BigDecimal valor;


private Conta contaDestino;
private LocalDate dataTransferencia;
private TipoTransferencia tipoTransferencia;

    public Transferencia(BigDecimal valor, Conta contaDestino, Conta destino, LocalDate dataTransferencia, TipoTransferencia tipoTransferencia) {
        this.valor = valor;
        this.contaDestino = contaDestino;
        this.dataTransferencia = dataTransferencia;
        this.tipoTransferencia = tipoTransferencia;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Conta getContaDestino() {
        return contaDestino;
    }

    public void setContaDestino(Conta contaDestino) {
        this.contaDestino = contaDestino;
    }

    public LocalDate getDataTransferencia() {
        return dataTransferencia;
    }

    public void setDataTransferencia(LocalDate dataTransferencia) {
        this.dataTransferencia = dataTransferencia;
    }

    public TipoTransferencia getTipoTransferencia() {
        return tipoTransferencia;
    }

    public void setTipoTransferencia(TipoTransferencia tipoTransferencia) {
        this.tipoTransferencia = tipoTransferencia;
    }

    public void transferir(){
        System.out.println("Transferencia realizada!");
    }
}
