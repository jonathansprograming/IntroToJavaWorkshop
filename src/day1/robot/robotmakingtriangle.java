package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class robotmakingtriangle {
	public static void main(String[] args) {
		Robot trianglemaker=new Robot();
		trianglemaker.setSpeed(10);
		trianglemaker.move(100);
		trianglemaker.penDown();
		trianglemaker.turn(120);
		trianglemaker.move(160);
		trianglemaker.turn(120);
		trianglemaker.move(160);
		trianglemaker.turn(120);
		trianglemaker.move(160);
	}

}
