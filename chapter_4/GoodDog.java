/**
 * GoodDog
 */
public class GoodDog {

    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int calcArea(int height, int width) {
        return height * width;
    }

    void bark() {
        if(this.size > 60) {
            System.out.println("Woof! woof!");
        } else if (size > 14) {
            System.out.println("Ruff! Ruff!");
        } else {
            System.out.println("Yip! Yip!");
        }
    }
}

class GoodDogTestDrive {
    public static void main(String[] args) {
        GoodDog one = new GoodDog();
        one.setSize(75);
        one.bark();
        GoodDog two = new GoodDog();
        two.setSize(18);
        System.out.println("two size: "+two.getSize());
        two.bark();
        GoodDog three = new GoodDog();
        three.setSize(3);
        three.bark();

        int a = one.calcArea(7, 12);
        short c = 7;
        System.out.println(one.calcArea(c, a));
    }
}