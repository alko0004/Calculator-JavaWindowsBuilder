
import javax.swing.JFrame;

public class Driver {

	public static void main(String[] args) {
		
		CalculatorGUI calculatorFrame = new CalculatorGUI(); //instantiate a reference
		calculatorFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //specify how to close
		calculatorFrame.setSize(500, 500); //specify the size of the JFrame
		calculatorFrame.setVisible(true);

	}
}
