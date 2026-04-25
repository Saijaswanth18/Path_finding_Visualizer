import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Pathfinding Visualizer");
        Grid grid = new Grid();

        JButton bfsBtn = new JButton("BFS");
        JButton dfsBtn = new JButton("DFS");
        JButton dijBtn = new JButton("Dijkstra");

        bfsBtn.addActionListener(e -> { 
            Algorithms.bfs(grid);
            grid.repaint();
        });
        dfsBtn.addActionListener(e -> {
            Algorithms.dfs(grid);
            grid.repaint();
        });
        dijBtn.addActionListener(e -> {
            Algorithms.dijkstra(grid);
            grid.repaint();
        });

        JPanel panel = new JPanel();
        panel.add(bfsBtn);
        panel.add(dfsBtn);
        panel.add(dijBtn);

        frame.add(grid, "Center");
        frame.add(panel, "South");

        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}