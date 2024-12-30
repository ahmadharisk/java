import java.util.ArrayList;

public class SinkStartup {
  private ArrayList<String> locationCells;

  public void setLocationCells(ArrayList<String> locs) {
    locationCells = locs;
  }

  public String checkYourSelf(String userInput) {
    String result = "miss";
    int index = locationCells.indexOf(result);

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

class StartupBust {

  public static void main(String[] args) {
    
  }
}

class GameHelper {}