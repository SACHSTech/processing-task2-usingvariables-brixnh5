import processing.core.PApplet;

public class Sketch extends PApplet {
	  //intializing height and width
    int intWidth = 800;
    int intHeight = 800;

    //initializing size
    public void settings() {
      size(intWidth, intHeight);
    }

    // setting background colour
    public void setup() {
      background(210, 255, 173);
    }
  
    public void draw() {
      //sky
      noStroke();
      fill(137, 207, 240);
      rect(intWidth * 0, intHeight * 0, intWidth, intHeight/2);
      
      //sun
      fill(250, 253, 15);
      ellipse(intWidth * 0, intHeight * 0, intWidth/4, intHeight/4);
  
      //house
      fill(237, 201, 175);
      rect((float)(intWidth * 0.275), (float)(intHeight * 0.3125), (float)(intWidth * 0.4375), (float)(intHeight * 0.4375));
  
      //roof
      fill(72, 72, 72);
      triangle(intWidth/5, (float)(intHeight * 0.375), (float)(intWidth * 0.7875), (float)(intHeight * 0.375), (float)(intWidth * 0.49375), intHeight/8);
  
      //door
      fill(66, 40, 14);
      rect((float)(intWidth * 0.55), (float)(intHeight * 0.575), intWidth/10, (float)(intHeight * 0.175));
  
      //doorknob
      stroke(0, 0, 0);
      fill(250, 253, 15);
      ellipse((float)(intWidth * 0.6325), (float)(intHeight * 0.6625), intWidth/80, intHeight/80);
  
      //cloud 1
      noStroke();
      fill(251, 255, 255);
      ellipse((float)(intWidth * 0.75), intHeight/8, (float)(intWidth * 0.075), (float)(intHeight * 0.075));
      ellipse((float)(intWidth * 0.8), intHeight/8, (float)(intWidth * 0.075), (float)(intHeight * 0.075));
      ellipse((float)(intWidth * 0.85), intHeight/8, (float)(intWidth * 0.075), (float)(intHeight * 0.075));
      ellipse((float)(intWidth * 0.7775), (float)(intHeight * 0.0875), (float)(intWidth * 0.075), (float)(intHeight * 0.075));
      ellipse((float)(intWidth * 0.8225), (float)(intHeight * 0.0875), (float)(intWidth * 0.075), (float)(intHeight * 0.075));
  
      //cloud 2
      ellipse((float)(intWidth * 0.15), intHeight/4, (float)(intWidth * 0.075), (float)(intHeight * 0.075));
      ellipse(intWidth/5, intHeight/4, (float)(intWidth * 0.075), (float)(intHeight * 0.075));
      ellipse(intWidth/4, intHeight/4, (float)(intWidth * 0.075), (float)(intHeight * 0.075));
      ellipse((float)(intWidth * 0.1775), (float)(intHeight * 0.2125), (float)(intWidth * 0.075), (float)(intHeight * 0.075));
      ellipse((float)(intWidth * 0.2225), (float)(intHeight * 0.2125), (float)(intWidth * 0.075), (float)(intHeight * 0.075));
      
    }
    
    // define other methods down here.
  }