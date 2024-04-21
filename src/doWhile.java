public class doWhile {
    public static void main(String[] args) {

        /*While döngüsü, başlangıçta koşulu kontrol eder ve ardından koşul doğru olduğu
         sürece döngü içindeki işlemleri gerçekleştirir.*/

        int count = 1;
        while (count <= 5) {
            System.out.println("Count is: " + count);
            count++;
        }

        /* Do-while döngüsü, blok içindeki işlemleri en az bir kez gerçekleştirir ve ardından koşulu kontrol eder.
         */

        int count1 = 1;
        do {
            System.out.println("Count is: " + count1);
            count1++;
        } while (count1 <= 5);


    }
}