package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE

		
		Robot bogo=new Robot();
		
	    bogo.setPenColor(Color.BLUE);
		bogo.penDown();
		bogo.move(100);
		bogo.turn(90);
		bogo.setPenColor(Color.RED);
		bogo.move(100);
		bogo.turn(90);
		bogo.setPenColor(Color.BLUE);
		bogo.move(100);
		bogo.turn(90);
		bogo.move(100);
		
		
		
	}
}
