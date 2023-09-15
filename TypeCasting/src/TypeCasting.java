import java.util.Scanner;

public class TypeCasting {
    public static void main (String [] args) {
        // Değişkenler
        int sayi, sayi2;
        double ondalikliSayi, ondalikliSayi2;

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir tam sayı yazınız.");
        sayi=scan.nextInt();

        System.out.println("Bir ondalıklı sayı yazınız.");
        ondalikliSayi=scan.nextDouble();

        // Type Casting işlemi
        sayi2= (int) ondalikliSayi;
        ondalikliSayi2 = sayi;

        System.out.println("Type Casting işlemi yapıldıktan sonra,\n" +
                " tam sayı " + ondalikliSayi2+" değerine dönüştürüldü.");

        System.out.println("Type Casting işlemi yapıldıktan sonra,\n" +
                " ondalıklı sayı " + sayi2+" değerine dönüştürüldü.");

    }
}
