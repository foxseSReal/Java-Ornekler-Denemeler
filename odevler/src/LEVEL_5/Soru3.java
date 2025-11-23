package LEVEL_5;
import javax.swing.*;
import java.awt.event.*;
public class Soru3 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Hareketli Şiir");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setLayout(null); // Serbest yerleşim için layout null

        // Şiir
        String poem = "<html>Bedeninde et,kemik,sinir kaldıkça,<br>" +
                      "Dünyadaki yerini bil,kendinden şaşma.<br>" +
                      "Düşman Zaloğlu Rüstem olsada ger göğsünü,<br>" +
                      "Dostun Karun olsa iyilik altında kalma</html>";

        // JLabel oluştur
        JLabel label = new JLabel(poem);
        label.setBounds(140, 30, 250, 200); // Başlangıç pozisyonu
        frame.setLocation(500,200);
        frame.add(label);

        // KeyListener ile yön tuşlarıyla hareketi sağla
        label.setFocusable(true);
        label.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int x = label.getX();
                int y = label.getY();

                // Yön tuşları ile hareket
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_LEFT:
                        label.setLocation(x - 10, y); // Sol
                        break;
                    case KeyEvent.VK_RIGHT:
                        label.setLocation(x + 10, y); // Sağ
                        break;
                    case KeyEvent.VK_UP:
                        label.setLocation(x, y - 10); // Yukarı
                        break;
                    case KeyEvent.VK_DOWN:
                        label.setLocation(x, y + 10); // Aşağı
                        break;
                }
            }
        });

        frame.setVisible(true);
        label.requestFocusInWindow(); // Klavye odaklanmasını sağla
		
	}

}
