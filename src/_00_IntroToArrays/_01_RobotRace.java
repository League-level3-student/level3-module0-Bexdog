package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		// 2. create an array of 5 robots.
		Robot[] robot = new Robot[5];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < robot.length; i++) {
			robot[i] = new Robot();
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up
		for (int i = 0; i < robot.length; i++) {
			robot[i].setX(300 - (i * 50));
			robot[i].setY(290);
			robot[i].setSpeed(255);
		}
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		int randy = new Random().nextInt(50);
		boolean finished = false;
		while (finished == false) {
			for (int i = 0; i < robot.length; i++) {
				for (int x = 0; x < randy; x++) {
					for(int z = 0; z<=i;z++) {
					robot[i].move(1);
					if (robot[i].getY() == 290 && robot[i].getX() == 300 - (i * 50)) {
						finished = true;
						i = robot.length;
						x=randy;
						z=i+1;
						break;
						
					}
					}
				if(!finished) {
				robot[i].turn(1);
				randy = new Random().nextInt(200) + 50;
				}
//			try {
//				Thread.sleep(25);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
				
				}
			}

		}

		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!
		for (int i = 0; i < robot.length; i++) {
			if (robot[i].getY() <= 0) {
				int b = i + 1;
				JOptionPane.showMessageDialog(null, "Robot " + b + " wins!!!!!!");
			}
		}
		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.

	}
}
