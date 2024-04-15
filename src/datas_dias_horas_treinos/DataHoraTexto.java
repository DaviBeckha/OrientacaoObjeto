package datas_dias_horas_treinos;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataHoraTexto {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2022-07-20");  // formatando
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26"); // formatando
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // formatar data
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); //Formatar data global
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_INSTANT; //Formatador que está  no site da Oracle(UTC)

        System.out.println("d04= "+ d04.format(fmt1));
        System.out.println("d04= "+ fmt1.format(d04));

        System.out.println("d05= "+ d05.format(fmt1));
        System.out.println("d05= "+ d05.format(fmt2));
        System.out.println("d06= "+ fmt3.format(d06));
        System.out.println("d06= "+ fmt4.format(d06));


    }
}
