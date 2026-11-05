import java.util.Scanner;
public class Utils {
    static Scanner sc = new Scanner(System.in);
    public static int validaInt(String mensaje) {
        System.out.print(mensaje);
        while (!sc.hasNextInt()) {
            System.out.println("Eso no es un número!");
            sc.next(); // IMPORTANTE!
        }
        return sc.nextInt();
    }
}
