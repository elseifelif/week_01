import java.util.Scanner;
public class AritmetikIslemler {
    public static void main (String [] args) {
        int a,b,c;
        Scanner scan = new Scanner (System.in);

        System.out.println("1. sayıyı (a) yazınız.");
        a=scan.nextInt();

        System.out.println("2. sayıyı (b) yazınız.");
        b=scan.nextInt();

        System.out.println("3. sayıyı (c) yazınız.");
        c=scan.nextInt();

        System.out.println("a+b*c-b işlemi sonucu:" +(a+b*c-b));




    }
}
