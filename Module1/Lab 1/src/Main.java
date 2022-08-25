import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine(), nstr="";
        char[] arr = text.toCharArray();
        char ch;
        for (int i = 0; i < text.length(); i++) {
            ch = text.charAt(i);
            nstr = ch+nstr;
        }
        System.out.println(nstr);
    }
}