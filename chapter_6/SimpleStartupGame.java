import java.util.Scanner;

/**
 * SimpleStartupGame
 */

class SimpleStartup {
    int[] locationCells;
    int numOfHits;

    public void setLocationCells(int[] locs) {
        this.locationCells = locs;
    }

    public String checkYourself(int guess) {
        String result = "miss";

        for (int cell : locationCells) {
            if (guess == cell) {
                result = "hit";
                numOfHits++;
                break;
            }
        }

        if (numOfHits == locationCells.length) {
            result = "kill";
        }
        System.out.println(result);
        return result;
    }
}

class GameHelper {
    public int getUserInput(String promp) {
        System.out.println(promp + ": ");
        Scanner scanner = new Scanner(System.in);
        scanner.close();
        return scanner.nextInt();
    }
}

class SimpleStartupTestDrive {
    public static void main(String[] args) {
        // SimpleStartup dot = new SimpleStartup();

        // int[] locations = {2,3,4};
        // dot.setLocationCells(locations);

        // int userGeuss = 2;
        // String result = dot.checkYourself(userGeuss);
        // String testResult = "failed";

        // if(result.equals("hit")) {
        //     testResult = "passed";
        // }

        // System.out.println(testResult);

        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        SimpleStartup theStartup = new SimpleStartup();

        int randomNum = (int) (Math.random() * 5);

        int[] locations = {randomNum, randomNum+1, randomNum + 2};
        System.out.println("location: "+randomNum);

        theStartup.setLocationCells(locations);
        boolean isAlive = true;

        while (isAlive) {
            int guess = helper.getUserInput("enter a number");
            
            String result = theStartup.checkYourself(guess);
            numOfGuesses++;

            if (result.equals("kill")) {
                isAlive = false;

                System.out.println("You took "+numOfGuesses+" guesses");
            }
        }
    }
}