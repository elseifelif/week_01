import java.util.ArrayList;

public class AsalSayilar {
    public static void main (String[] args) {
        // 1 ile 100 arasındaki asal sayıların ekrana yazdırılması
        int sayac=0;
        // Asal sayıların ekleneceği ArrayList'in tanımlanması
        ArrayList<Integer> asalSayilar = new ArrayList<Integer>();

        asalSayilar.add(2);

        for (int i=3; i<100; i++){
            for(int j=2; j<i; j++) {
                if(i%j==0) sayac++;
                }

            if (sayac==0) asalSayilar.add(i);
            sayac=0;
        }
        System.out.println(asalSayilar);
        }

    }

