package datas_dias_horas_treinos;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculoDataHora {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2022-07-20");  // formatando
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26"); // formatando
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");


        LocalDate semanaPassada = d04.minusDays(7); // 7 dias para diminuir
        LocalDate semanaQueVem = d04.plusDays(7);


        System.out.println("Semana passada: "+ semanaPassada);
        System.out.println("Semana que vem: " + semanaQueVem);
        System.out.println();

        LocalDateTime semanaPassadaTempo = d05.minusDays(7); // 7 dias para diminuir
        LocalDateTime semanaQueVemTempo = d05.plusDays(7); // adicionar 7 dias


        System.out.println("Semana passada Tempo: "+semanaPassadaTempo);
        System.out.println("Semana que vem tempo: "+semanaQueVemTempo);
        System.out.println();


        Instant semanaPassadaInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant semanaQueVemInstant = d06.plus(7,ChronoUnit.DAYS);

        System.out.println("Semana passada Instant: "+ semanaPassadaInstant);
        System.out.println("Semana que vem Instant: "+ semanaQueVemInstant);
        System.out.println();

        System.out.println("----------------------------DURAÇÃO ENTRE ELES------------------------------");

        Duration t1 = Duration.between(semanaPassadaTempo, d05);   // Para ver a duração entre eles.
        Duration t2 = Duration.between(semanaPassada.atTime(0,0) , d04.atTime(0,0));   // AtTime para converter para LocaldateTime.
        Duration t3 = Duration.between(semanaPassadaInstant, d06);   // Para ver a duração entre eles.
        Duration t4 = Duration.between(d06, semanaPassadaInstant);   // Para ver a duração entre eles.



        System.out.println("T1 em dias: " + t1.toDays());
        System.out.println("T2 em dias: "+ t2.toDays());
        System.out.println("T3 em dias: "+ t3.toDays());
        System.out.println("T4 em dias: "+ t4.toDays());


    }
}
