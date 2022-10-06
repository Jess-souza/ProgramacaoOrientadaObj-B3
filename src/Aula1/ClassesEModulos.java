package Aula1;//quando um atributo possui o static, significa que ele é da classe, p chamar como main
//basta o nome da classe e um ponto, ex: Funcionario. (só q o Static não muda!)

import Aula1.Carro;
import Aula1.Funcionario;

public class ClassesEModulos {
    public static void main(String[] args) {
        darOi();
        System.out.print("----------------------//----------------------//----------------------\n");
        Integer resultadoSoma = soma(10, 20);
        System.out.println("O resultado da soma de %f e é: " + resultadoSoma);
        System.out.print("----------------------//----------------------//----------------------\n");

        Funcionario gerente = new Funcionario();
        gerente.salario = 10000;
        gerente.bonus = 500;
        gerente.desconto = 850;
        gerente.nome = "Jessica";
        double pagamento = gerente.calcularPagamento();
        System.out.printf("O valor de pagamento do(a) gerente %s é: R$%.2f\n", gerente.nome, pagamento);
        System.out.print("----------------------//----------------------//----------------------\n");

        Funcionario aprendiz = new Funcionario();
        aprendiz.salario = 1200;
        aprendiz.bonus = 70;
        aprendiz.desconto = 50;
        aprendiz.nome = "Gabriela";
        double pagamentoAprendiz = aprendiz.calcularPagamento();
        System.out.printf("O valor de pagamento do(a) aprendiz %s é: R$%.2f\n", aprendiz.nome, pagamentoAprendiz);
        System.out.print("----------------------//----------------------//----------------------\n");

        Carro fusca = new Carro();
        fusca.cor = "Azul";
        fusca.marca = "Volkswagen";
        fusca.numeroPortas = 2;
        fusca.placa = "ABD7G";
        System.out.printf("Dados fusca\nCor: %s\nMarca: %s\nNum de portas: %d\nPlaca: %s",fusca.cor,fusca.marca,fusca.numeroPortas,fusca.placa);

        Carro celta = new Carro();
        celta.cor = "Cinza";
        celta.marca = "Chevrolet";
        celta.numeroPortas = 4;
        celta.placa = "FDF9A";
        System.out.print("\n----------------------//----------------------//----------------------\n");
        System.out.printf("Dados celta\nCor: %s\nMarca: %s\nNum de portas: %d\nPlaca: %s",celta.cor,celta.marca,celta.numeroPortas,celta.placa);

    }

    private static void darOi() {
        System.out.println("Oi");
    }

    public static Integer soma(Integer valor1, Integer valor2) {
        Integer resultadoSoma = valor1 + valor2;
        return resultadoSoma;
    }
}