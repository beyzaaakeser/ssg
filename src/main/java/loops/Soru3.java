package loops;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {

        // Kullanicidan pozitif bir tam sayi girmesini isteyen bir program yaziniz.
        // Daha sonra bu sayinin carpim tablosunum yazdirmasini isteyin


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir sayi giriniz");
        int sayi = input.nextInt();

        for (int i = 0; i <=10 ; i++) {

            System.out.println(sayi+"X"+i+"="+sayi*i);

        }

































    }
}
