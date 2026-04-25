# Path_finding_Visualizer
Pathfinding Visualizer (Java | OOP + DSA)
A Java-based interactive Pathfinding Visualizer built using Swing GUI, demonstrating core Data Structures & Algorithms (DSA) and Object-Oriented Programming (OOP) concepts.
Features:
Interactive grid-based environment

🟢 Start node & 🔴 End node selection

⬛ Add/remove obstacles (walls)

🔍 Visualize pathfinding algorithms:

Breadth-First Search (BFS)
Depth-First Search (DFS)
Dijkstra’s Algorithm
🟡 Shortest path highlighting

🎨 Real-time visualization using Java Swing

Concepts Used :
Data Structures & Algorithms:
Graph Traversal (BFS, DFS)
Shortest Path Algorithm (Dijkstra)
Queue, Stack, PriorityQueue
2D Grid Representation (Graph)
Object-Oriented Programming:
Encapsulation (Node properties)
Abstraction (Grid handling)
Class Design (Node, Grid, Algorithms)
Separation of Concerns
Project Structure:
PathfindingVisualizer/

│── Main.java # Entry point (GUI setup)

│── Grid.java # Grid UI + rendering

│── Node.java # Node structure (OOP model)

│── Algorithms.java # BFS, DFS, Dijkstra logic

How to Run:
1. Clone the repository:
2. Compile the code:
javac *.java
3. Run the application:
java Main

How to Use:
Click on grid: First click → Start node (Green) Second click → End node (Red) Further clicks → Toggle walls (Black)
Choose algorithm: BFS → Shortest path (unweighted) DFS → Depth traversal Dijkstra → Weighted shortest path
Output: Cyan → Visited nodes
Yellow → Final shortest path

📸 Demo:
<img width="754" height="830" alt="Screenshot 2026-04-25 151116" src="https://github.com/user-attachments/assets/1cdf75d0-8880-4652-a688-ae4eab19a70e" />


Pathfinding Visualizer (Java | OOP + DSA)
A Java-based interactive Pathfinding Visualizer built using Swing GUI, demonstrating core Data Structures & Algorithms (DSA) and Object-Oriented Programming (OOP) concepts.
Features:
Interactive grid-based environment

🟢 Start node & 🔴 End node selection

⬛ Add/remove obstacles (walls)

🔍 Visualize pathfinding algorithms:

Breadth-First Search (BFS)
Depth-First Search (DFS)
Dijkstra’s Algorithm
🟡 Shortest path highlighting

🎨 Real-time visualization using Java Swing

Concepts Used :
Data Structures & Algorithms:
Graph Traversal (BFS, DFS)
Shortest Path Algorithm (Dijkstra)
Queue, Stack, PriorityQueue
2D Grid Representation (Graph)
Object-Oriented Programming:
Encapsulation (Node properties)
Abstraction (Grid handling)
Class Design (Node, Grid, Algorithms)
Separation of Concerns
Project Structure:
PathfindingVisualizer/

│── Main.java # Entry point (GUI setup)

│── Grid.java # Grid UI + rendering

│── Node.java # Node structure (OOP model)

│── Algorithms.java # BFS, DFS, Dijkstra logic

How to Run:
1. Clone the repository:
git clone https://github.com/Saijaswanth18/Path_finding_Visualizer.git cd Path_finding_Visualizer

2. Compile the code:
javac *.java

3. Run the application:
java Main

How to Use:
Click on grid: First click → Start node (Green) Second click → End node (Red) Further clicks → Toggle walls (Black)
Choose algorithm: BFS → Shortest path (unweighted) DFS → Depth traversal Dijkstra → Weighted shortest path
Output: Cyan → Visited nodes
Yellow → Final shortest path

📸 Demo:
Future Improvements:
A* Algorithm implementation
Step-by-step animation
Speed control slider
Maze generator
Improved UI/UX
