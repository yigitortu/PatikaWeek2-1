import java.util.Scanner;

public class Main {

    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Toplam sonucu : " + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("Çıkartma sonucu : " + result);
        return result;
    }

    static int times(int a, int b) {
        int result = a * b;
        System.out.println("Çarpma sonucu : " + result);
        return result;
    }

    static int divided(int a, int b) {
        int result = a / b;
        System.out.println("Bölme sonucu : " + result);
        return result;
    }

    static int exp(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }

        return result;
    }

    static int mod(int a, int b) {
        return a % b;
    }

    static void calc(int a, int b) {
        System.out.println("Çevresi : " + (2 * (a + b)));
        System.out.println("Alanı : " + a * b);

    }


    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        String menu = "1- Toplama \n" +
                "2- Çıkarma \n" +
                "3- Çarpma \n" +
                "4- Bölme \n" +
                "5- Üslü Sayı hesaplama \n" +
                "6- Faktöriyel hesaplama \n" +
                "7- Mod alma \n" +
                "8- Dikdörtgen alan ve çevre hesaplama \n" +
                "0- Çıkış yap";

        System.out.println(menu);
        while (true) {

            System.out.print("Bir işlem seçiniz : ");
            int select = inp.nextInt();

            if (select == 0) {
                System.out.println("Çıkış yapılıyor.");
                break;
            }

            System.out.print("İlk sayıyı giriniz : ");
            int a = inp.nextInt();
            System.out.print("İkinci sayıyı giriniz : ");
            int b = inp.nextInt();

            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    times(a, b);
                    break;
                case 4:
                    divided(a, b);
                    break;
                case 5:
                    System.out.println("Üs hesabı : " + exp(a, b));
                    break;
                case 7:
                    System.out.println("Mod işlemi : " + mod(a, b));
                    break;
                case 8:
                    calc(a, b);
                    break;

                default:
                    System.out.println("Geçersiz bir işlem yaptınız. tekrar deneyiniz.");

            }


        }

        System.out.println("Çıkış yapıldı.");


    }
}