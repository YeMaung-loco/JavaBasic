package JavaAdvance;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class testUserDefi extends JPanel implements ActionListener {

	public static final int WIDTH = 300, HEIGHT = 300;
	private JLabel prompt = new JLabel("Input an integer <=100: ");
	private JTextField intField = new JTextField(10);
	private int userInt;
	private String message = "Hello";
	private final int bound = 100;

	public testUserDefi() {

		add(prompt);
		intField.addActionListener(this);
		add(intField);
		setSize(WIDTH, HEIGHT);
		
	}

	public static void main(String[] args) {
	
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			userInt=Integer.parseInt(intField.getText());
			if(userInt>bound) {
				
			}
		}catch (NumberFormatException e){
			
		}

	}

}

class IntOutOfRangeException extends Exception {
	public IntOutOfRangeException(int Bound) {
		super("The input value exceeds the bound" + Bound);
	}
}
