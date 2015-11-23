package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
		Robot crazybot = new Robot();
		crazybot.setSpeed(10);
		crazybot.setRandomPenColor();
		crazybot.penDown();
		crazybot.move(200);
		crazybot.turn(190);
		crazybot.move(200);
		crazybot.turn(190);
		crazybot.move(200);
		crazybot.turn(190);
		crazybot.move(200);
		
	}	
	
	
}
