import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        String name = "Krissada";
        System.out.println("Hello, World!");
        System.out.println(String.format("Today is %s. I am alive!", Today()));
        System.out.println(String.format("My name is %s.", name));
    }

    private static String Today() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

}
