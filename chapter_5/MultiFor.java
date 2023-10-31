/**
 * MultiFor
 */
public class MultiFor {

    public static void main(String[] args) {
        // for (int i = 0; i < 4; i++) {
        //     for (int j = 4; j > 2; j--) {
        //         System.out.println(i + " " + j);
        //     }
        //     if (i == 1) {
        //         i++;
        //     }
        // }
        testBro();
    }

    public static void testBro() {
        int x =0;
        int y = 30;
        for (int i = 0; i < 3; i++) {
            for (int j = 4; j > 1; j--) {
                System.out.println("i: "+i+",j: "+j);
                x = x + 3;
                y = y - 2;
                if (x==6) {
                    System.out.println(x + " " + y);
                    break;
                }
                x = x + 3;
                System.out.println(x + " " + y);
            }
            y = y - 2;
            System.out.println(x + " " + y);
        }
        System.out.println(x + " " + y);
    }
}