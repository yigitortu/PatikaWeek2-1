
public class Main {
    // Palindrom mu değil mi metodunu oluşturuyoruz.
    // Booelan değer döndürmesini istiyoruz çünkü sayı mı değil mi diye sorgulamak istiyoruz
    static boolean isPalindrom(int number){
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10; // Son basamağında bulunan sayıyı alıyoruz.
            reverseNumber = (reverseNumber * 10) + lastNumber;  // Ters çevirip aynı sayıyı oluşturmak için
                                                                    // 10 ile çarpıyoruz üstüne son basamağı ekliyoruz.
            // Sayıyı her seferinde 1 basamak azaltmak için 10'a bölüyoruz.
            temp /= 10;

        }

        if (number == reverseNumber) {      // Eğer Reverse number == number'a eşit ise true değerini verecektir.
            return true;
        }else {
            return  false;
        }



    }


    public static void main(String[] args) {
        System.out.println(isPalindrom(505));





    }
}