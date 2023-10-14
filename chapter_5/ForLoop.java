/**
 * ForLoop
 */
public class ForLoop {

    public static void nonEnhancedForLoop() {
        for (int i = 0; i < 8; i++) {
            System.out.println(i);
        }
        System.out.println("done beb");
    }

    public static void enhacedForLoop() {
        int[] nums = {1,2,3,4,5,5};
        for (int num : nums) {
            System.out.println(num);
        }

        System.out.println("done enhanced");
    }

    public static void main(String[] args) {
        nonEnhancedForLoop();
        enhacedForLoop();
    }
}