import java.util.Scanner;

public class Main {

    static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n*2; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan sayıyı alalım

        System.out.print("Bir sayı giriniz : ");
        int n = inp.nextInt();

        boolean isPrime = isPrime(n);

        System.out.println(n + (isPrime ? " Asaldır" : " Asal değildir."));

    }
}