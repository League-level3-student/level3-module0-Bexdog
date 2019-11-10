package _00_IntroToArrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
	
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/* Run the FindHiddenButton.jar to see the finished product. */

public class _02_FindTheHiddenButton implements ActionListener{
	JFrame frame;
	JPanel panel;
	
	//1. create an array of JButtons. Don't initialize it yet.
	JButton[] button;
	//2 create an integer variable called hiddenButton
	int hiddenButton;
	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();
	}
	
	public void start() {
		frame = new JFrame("Find the Button");
		panel = new JPanel();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//3.  Ask the user to enter a positive number and convert it to an int
		String Input = JOptionPane.showInputDialog("Enter a whole number less than 649");
		int input = Integer.parseInt(Input);
		if(input<=0||input>648) {
			Input = JOptionPane.showInputDialog("Enter a whole number less than 649");
			input = Integer.parseInt(Input);
		}
		//4. Initialize the array of JButtons to be the size of the int created in step 3
		button = new JButton[input];
		//5. Make a for loop to iterate through the JButton array
			//6. initialize each JButton in the array
			//7. add the ActionListener to each JButton
			//8. add each JButton to the panel
		for(int i =0;i<button.length;i++) {
			button[i]=new JButton();
			button[i].addActionListener(this);
			panel.add(button[i]);
		}
		//9 add the panel to the window
		frame.add(panel);
		//10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		//11. set the JFrame to visible.
		frame.setVisible(true);;
		//12. Give the user the instructions for the game.
		JOptionPane.showMessageDialog(null, "Click the right button");
		//13. initialize the hiddenButton variable to a random number less than the int created in step 3
		int randy = new Random().nextInt(input);
		hiddenButton = randy;
		//14. Set the text of the JButton located at hiddenButton to read "ME"
		button[hiddenButton].setText("ME");
		//15. Use Thread.sleep(100); to pause the program.
		 try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//16. Set the text of the JButton located at hiddenButton to be blank.
		 button[hiddenButton].setText("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton)e.getSource();
		
		//17. if the hiddenButton is clicked, tell the user that they win.
		if(e.getSource().equals(button[hiddenButton])) {
			JOptionPane.showMessageDialog(null, "You Win!!!");
		}
		//18. else tell them to try again
		else {
			JOptionPane.showMessageDialog(null, "Try again");
		}
	}
}
