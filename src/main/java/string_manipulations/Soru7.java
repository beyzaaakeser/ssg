package string_manipulations;

public class Soru7 {
    public static void main(String[] args) {

        String str = "Ali!  13 yasinda  , 15 yasinda oldugunu dusunuyorum.";
        String yeniStr = str.replaceAll("[a-zA-Z]","!");
        System.out.println(yeniStr);


        String yrniStr2 = str.replaceAll("[0-9]","*");
        System.out.println(yrniStr2);

























    }
}
