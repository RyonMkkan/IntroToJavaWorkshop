package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

/* Teacher’s note: before beginning, draw a pentagon and have students work out the angle that the robot will have to turn (360/5) */

public class PentagonCrazy {

	private void makePrettyThings() {
		
Robot pies = new Robot();
		
pies.penDown();
		
pies.setSpeed(10);
		
pies.setRandomPenColor();
		
int cow = 5;
		
int pow = 360/5;
		
for (int i = 0; i < 200; i++) {
	

			
	pies.move(i);
			
	
			
	pies.turn(pow);
			// 11. Turn the robot one more degree
	pies.turn(1);
	}
	}

	// Variations:
	// *12. make the pattern really huge
	// *13. randomize the color of the pattern 
	// *14. experiment with different shapes

	public static void main(String[] args) {
		new PentagonCrazy().makePrettyThings();
	}
}