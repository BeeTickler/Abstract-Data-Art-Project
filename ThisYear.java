import org.code.theater.*;
import org.code.media.*;

public class ThisYear extends Scene {

  // Variables
  private String[] pictures;
  private String[] captions = {
 "Driving Permit Goal",
  "Lego Flowers",
  "Ascendant Valorant Rank"
  };
  public static final int SAMPLE_RATE = 44100; // for audioClip
  
  // Constuctors
  public ThisYear() {
    pictures = FileReader.toStringArray("pictures2.txt");
  }

  public ThisYear(String[] pictures) {
    this.pictures = pictures;
  }

  /**
   * Top level drawScene method
   */
  public void drawScene() {
    // 12 seconds of background track
    playBackgroundTrack(12);
    // Title Screen
    drawTitleScreen();
    // pause here before Images
    pause(1.0);
    // Images With Captions (pause in method)
    drawImagesWithCaptions();
    // End Screen
    drawEndScreen();
  }

  public void drawTitleScreen() {
    setTitleScreenStyle();
    clear("white");
    drawText("My Goals", 75, 175);
    drawText("For", 100, 225);
    drawText("2026", 100, 275);
  }

  public void drawImagesWithCaptions() {
    setCaptionStyle();
    for (int index = 0; index < pictures.length; index++) {
      // arguments: image, xPosition, yPosition, width, height, rotation
      drawImage(pictures[index], 0, 0, 400, 400, 0.0);
      // arguments: text, xPosition, yPosition
      drawText(captions[index], 25, 350);
      // arguments: seconds
      pause(1.0);
    }
  }

  public void drawEndScreen() {
    setEndScreenStyle();
    clear("black");
    drawText("The End", 75, 175);
  }

  public void setTitleScreenStyle() {
    setTextHeight(50);
    setTextColor("green");
    setTextStyle(Font.SANS, FontStyle.ITALIC);
  }
  
  public void setCaptionStyle() {
    setTextHeight(30);
    setTextColor("black");
    setTextStyle(Font.SERIF, FontStyle.BOLD);
  }

  public void setEndScreenStyle() {
    setTextHeight(60);
    setTextColor("white");
    setTextStyle(Font.MONO, FontStyle.BOLD_ITALIC);
  }

  public void playBackgroundTrack(int numSeconds) {
    double[] audio = SoundLoader.read("background-music-456267-(online-video-cutter.com).wav");
    // just play the first numSeconds
    double[] clip = createClip(audio, 0, numSeconds);
    playSound(clip);
  }

  /**
   * Creates an audio clip from a given start time to a end time
   */
  public static double[] createClip(double[] sound, int start, int end) {
    int startIndex = start * SAMPLE_RATE;
    int endIndex = end * SAMPLE_RATE;
    
    double[] newSound = new double[endIndex - startIndex];

    int index = 0;
    
    while (startIndex < endIndex) {
      newSound[index] = sound[startIndex];
      startIndex++;
      index++;
    }

    return newSound;
  }
  
}