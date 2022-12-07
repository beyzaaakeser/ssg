package arrays;

import java.util.Arrays;

public class Soru2 {
    public static void main(String[] args) {


        int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};

        for(int w: array){
            System.out.print(w+" ");
        }

        System.out.println();

        for (int i = 0; i <array.length ; i++) {

            System.out.print(array[i]+" ");
        }


        System.out.println();

        // dizideki  kucuk  element ve buyuk  elemen toplami yaziniz

        Arrays.sort(array);
        System.out.println(Arrays.toString(array)); // [5, 12, 22, 23, 34, 67, 90, 109]
        int sonuc =array[0]+array[array.length-1];
        System.out.println(sonuc);
























    }
}
