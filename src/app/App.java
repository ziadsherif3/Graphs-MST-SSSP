package app;

public class App {
    public static void main(String[] args) throws Exception {

        SSSPGraph graph1 = new SSSPGraph();
        graph1.addEdge(3, 2, 4);
        graph1.addNode(3);
        graph1.addNode(2);
        graph1.addEdge(3, 2, 4);
        graph1.addEdge(2, 3, 4);
        graph1.addEdge(2, 3, 2);
        graph1.DijkstrasAlg(2);

    }
}