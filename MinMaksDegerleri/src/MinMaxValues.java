import java.util.Scanner;
import java.util.ArrayList;

public class MinMaxValues {
    public static void main (String [] args) {
        // Değişkenler
        int sayi, sayiMaks, sayiMin, yeniSayi;
        // Kullanıcının yazacağı sayılar için ArrayList tanımlanması
        ArrayList <Integer> sayiListesi= new ArrayList<Integer>();

        Scanner scan = new Scanner(System.in);

        System.out.print("Kaç tane sayı yazacaksınız?");
        sayi=scan.nextInt();

        for (int i = 1; i<=sayi; i++) {
            System.out.println(i+". sayıyı yazınız.");
            yeniSayi = scan.nextInt();
            sayiListesi.add(yeniSayi);

        }
        sayiMin=sayiListesi.get(0);
        sayiMaks=sayiListesi.get(0);

        for (int j=1; j<=sayi; j++) {
            if(sayiListesi.get(j-1)>sayiMaks) {
                sayiMaks=sayiListesi.get(j-1);
            }
            if(sayiListesi.get(j-1)<sayiMin) {
                sayiMin=sayiListesi.get(j-1);
            }
        }

        System.out.println("En büyük sayı: " + sayiMaks);
        System.out.println("En küçük sayı: " + sayiMin);
    }
}