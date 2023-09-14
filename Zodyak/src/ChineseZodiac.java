import java.util.Scanner;

public class ChineseZodiac {
    public static void main (String[] args) {

        //Değişkenler
        int dogumTarihi, kalanSayi;

        Scanner scan = new Scanner(System.in);
        System.out.println("Doğum yılınızı yazınız.");
        dogumTarihi = scan.nextInt();

        kalanSayi=dogumTarihi%12;

       switch (kalanSayi) {
           case 0:
               System.out.println("Çin zodyağına göre burcunuz: At");
               break;

           case 1:
               System.out.println("Çin zodyağına göre burcunuz: Horoz");
               break;

           case 2:
               System.out.println("Çin zodyağına göre burcunuz: Köpek");
               break;

           case 3:
               System.out.println("Çin zodyağına göre burcunuz: Domuz");
               break;

           case 4:
               System.out.println("Çin zodyağına göre burcunuz: Fare");
               break;

           case 5:
               System.out.println("Çin zodyağına göre burcunuz: Öküz");
               break;

           case 6:
               System.out.println("Çin zodyağına göre burcunuz: Kaplan");
               break;

           case 7:
               System.out.println("Çin zodyağına göre burcunuz: Tavşan");
               break;

           case 8:
               System.out.println("Çin zodyağına göre burcunuz: Ejderha");
               break;

           case 9:
               System.out.println("Çin zodyağına göre burcunuz: Yılan");
               break;

           case 10:
               System.out.println("Çin zodyağına göre burcunuz: At");
               break;

           case 11:
               System.out.println("Çin zodyağına göre burcunuz: Koyun");
               break;

           default:
                break;
       }


    }

}
