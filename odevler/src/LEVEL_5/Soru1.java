package LEVEL_5;
import javax.swing.*;
import java.awt.event.*;
public class Soru1 {

	public static void main(String[] args) {
		        JFrame frame = new JFrame("Tuş Dinleme - ASCII Göster");
		        JPanel panel = new JPanel();
		        JLabel label = new JLabel("Bir tuşa basın...");

		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.setSize(400, 200);
		        frame.setLocation(550,300);

		        panel.setFocusable(true);
		        panel.add(label); // JLabel panel'e ekleniyor

		        panel.addKeyListener(new KeyListener() {
		            @Override
		            public void keyTyped(KeyEvent e) {
		                // Gerek yok
		            }

		            @Override
		            public void keyPressed(KeyEvent e) {
		                int ascii = e.getKeyCode();
		                char karakter = e.getKeyChar();
		                	
		                String mesaj = "Tuş: '" + karakter + "' | ASCII: " + ascii;
		                label.setText(mesaj); // JLabel içeriğini güncelle

		                if (ascii == KeyEvent.VK_ESCAPE) {
		                    label.setText("ESC tuşuna basıldı, çıkılıyor...");
		                    frame.dispose(); // pencereyi kapat
		                    System.exit(0);  // programı sonlandır
		                }
		            }

		            @Override
		            public void keyReleased(KeyEvent e) {
		                // Gerek yok
		            }
		        });

		        frame.add(panel);
		        frame.setVisible(true);
		        panel.requestFocusInWindow(); // Panelin odak almasını sağlar
	}
}