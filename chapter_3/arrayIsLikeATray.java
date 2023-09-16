/**
 * arrayIsLikeATray
*/

class Kelinci {
    String name;

    void bark() {
        System.out.println("menggonggong");
    }

    void eat() {
        System.out.println("eat");
    }

    void chaseCat() {
        System.out.println("chase cat");
    }
}

public class arrayIsLikeATray {

    public static void main(String[] args) {
        int[] numbers; 
        numbers = new int[7];
        numbers[0] = 6;
        numbers[1] = 6;
        numbers[2] = 6;
        numbers[3] = 6;
        numbers[4] = 6;
        numbers[5] = 6;
        numbers[6] = 6;

        Kelinci[] pets; 
        pets = new Kelinci[7];
        pets[0] = new Kelinci(); 
        pets[1] = new Kelinci(); 
        pets[2] = new Kelinci(); 
        pets[3] = new Kelinci(); 
        pets[4] = new Kelinci(); 
        pets[5] = new Kelinci(); 
        pets[6] = new Kelinci(); 

        Kelinci tarbilung = new Kelinci();
        tarbilung.name = "tarkentar";

        pets[0].name = "pertama";
    }

}