package ExercicioAula3;

public class Main {
    public static void main(String[] args) {
        Piloto pilotoJessica = new Piloto("Jessica", 24, "Blue", Sexo.FEMININO);
        Piloto pilotoFranklin = new Piloto("Franklin", 30, "Red", Sexo.MASCULINO);

        System.out.println(pilotoJessica);
        System.out.println(pilotoFranklin);

        CarroCorrida carroCorridaJessica = new CarroCorrida(2, pilotoJessica, 100, 50, false);

        carroCorridaJessica.ligar();
        carroCorridaJessica.acelerar();
        carroCorridaJessica.frear();
        carroCorridaJessica.parar();
        carroCorridaJessica.desligar();

        System.out.println(carroCorridaJessica);
    }
}
