import java.util.Locale;
import java.util.Scanner;

public class PDM1157 {
    public static char Frequence(String str){
        int count[] = new int[27];
        int max = 0, index = 0, bool = 0;
        str = str.toLowerCase();

        for(int i = 0; i < str.length(); i++) {
            count[(int) str.charAt(i) - 97]++;
            if (max < count[(int) str.charAt(i) - 97]) {
                max = count[(int) str.charAt(i) - 97];
                index = (int) str.charAt(i) - 97;
            }
        }

        for(int i = 0; i < count.length; i++){
            if(max == count[i]){
                bool++;
                if(bool > 1)
                    return '?';
            }
        }
        return(char)(index+65);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String arr = scan.nextLine();
        System.out.println(Frequence(arr));
    }
}
