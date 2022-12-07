package loops;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {

        // Kullanicidan bir tamsayi girmesini isteyin ve ardindan sayilari ters cevirilmis sayiyi veren programi yazin.
        // Ornegin 12345  ==> 54321 olmalidir. while dongusu


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz.");
        int sayi = input.nextInt();
        int ters = 0;
        int kasa = 0;

        while (sayi>0){
            kasa = sayi%10;
            ters = ters*10+kasa;
            sayi/=10;
        }
        System.out.println(ters);



















































    }
}
