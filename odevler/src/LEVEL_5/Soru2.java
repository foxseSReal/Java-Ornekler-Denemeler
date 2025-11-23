package LEVEL_5;
import javax.swing.*;
import java.awt.event.*;
public class Soru2 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Daktilo Programı");
        JTextArea textArea = new JTextArea();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setLocation(500,300);
        textArea.setFocusable(true);
        textArea.setEditable(false); // Kullanıcı elle yazamasın, sadece tuşla

        textArea.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();

                // Sadece harf, rakam ve enter kabul edilir
                if (Character.isLetterOrDigit(c) || Character.isWhitespace(c)) {
                    if (c == '\n' || c == '\r') {
                        textArea.append("\n");
                    } else {
                        textArea.append(String.valueOf(c));
                    }
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                // Gerek yok
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // Gerek yok
            }
        });
        frame.add(new JScrollPane(textArea));
        frame.setVisible(true);
        textArea.requestFocusInWindow(); // Yazmaya hazır olsun
	}

}
