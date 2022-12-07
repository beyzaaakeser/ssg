package arrays;

import java.util.Arrays;

public class Soru4 {
    public static void main(String[] args) {

        String str="Java gun gectikce guzellesiyor";
        String kelimeler[]= str.split(" ");
        System.out.println(Arrays.toString(kelimeler)); //[Java, gun, gectikce, guzellesiyor]
        String kelimeler2[]= str.split("");
        System.out.println(Arrays.toString(kelimeler2)); //[J, a, v, a,  , g, u, n,  , g, e, c, t, i, k, c, e,  , g, u, z, e, l, l, e, s, i, y, o, r]
        String kelimeler3[]= str.split("gectikce");
        System.out.println(Arrays.toString(kelimeler3)); // [Java gun ,  guzellesiyor]


        int arr[] = {32, 14, 2, 11,8};
        Soru5 method = new Soru5();
        Soru5.istenenElemanVarMi(arr,14);






























    }
}
