import java.util.Scanner;
public class PerfectNumbers {
    public static void main (String[] args) {

        int sayi, toplam=0;
        Scanner scan = new Scanner (System.in);
        System.out.println("Bir sayı yazınız.");
        sayi=scan.nextInt();

        for (int i=1; i<sayi; i++) {
            if(sayi%i==0) {
                toplam += i;
            }
        }
        if (toplam==sayi) {
            System.out.println(sayi +" mükemmel sayıdır.");
        } else {
            System.out.println(sayi + " mükemmel sayı değildir.");
        }
    }
}
