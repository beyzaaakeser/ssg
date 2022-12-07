package arrays;

import java.util.Arrays;

public class Soru1 {
    public static void main(String[] args) {

        // ayni data tipi olanlarda ve eleman sayisi belli olan durumlarda

        String arr1[]={"Ali", "Veli","Ayse"};
        System.out.println(arr1);// reference gelir
        System.out.println(Arrays.toString(arr1)); // [Ali, Veli, Ayse]
        System.out.println(arr1[1]); // Veli

        int arr2[] = new int[4];
        System.out.println(Arrays.toString(arr2)); // [0, 0, 0, 0]

         arr2[1]=12;
         arr2[3]=15;

        System.out.println(Arrays.toString(arr2)); // [0, 12, 0, 15]

        System.out.println(arr2.length); // 4

















































    }
}
