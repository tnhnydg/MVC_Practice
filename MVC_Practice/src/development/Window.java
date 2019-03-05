package development;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class Window implements Observer {

	private JFrame frame;
	private JButton button_1,button_2;
	private JLabel  label_1,label_2;
	
	public JLabel getLabel_2() {
		return label_2;
	}

	public void setLabel_2(JLabel label_2) {
		this.label_2 = label_2;
	}

	public Window() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 241, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//Left
		button_1 = new JButton("");
		button_1.setBounds(31, 29, 40, 54);
		button_1.setHorizontalTextPosition(JButton.CENTER);
		button_1.setVerticalTextPosition(JButton.CENTER);
		frame.getContentPane().add(button_1);
		
		//Right
		button_2 = new JButton("");
		button_2.setBounds(149, 29, 40, 54);
		button_2.setVerticalTextPosition(SwingConstants.CENTER);
		button_2.setHorizontalTextPosition(SwingConstants.CENTER);
		frame.getContentPane().add(button_2);
		
		label_1 = new JLabel("");
		label_1.setBounds(110, 123, 63, 23);
		frame.getContentPane().add(label_1);
		
		label_2 = new JLabel("");
		label_2.setBounds(110, 184, 46, 14);
		frame.getContentPane().add(label_2);
		
	}
	
	public JLabel getLabel_1() {
		return label_1;
	}

	public void setLabel_1(JLabel label_1) {
		this.label_1 = label_1;
	}

	public JFrame getJFrame() {
		return this.frame;
	}

	@Override
	public void update(Observable o, Object arg) {
		int[] arr = (int[]) arg;
		getLabel_1().setText(String.valueOf(arr[0]));
		getLabel_2().setText(String.valueOf(arr[1]));
		
	}

	public JButton getButton_1() {
		return button_1;
	}

	public void setButton_1(JButton button_1) {
		this.button_1 = button_1;
	}

	public JButton getButton_2() {
		return button_2;
	}

	public void setButton_2(JButton button_2) {
		this.button_2 = button_2;
	}
}
