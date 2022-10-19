package ExercicioAula3;

public class Main {
    public static void main(String[] args) {
        Piloto pilotoJessica = new Piloto("Jessica", 24, "Blue", Sexo.Feminino);
        Piloto pilotoFranklin = new Piloto("Frankklin", 30, "Red", Sexo.Masculino);

        System.out.println(pilotoJessica);
        System.out.println(pilotoFranklin);

        CarroCorrida carroCorridaJessica = new CarroCorrida(2, pilotoJessica, 100, 50, false);

        carroCorridaJessica.acelerar();

        System.out.println(carroCorridaJessica);
    }

}
