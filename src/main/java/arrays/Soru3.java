package arrays;

import java.util.Arrays;

public class Soru3 {
    public static void main(String[] args) {

        //Bir eleman dizide olup olmadığı nasıl kontrol edilir

        int arr[] = {32, 14, 2, 11,8}; //


        // 1.YOL:

        for (int w: arr){
            if (w==14){
                System.out.print(w+" var");
                break;
            }else {
                System.out.println("yok");
            }

        }

        System.out.println();

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [2, 8, 11, 14, 32]
        System.out.println(Arrays.binarySearch(arr,14)); // 3
        System.out.println(Arrays.binarySearch(arr,34)); // -6



































    }
}
