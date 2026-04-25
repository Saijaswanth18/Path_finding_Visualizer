import java.util.*;

public class Algorithms {

    static int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};

    public static void bfs(Grid grid) {
        Queue<Node> q = new LinkedList<>();
        Node start = grid.start;

        start.visited = true;
        q.add(start);

        while (!q.isEmpty()) {
            Node curr = q.poll();

            if (curr == grid.end) {
                markPath(grid);
                return;
            }

            for (int[] d : directions) {
                int r = curr.row + d[0];
                int c = curr.col + d[1];

                if (valid(grid, r, c)) {
                    Node next = grid.grid[r][c];
                    next.visited = true;
                    next.parent = curr;
                    q.add(next);
                }
            }
        }
    }

    public static void dfs(Grid grid) {
        Stack<Node> stack = new Stack<>();
        stack.push(grid.start);

        while (!stack.isEmpty()) {
            Node curr = stack.pop();

            if (curr.visited) continue;
            curr.visited = true;

            if (curr == grid.end) {
                markPath(grid);
                return;
            }

            for (int[] d : directions) {
                int r = curr.row + d[0];
                int c = curr.col + d[1];

                if (valid(grid, r, c)) {
                    Node next = grid.grid[r][c];
                    next.parent = curr;
                    stack.push(next);
                }
            }
        }
    }

    public static void dijkstra(Grid grid) {
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(n -> n.distance));

        Node start = grid.start;
        start.distance = 0;
        pq.add(start);

        while (!pq.isEmpty()) {
            Node curr = pq.poll();

            if (curr.visited) continue;
            curr.visited = true;

            if (curr == grid.end) {
                markPath(grid);
                return;
            }

            for (int[] d : directions) {
                int r = curr.row + d[0];
                int c = curr.col + d[1];

                if (valid(grid, r, c)) {
                    Node next = grid.grid[r][c];
                    int newDist = curr.distance + 1;

                    if (newDist < next.distance) {
                        next.distance = newDist;
                        next.parent = curr;
                        pq.add(next);
                    }
                }
            }
        }
    }

    private static boolean valid(Grid grid, int r, int c) {
        return r >= 0 && c >= 0 && r < grid.rows && c < grid.cols &&
               !grid.grid[r][c].visited &&
               !grid.grid[r][c].isWall;
    }
    public static void markPath(Grid grid) {
    Node curr = grid.end;

    while (curr != null) {
        curr.isPath = true;
        curr = curr.parent;
    }
}
}