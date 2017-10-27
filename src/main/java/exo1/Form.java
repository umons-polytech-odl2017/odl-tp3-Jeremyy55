package exo1;

import javafx.scene.shape.Circle;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class Form {
	private JButton button;
	private JPanel panel1;
	private JTextField textField1;
	private JTextField textField2;
	private JRadioButton RectangleButton;
	private JRadioButton SquareButton;
	private JRadioButton EllipsisButton;
	private JRadioButton CircleButton;
	private JTextArea messageArea;
	private JPanel drawingPanel;

	public Form() {

		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField2.setText("Yolo, "+textField1.getText());
			}
		});
		RectangleButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField2.setText("on ajoute "+RectangleButton.getText());
			}
		});
		SquareButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField2.setText("on ajoute "+SquareButton.getText());
			}
		});


		EllipsisButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField2.setText("on ajoute "+EllipsisButton.getText());
			}
		});
		CircleButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField2.setText("on ajoute "+CircleButton.getText());
			}
		});
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Form");
		frame.setContentPane(new Form().panel1);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	private void createUIComponents() {
		drawingPanel = new JPanel();
	}
}
