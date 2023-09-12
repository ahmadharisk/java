/**
 * BeerSong
 */
public class BeerSong {

    public static void main(String[] args) {
        Integer beerNum = 10;
        String wordBottles = "bottles";
        String wordOne = "one";

        while (beerNum > 0) {
            
            if (beerNum == 1) {
                wordBottles = "bottle";
                wordOne = "it";
            }

            if (beerNum > 0) {
                System.out.print(beerNum + " " + wordBottles + " of beer on the wall, ");
                System.out.println(beerNum + " " + wordBottles + " of beer.");
                
                beerNum = beerNum - 1;
                
                if (beerNum == 0) {
                    
                    System.out.println("Take " + wordOne + " down and pass it around, no more bottles of beer on the wall.");
                } else {

                    System.out.println("Take " + wordOne + " down and pass it around, " + beerNum + " " + wordBottles + " of beer on the wall.");
                }
            }
            if (beerNum == 0) {
                System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
                System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");
            } 


            
        }
        

    }
}