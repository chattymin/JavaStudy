import java.util.Locale;
import java.util.Scanner;

public class PDMMethodExercise4 {
    public static String[] UpDown(String a, String b){
        String arr[] = new String[2];
        arr[0] = a.toUpperCase();
        arr[1] = b.toLowerCase();
        return arr;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String one = scanner.next();
        String two = scanner.next();
        String str[] = UpDown(one, two);

        System.out.println(str[0] + " " + str[1]);

    }
}
