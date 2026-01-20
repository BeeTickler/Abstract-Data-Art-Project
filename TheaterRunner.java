import org.code.theater.*;

public class TheaterRunner {
  public static void main(String[] args) {

    // Create scene objects
    ThisYear thisYear = new ThisYear();
    LastYear lastYear = new LastYear();
    // Call top level methods
    thisYear.drawScene();
    lastYear.drawScene();
    // Play scenes (in order of arguments)
    Theater.playScenes(lastYear, thisYear);
   
  }
}