package ExercicioAula2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Agendamento {

    public String dono;
    public LocalDateTime hora;
    public LocalDate data;
    public Animal animal;


    public Agendamento(LocalDateTime hora, LocalDate data, Animal animal) {
        this.hora = hora;
        this.data = data;

    }

    public Agendamento() {
    }

    @Override
    public String toString() {
        return "Agendamento: " +
                "Hora = " + hora +
                " Data = " + data +
                "\n" + animal ;
    }
}
