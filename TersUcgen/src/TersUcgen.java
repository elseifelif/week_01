import java.util.Scanner;
public class TersUcgen {
    public static void main (String [] args) {
        //Değişkenler
        int sayi, baslangicYildizSayisi, n, sayac=0;
        Scanner scan = new Scanner (System.in);

        System.out.println("Basamak sayısını yazınız.");
        sayi=scan.nextInt();

        baslangicYildizSayisi = (2*sayi)-1; //İlk satırdaki yıldız sayısı

        for (int i = 1; i<=sayi; i++) {

            // Boşlukların ekrana yazdırılması, ilk satırda boşluk bulunmuyor.

            if (sayac!=0) {
                for (int y=1; y<=sayac; y++){
                    System.out.print(" ");
                }
            }
            sayac++;

            //Yıldızların ekrana yazdırılması, bir sonraki satırda yıldız sayısı 2 adet azalmaktadır.
            for(int j=1; j<=baslangicYildizSayisi; j++) {
                System.out.print("*");
            }
            System.out.println();
            baslangicYildizSayisi=baslangicYildizSayisi-2;
        }
    }
}
