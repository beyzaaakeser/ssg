package string_manipulations;

import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {



        // Soru 4) Kullanicidan email adresini girmesini isteyin,
        // mail @gmail.com icermiyorsa  "lutfen gmail adresi giriniz",
        // @gmail.com ile bitiyorsa  "Email adresiniz kaydedildi " ,
        // @gmail.com ile bitmiyorsa "lutfen yazimi kontol edin" yazdirin

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen email adresinizi giriniz");

        String mail=input.next().toLowerCase();
        if (!mail.contains("@gmail")){
            System.out.println("Lutfen gmail adresini giriniz");
        } else if (mail.endsWith("@gmail.com")) {
            System.out.println("Email adresiniz basariyla kaydedildi.");
        } else if (!mail.endsWith("@gmail.com")) {
            System.out.println("Lutfen yazimi kontrol ediniz");
        }else{
            System.out.println("Hatali giris lutfen tekrar deneyin");
        }


    }
}
