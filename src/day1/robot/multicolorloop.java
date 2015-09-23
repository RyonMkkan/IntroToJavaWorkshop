package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class multicolorloop {
public static void main(String[] args) {
	Robot bogo=new Robot();
	bogo.penDown();
	for (int i = 0; i < 100; i++) {
		bogo.setRandomPenColor();
		bogo.setSpeed(10);
		bogo.move(100);
		bogo.turn(90);
		for (int j = 0; j < 4; j++) {
			bogo.setPenWidth(5);
			bogo.move(100);
			bogo.turn(90);
			
		}
	}
}
}
