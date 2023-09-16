/**
 * Anjing
 */
public class Anjing {
    int size;
    String breed;
    String name;

    void bark() {
        System.out.println("Ruff Ruff!!");
    }
}

class AnjingTestDrive {
    public static void main(String[] args) {
        Anjing dog = new Anjing();
        dog.size = 40;
        dog.bark();
    }
}