import java.util.Scanner;

public class Main {

    static void patternMethod(int n) {

        if (n <= 0) {
            System.out.println(n + " ");    // n 0'dan eşit ve küçük olduğunda değeri geri döndür.
            return;
        }

        System.out.println(n + " ");    // n sayısını yazdır


        patternMethod(n - 5);   // n sayısını 5'er 5'er azalt

        System.out.println(n + " "); // n sayılarını tekrar yazdır
        return;
    }


    public static void main(String[] args) {
        // Kullanıcıdan bir sayı alalım.

        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int n = inp.nextInt();

        System.out.println("Girilen sayı : " + n);
        patternMethod(n);

    }
}