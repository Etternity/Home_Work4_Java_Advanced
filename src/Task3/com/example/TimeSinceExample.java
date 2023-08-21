package Task3.com.example;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;

public class TimeSinceExample {
    public static void main(String[] args) {
        LocalDateTime birthDate = LocalDateTime.of(1988, Month.APRIL, 7, 5, 0, 0);
        LocalDateTime currentDate = LocalDateTime.now();

        Duration timeSinceBirth = Duration.between(birthDate, currentDate);

        long years = timeSinceBirth.toDays() / 365;
        long days = timeSinceBirth.toDays() % 365;
        long hours = timeSinceBirth.toHours() % 24;
        long minutes = timeSinceBirth.toMinutes() % 60;
        long seconds = timeSinceBirth.getSeconds() % 60;

        System.out.printf("Вам виповнилося %d років, %d місяців, %d днів, %d годин, %d хвилин та %d секунд%n",
                years, days / 30, days, hours, minutes, seconds);
    }
}
