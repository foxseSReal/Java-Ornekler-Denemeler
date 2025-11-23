package LEVEL_5;
import javax.swing.*;
import java.awt.event.*;

public class Soru4 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Hareket Eden X");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null); // Serbest konumlandırma
        frame.setLocation(500,300);
        JLabel label = new JLabel("X");
        label.setBounds(180, 100, 20, 20); // Başlangıç konumu ve boyutu
        frame.add(label);
        
        // Klavye odaklaması için görünmez panel eklenebilir
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 0, 0);
        panel.setFocusable(true);
        
        panel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int x = label.getX();
                int y = label.getY();

                switch (e.getKeyCode()) {
                    case KeyEvent.VK_LEFT:
                        label.setLocation(x - 10, y);
                        break;
                    case KeyEvent.VK_RIGHT:
                        label.setLocation(x + 10, y);
                        break;
                    case KeyEvent.VK_UP:
                        label.setLocation(x, y - 10);
                        break;
                    case KeyEvent.VK_DOWN:
                        label.setLocation(x, y + 10);
                        break;
                }
            }
        });

        frame.add(panel);
        frame.setVisible(true);
        panel.requestFocusInWindow(); // Tuşları algılaması için

	}

}
