package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		// 2. create an array of 5 robots.
		Robot[] robot = new Robot[100];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < robot.length; i++) {
			robot[i] = new Robot();
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up
		for (int i = 0; i < robot.length; i++) {
			robot[i].setX(80+i*(850/robot.length));
			robot[i].setY(500);
		}
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		int randy = new Random().nextInt(50);
		boolean finished=false;
		while(finished==false) {
		for (int i = 0; i < robot.length; i++) {
			robot[i].setY(robot[i].getY()-randy);
			randy = new Random().nextInt(50);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(robot[i].getY()<=0) {
				finished = true;
			}
		}
		}
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!
		for(int i = 0; i<robot.length;i++) {
			if(robot[i].getY()<=0) {
				int b =i+1;
				JOptionPane.showMessageDialog(null, "Robot "+b+" wins!!!!!!");
			}
		}
		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.

	}
}
