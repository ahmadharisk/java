import java.util.ArrayList;

/**
 * ArrayListTest
 */
public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<Egg> myList = new ArrayList<Egg>();

        Egg egg1 = new Egg();
        myList.add(egg1);

        Egg egg2 = new Egg();
        myList.add(egg2);

        int theSize = myList.size();
        boolean isIn = myList.contains(egg1);
        // find out where something
        int idx = myList.indexOf(egg2);
        // find out is empty
        boolean empty = myList.isEmpty();
        // remoce somthing
        myList.remove(egg1);

        System.out.println("the size: "+theSize);
        System.out.println("is in: "+isIn);
        System.out.println("where index of egg2: "+idx);
        System.out.println("is empty: "+empty);
    }
}

class Egg {

}