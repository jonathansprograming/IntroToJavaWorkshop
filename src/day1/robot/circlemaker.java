package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class circlemaker {
	public static void main(String[] args) {
		Robot circlemaker=new Robot();
		for (int i = 0; i <360; i++) {
		 circlemaker.setSpeed(10);
		 circlemaker.penDown();
		 circlemaker.move(6);
		 circlemaker.turn(1);
		
		
		
		
		
		
		
		
		}
		for (int i = 0; i <360; i++) {
			 circlemaker.setSpeed(10);
			 circlemaker.penDown();
			 circlemaker.move(6);
			 circlemaker.turn(-1);
	
	}
}
}