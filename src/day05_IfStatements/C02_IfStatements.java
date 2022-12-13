package day05_IfStatements;

import java.util.Scanner;

public class C02_IfStatements {
    public static void main(String[] args) {

        /*
        Basit if cümleleri kodun geri kalanindan bagimsizdir, sadece 1 sarta odaklanır
        o sart true ise if body calisir, false ise if body calismaz (KOD CALİSİR)

        birden fazla bagimsiz if cumlesi kullanilmissa, her cümle birbirinden bagimsiz
        olacagindan bazi degerler icin, tum if body leri calisirken
        bazi degerler icin hicbir if body si CALİSMAYABİLİR.

         */

        //kullanicidan bir sayi alın
        //pozitif ise "pozitif sayi"
        //100 ile 999 arasinda ise(sinirlar dahil) "pozitif 3 basamakli sayi"
        //3 ile bölünebiliyorsa "3'un kati"
        //birler basamagi 7 ise "Mukemmel"
        //seceneklerinden uygun olanlari yazdirin

        //kullanicidan bir sayi alın
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi yaziniz");

        int sayi= scan.nextInt();

        //pozitif ise "pozitif sayi"
        if (0<sayi){
            System.out.println("pozitif sayi");
        }

        //100 ile 999 arasinda ise(sinirlar dahil) "pozitif 3 basamakli sayi"
        if(100<=sayi && sayi<=999){
            System.out.println("pozitif 3 basamakli sayi");
        }

        //3 ile bölünebiliyorsa "3'un kati"
        if (sayi%3==0){
            System.out.println("3'un kati");
        }

        //birler basamagi 7 ise "Mukemmel"
        if (sayi%10==7){
            System.out.println("Mukemmel");
        }

        //seceneklerinden uygun olanlari yazdirin





    }
}
