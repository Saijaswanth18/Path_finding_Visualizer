public class Node {
    int row, col;
    boolean isWall = false;
    boolean visited = false;
    Node parent = null;
    int distance = Integer.MAX_VALUE;
    boolean isPath = false;

    public Node(int r, int c) {
        this.row = r;
        this.col = c;
    }
}