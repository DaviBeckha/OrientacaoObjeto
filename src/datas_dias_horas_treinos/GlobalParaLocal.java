package datas_dias_horas_treinos;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class GlobalParaLocal {
    public static void main(String[] args) {


        LocalDate d04 = LocalDate.parse("2022-07-20");  // formatando
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26"); // formatando
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");


        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault()); // FusoHorário para meu local
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal")); //Zone representa os fusohorário
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));


        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);


        System.out.println("D04 dia = " +  d04.getDayOfMonth());
        System.out.println("D04 mês = " +  d04.getMonthValue());
        System.out.println("D04 ano = " +  d04.getYear());

        System.out.println("d05 hora = " + d05.getHour());
        System.out.println("d05 minutos = " + d05.getMinute());
    }
}
