import java.util.Scanner;


public class Main {

    static int expNumber(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }


    public static void main(String[] args) {

        // Kullanıcıdan üssü alınacak sayı ve üs sayısını alalım

        Scanner input = new Scanner(System.in);

        // Kullanıcıdan sayıları alalım.
        System.out.print("Taban değerini giriniz : ");
        int a = input.nextInt();

        System.out.print("Üs değerini giriniz : ");
        int b = input.nextInt();

        System.out.println(expNumber(a, b)); // Fonksiyonu çağıralım.


    }
}