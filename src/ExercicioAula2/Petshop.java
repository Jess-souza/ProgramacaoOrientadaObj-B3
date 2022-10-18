package ExercicioAula2;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Petshop {
    public static void main(String[] args) {
        Animal gato = new Animal();
        gato.especie = "Gato Bengal";
        gato.nomePet = "Naninho";
        gato.dono = "Franklin";
        gato.idade = 4;
        System.out.println(gato);


        Agendamento agenda = new Agendamento(LocalDateTime.now(),LocalDate.now(),gato);
        agenda.animal = gato;
        System.out.println(agenda);


    }


}
