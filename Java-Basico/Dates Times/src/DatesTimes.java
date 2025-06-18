import java.time.*;
import java.time.format.DateTimeFormatter;

public class DatesTimes {

    /*
    Estudo sobre dates times, seus tipos e conversões.
    */

    public static void main(String[] args) {
        LocalDate d01 = LocalDate.now(); // Armazena apenas a data
        LocalTime t01 = LocalTime.now(); // Armazena apenas a hora
        LocalDateTime dt01 = LocalDateTime.now(); // Armazena data e hora
        Instant i01 = Instant.now(); // armazena um ponto específico no tempo

        System.out.println(d01);
        System.out.println(t01);
        System.out.println(dt01);
        System.out.println(i01);

        LocalDate d02 = LocalDate.parse("2025-05-05");
        // Cria um LocalDate a partir de uma string no formato ISO 8601 (YYYY-MM-DD).
        // O método parse é muito útil para converter strings em objetos de data.

        LocalDateTime dt02 = LocalDateTime.parse("2025-05-05T16:34:34.266753300");
        // Cria um LocalDateTime a partir de uma string no formato ISO 8601 (YYYY-MM-DDTHH:mm:ss.nnnnnnnnn). O "T" é um separador padrão entre a data e a hora.

        Instant i02 = Instant.parse("2025-05-05T16:34:34.266753300Z");
        // Cria um Instant a partir de uma string no formato ISO 8601 (YYYY-MM-DDTHH:mm:ss.nnnnnnnnnZ).
        // O "Z" no final indica que a data e hora estão em UTC (Zulu time).

        OffsetDateTime odt = OffsetDateTime.parse("2024-07-30T03:55:33.929-03:00");
        // Cria uma instância de OffsetDateTime a partir de uma string que inclui um offset de fuso horário.
        // OffsetDateTime representa uma data e hora com um offset fixo do UTC (por exemplo, -03:00 para o horário de Brasília).
        // É útil quando você quer lidar com fusos horários de uma maneira mais explícita e sem se preocupar com as regras de horário de verão de um ZoneId.

        Instant i03 = odt.toInstant();
        // Aqui é feito uma conversão do odt(OffsetDateTime) em um Instant, remove se o fuso horário e foca naquele momento exato.

        System.out.println(d02);
        System.out.println(dt02);
        System.out.println(i02);
        System.out.println(i03);

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // Cria um formatador personalizado (fmt1) que define como as datas no formato "dia/mês/ano" devem ser lidas ou exibidas.
        // Isso é essencial para trabalhar com strings de data que não estão no formato ISO 8601 padrão.

        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        // Cria outro formatador personalizado (fmt2) para datas e horas no formato "dia/mês/ano hora:minuto".

        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        // Cria um formatador (fmt3) similar ao fmt2, mas com uma adição importante: withZone(ZoneId.systemDefault()).
        // Isso instrui o formatador a usar o fuso horário padrão do sistema ao converter um Instant (que é em UTC) para um formato de data/hora específico,
        // garantindo que a hora exibida esteja correta para a sua localização.

        LocalDate d03 = LocalDate.parse("05/05/2025", fmt1);
        // Cria um LocalDate a partir da string "05/05/2025", utilizando o formatador fmt1 para interpretá-la corretamente, já que não é o formato padrão ISO.

        LocalDateTime dt03 = LocalDateTime.parse("30/09/2025 03:24", fmt2);
        // Cria um LocalDateTime a partir da string "30/09/2025 03:24", utilizando o formatador fmt2 para realizar a conversão.

        Instant i04 = Instant.parse("2025-08-30T03:55:33.929Z");
        // Cria um Instant a partir de uma string em formato ISO 8601 com "Z" (indicando UTC), similar ao i02.

        Instant i05 = Instant.now();
        // Obtém um Instant com o momento atual em UTC, similar ao i01.

        System.out.println(d03);
        System.out.println(dt03);
        System.out.println(d03.format(fmt1));
        System.out.println(dt03.format(fmt2));
        System.out.println(fmt3.format(i04));
        System.out.println(fmt3.format(i05));

        LocalDate d05 = d02.minusDays(7);
        // Cria um novo LocalDate (d05) que é 7 dias antes da data contida em d02.
        // Lembrar que a API de Data e Hora é imutável, o que significa que d02 não é alterado, e uma nova data é retornada.
        System.out.println(d05);

        LocalDate d06 = d02.plusDays(7);
        // Cria um novo LocalDate (d06) que é 7 dias depois da data contida em d02.
        System.out.println(d06);
    }
}