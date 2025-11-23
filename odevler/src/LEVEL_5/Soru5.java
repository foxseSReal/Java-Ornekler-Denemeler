package LEVEL_5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Soru5 extends JPanel implements KeyListener {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	final int ROWS = 20, COLS = 30;
    char[][] grid = new char[ROWS][COLS];
    int playerRow, playerCol;
    int score = 0;
    boolean gameOver = false, gameWin = false;

    public Soru5() {
        setPreferredSize(new Dimension(600, 400));
        setFocusable(true);
        addKeyListener(this);
        initializeGrid();
    }

    void initializeGrid() {
        for (int i = 0; i < ROWS; i++)
            for (int j = 0; j < COLS; j++)
                grid[i][j] = ' ';

        placeRandom('.', 20); // yem
        placeRandom('x', 80); // engel
        placeRandom('m', 30); // mayın
        placeRandom('c', 1);  // çıkış

        while (true) {
            int r = new Random().nextInt(ROWS);
            int c = new Random().nextInt(COLS);
            if (grid[r][c] == ' ') {
                grid[r][c] = 'o';
                playerRow = r;
                playerCol = c;
                break;
            }
        }
    }

    void placeRandom(char ch, int count) {
        Random rand = new Random();
        while (count > 0) {
            int r = rand.nextInt(ROWS);
            int c = rand.nextInt(COLS);
            if (grid[r][c] == ' ') {
                grid[r][c] = ch;
                count--;
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("Monospaced", Font.PLAIN, 16));

        for (int i = 0; i < ROWS; i++) {
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < COLS; j++) {
                line.append(grid[i][j]);
            }
            g.drawString(line.toString(), 10, 20 + i * 18);
        }

        if (gameOver) {
            g.drawString("Mayına bastın! Oyun bitti. Puan: " + score, 10, 380);
        } else if (gameWin) {
            g.drawString("Tebrikler! Çıkışa ulaştın. Puan: " + score, 10, 380);
        } else {
            g.drawString("Puan: " + score, 10, 380);
        }
    }

    void movePlayer(int dr, int dc) {
        if (gameOver || gameWin) return;

        int newR = playerRow + dr;
        int newC = playerCol + dc;

        if (newR < 0 || newR >= ROWS || newC < 0 || newC >= COLS) return;

        char target = grid[newR][newC];

        if (target == 'x') return;

        if (target == 'm') {
            gameOver = true;
        } else if (target == '.') {
            score += 10;
        } else if (target == 'c') {
            if (remainingYem() == 0) {
                gameWin = true;
            } else {
                return;
            }
        }

        grid[playerRow][playerCol] = ' ';
        grid[newR][newC] = 'o';
        playerRow = newR;
        playerCol = newC;

        repaint();
    }

    int remainingYem() {
        int count = 0;
        for (char[] row : grid)
            for (char ch : row)
                if (ch == '.') count++;
        return count;
    }

    @Override public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP -> movePlayer(-1, 0);
            case KeyEvent.VK_DOWN -> movePlayer(1, 0);
            case KeyEvent.VK_LEFT -> movePlayer(0, -1);
            case KeyEvent.VK_RIGHT -> movePlayer(0, 1);
        }
    }

    @Override public void keyReleased(KeyEvent e) {}
    @Override public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Labirent Oyunu - Soru5");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new Soru5());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
