package Hw5;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NoOfPpl2 extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField textfield;

	public NoOfPpl2() {
		setTitle("Hw5");
		setLayout(new GridLayout());
		setSize(170,530);
		Scanner sc = new Scanner(System.in);
				
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		/*double Cheese = 1.0;
		double tomato = 5.0;
		double capsicum = 3.0;
		double Onion = 2.0;*/
		JPanel p1 = new JPanel();
		while (sc.hasNextLine()) {
			String ingredient = sc.nextLine();
			double quantity = sc.nextDouble();
			String unit = sc.nextLine();
			JLabel label1 = new JLabel(ingredient+""+quantity+" "+unit);
			p1.add(label1);
		}
		sc.close();
		JButton button1 = new JButton("Submit");
		JLabel Label = new JLabel();
		textfield = new JTextField("Type number of ppl here");
		p1.add(Label);
		p1.add(textfield);
		p1.add(button1);
		button1.addActionListener(new OkAction());
		getContentPane().add(p1);
		setVisible(true);
		}
	

	 public static void main(String[] args) {
	        new NoOfPpl2();
	    }
	public class OkAction extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
		@Override
		public void actionPerformed(ActionEvent arg0) {
			setTitle("Ingredients");
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setSize(170,390);
			setLayout(new GridLayout());
			setLocationRelativeTo(null);
			int Message = Integer.parseInt(textfield.getText());
			double Cheese = 1.0*Message;
			double tomato = 5.0*Message;
			double capsicum = 2.0*Message;
			double Onion = 3.0*Message;
			JLabel label1 = new JLabel("Cottage Cheese - "+Cheese);
			JLabel label2 = new JLabel("Tomato - "+tomato);
			JLabel label3 = new JLabel("Capsicum - "+capsicum);
			JLabel label4 = new JLabel(" Onion - "+Onion);
			JPanel panel = new JPanel();
			panel.add(label1);
			panel.add(label2);
			panel.add(label3);
			panel.add(label4);
			getContentPane().add(panel);
			setVisible(true);

		}

	}

}
