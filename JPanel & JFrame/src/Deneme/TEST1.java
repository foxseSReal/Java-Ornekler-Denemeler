package Deneme;


import java.awt.Color;

import javax.swing.JFrame;


public class TEST1 {

	public static void main(String[] args) {
		JFrame redPanel =new JFrame("Deneme");
		redPanel.setBackground(Color.RED);
		redPanel.setBounds(50, 50, 100,100);		
		
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(750,750);
		frame.setVisible(true);
		frame.add(redPanel);
		
		
		
		
		
	}
}
