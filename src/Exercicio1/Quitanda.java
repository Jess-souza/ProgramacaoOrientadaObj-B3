// Abstraia fruta para o sistema de quitanda
// Os seguintes atributos devem ser considerados
// Crie a fruta banana e maça
//---- nome
//---- cor
//---- quantidade

// Abstraia verdura para o sistema de quitanda
// Os seguintes atributos devem ser considerados
// Crie a verdura alface e couve
//---- nome
//---- cor
//---- quantidade

// Criar mais um objeto que faça sentido pra aplicação

package Exercicio1;

public class Quitanda {
    public static void main(String[] args) {
        Fruta banana = new Fruta();
        banana.nome = "Banana Nanica";
        banana.cor = "Amarelo";
        banana.quantidade = 14;
        banana.imprimirDados();

        Fruta maça = new Fruta();
        maça.nome = "Maça Gala";
        maça.cor = "Vermelho";
        maça.quantidade = 29;
        System.out.print("\n----------------------//----------------------//----------------------\n");
        maça.imprimirDados();

        Verdura alface = new Verdura();
        alface.nome = "Alface Americana";
        alface.cor = "Verde";
        alface.quantidade = 17;
        System.out.print("\n----------------------//----------------------//----------------------\n");
        alface.imprimirDados();

        Verdura couve = new Verdura();
        couve.nome = "Couve Manteiga";
        couve.cor = "Verde";
        couve.quantidade = 19;
        System.out.print("\n----------------------//----------------------//----------------------\n");
        couve.imprimirDados();

        Legume chuchu = new Legume();
        chuchu.nome = "Chuchu";
        chuchu.cor = "Verde";
        chuchu.quantidade = 23;
        System.out.print("\n----------------------//----------------------//----------------------\n");
        chuchu.imprimirDados();

        Legume tomate = new Legume();
        tomate.nome = "Tomate Italiano";
        tomate.cor = "Vermelho";
        tomate.quantidade = 29;
        System.out.print("\n----------------------//----------------------//----------------------\n");
        tomate.imprimirDados();

        System.out.print("\n----------------------//----------------------//----------------------\n");
        int quantidadeEstoque = tomate.quantidade + chuchu.quantidade + maça.quantidade + couve.quantidade + banana.quantidade + alface.quantidade;
        System.out.println("A quantidade de produtos em estoque é: " + quantidadeEstoque);
    }
}
