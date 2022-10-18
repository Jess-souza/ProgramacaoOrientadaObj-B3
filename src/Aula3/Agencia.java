package Aula3;

public class Agencia {
    public static void main(String[] args) {
        Conta contaJessica = new Conta("Jessica", "14543", "43560972834", 245.30);
        Conta contaFranklin = new Conta("Franklin", "9743024", "87693467234", 100.0);

        sacar(23.40, contaJessica);

        transferir(67.0, contaJessica, contaFranklin);

        pagar(329.50, contaJessica);

        contaJessica.getTitular();

        System.out.println(contaJessica);
        System.out.println(contaFranklin);
    }

    public static void sacar(Double valor, Conta conta) {
        Double novoSaldo = conta.getSaldo() - valor;

        conta.setSaldo(novoSaldo);
    }

    public static void transferir(Double valor, Conta contaOrigem, Conta contaDestino) {
        Double novoSaldoContaOrigem = contaOrigem.getSaldo() - valor;
        contaOrigem.setSaldo(novoSaldoContaOrigem);

        Double novoSaldoContaDestino = contaDestino.getSaldo() + valor;
        contaDestino.setSaldo(novoSaldoContaDestino);
    }

    public static void pagar(Double valor, Conta conta) {
        Double novoSaldo = conta.getSaldo() - valor;

        conta.setSaldo(novoSaldo);
    }
}
