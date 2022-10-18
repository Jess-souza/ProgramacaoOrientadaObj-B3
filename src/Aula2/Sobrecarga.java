package Aula2;

public class Sobrecarga {
    public static void main(String[] args) {
        int resultadoSoma2Numeros = somarNumeros(10,20);
        int resultadoSoma3Numeros = somarNumeros(10,21,43);

        System.out.println("Soma dos dois números é: "+resultadoSoma2Numeros);
        System.out.println("Soma dos três números é: "+resultadoSoma3Numeros);
    }

    private static int somarNumeros(int valor1, int valor2){
        return valor1+valor2;
    }
    private static int somarNumeros(int valor1, int valor2, int valor3){
        return valor1+valor2+valor3;
    }
}
