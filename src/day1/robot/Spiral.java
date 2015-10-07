package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		
		Robot pies= new Robot();
		
pies.penDown();
		
pies.setSpeed(10);
		
for (int i = 0; i < 100; i++) {
	

			
	pies.setRandomPenColor();
			
	pies.move(5*i);
			
	pies.turn(5);
			// 8. Change the number of sides to 7 (don’t add a new line of code for this one!)
	
			// 9. Set the pen width to i
	}
	}
}
