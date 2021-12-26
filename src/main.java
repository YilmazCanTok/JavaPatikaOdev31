
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("****************************************************");
        System.out.println("Palindrom Kelimeleri Bulan Program");
        System.out.println("----------------------------------------------------");
        System.out.print("Lütfen bir kelime giriniz : ");
        String str = scanner.nextLine();
        isPalindrom(str);
        System.out.println("----------------------------------------------------");
        System.out.println("****************************************************");
        
    }
    public static boolean isPalindrom(String str){
        int i = 0;
        int j = str.length()-1;
        if (str.charAt(i) != str.charAt(j)) {
            System.out.println(str+" kelimesi Palindrom bir ifade değildir.");
            return false;
        }
        System.out.println(str+" kelimesi Palindrom bir ifadedir.");
        return true;
    }
}
