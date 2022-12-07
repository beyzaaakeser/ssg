package loops;

public class Soru2 {
    public static void main(String[] args) {


        // ilk 10 dogal sayinin toplamini bulan programi yaziniz

        // 1.YOL :
        int sum = 0;

        for (int i = 0; i < 11; i++) {

            sum = sum + i;

        }
        System.out.println(sum);


        // 2.YOL :

        int k = 0;
        int sum2 = 0;
        do {

            sum2 = sum2 + k;
            k++;
        } while (k < 11);
        System.out.println(sum2);

        // 3.YOl :

        int x = 0;
        int sum3 = 0;

        while (x < 11) {

            sum3 = sum3 + x;
            x++;
        }
        System.out.println(sum3);































    }
}
