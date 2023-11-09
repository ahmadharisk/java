import java.util.Scanner;
import java.util.ArrayList;

/**
 * SimpleStartupGame
 */

class Startup {
    private ArrayList<String> locationCells;

    public void setLocationCells(ArrayList<String> locs) {
        locationCells = locs;
    }

    public String checkYourself(String userInput) {
        String result = "miss";
        int index = locationCells.indexOf(userInput);

        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
            }
        }
        return result;
    }
}

class GameHelper {
    public int getUserInput(String promp) {
        System.out.println(promp + ": ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}

class SimpleStartupTestDrive {
    public static void main(String[] args) {

        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        Startup theStartup = new Startup();

        int randomNum = (int) (Math.random() * 5);

        ArrayList<String> locs = new ArrayList<String>();
        locs.add(String.valueOf(randomNum));
        locs.add(String.valueOf(randomNum+1));
        locs.add(String.valueOf(randomNum+2));
        System.out.println("key start location: " + randomNum);

        theStartup.setLocationCells(locs);
        boolean isAlive = true;

        while (isAlive) {
            String guess = String.valueOf(helper.getUserInput("enter a number"));

            String result = theStartup.checkYourself(guess);
            numOfGuesses++;
            System.out.println(result);

            if (result.equals("kill")) {
                isAlive = false;

                System.out.println("You took " + numOfGuesses + " guesses");
            }
        }
    }
}