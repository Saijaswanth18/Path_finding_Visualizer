import javax.swing.*;
import java.awt.*;

public class Grid extends JPanel {

    int rows = 20, cols = 20;
    Node[][] grid = new Node[rows][cols];
    int cellSize = 30;

    Node start = null;
    Node end = null;

    public Grid(){
        setPreferredSize(new Dimension(cols * cellSize, rows * cellSize));

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                grid[i][j] = new Node(i, j);
            }
        }

        addMouseListener(new java.awt.event.MouseAdapter(){
            public void mousePressed(java.awt.event.MouseEvent e){
                int col = e.getX() / cellSize;
                int row = e.getY() / cellSize;

                if (start == null){
                    start = grid[row][col];
                } else if (end == null){
                    end = grid[row][col];
                } else{
                    grid[row][col].isWall = !grid[row][col].isWall;
                }
                repaint();
            }
        });
    }

    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                Node n = grid[i][j];

                if (n == start) g.setColor(Color.GREEN);
                else if (n == end) g.setColor(Color.RED);
                else if (n.isWall) g.setColor(Color.BLACK);
                else if (n.isPath) g.setColor(Color.YELLOW);
                else if (n.visited) g.setColor(Color.CYAN);
                else g.setColor(Color.WHITE);

                g.fillRect(j * cellSize, i * cellSize, cellSize, cellSize);
                g.setColor(Color.GRAY);
                g.drawRect(j * cellSize, i * cellSize, cellSize, cellSize);
            }
        }
    }
}