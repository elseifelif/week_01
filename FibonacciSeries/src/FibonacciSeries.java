import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main (String[] args) {
        int elemanSayisi;
        ArrayList<Integer> fibonacciDizisi = new ArrayList<Integer>();

        Scanner scan = new Scanner (System.in);
        System.out.println("Fibonacci serisi için eleman sayısı yazınız.");
        elemanSayisi=scan.nextInt();


        if (elemanSayisi<=0){
            System.out.println("Hatalı eleman sayısı.");
        } else {

            if (elemanSayisi >= 1) {
                fibonacciDizisi.add(0);
                fibonacciDizisi.add(1);
            }
            if (elemanSayisi >= 2) {

                for (int i = 2; i <= elemanSayisi; i++) {
                    fibonacciDizisi.add(fibonacciDizisi.get(i - 1) + fibonacciDizisi.get(i - 2));
                }


            }

        }

        System.out.println(fibonacciDizisi);
    }
}
