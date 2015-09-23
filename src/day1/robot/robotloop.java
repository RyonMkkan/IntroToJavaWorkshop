package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;



public class robotloop {
	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			Robot bogo=new Robot();
			bogo.setPenColor(Color.BLUE);
			bogo.penDown();
			bogo.move(100);
			bogo.turn(90);
			
		}
	}
}
