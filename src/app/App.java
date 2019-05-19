package app;

import java.util.Scanner;

public class App {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        int x;

        System.out.println("1) Dijkstra's algorithm\n" + "2) Prim's algorithm\n" + "3) Exit");
        System.out.println("Enter an action: ");
        x = input.nextInt();

        while(true){

            switch(x){

                case 1:
                enter1();
                break;
                case 2:
                enter2();
                break;
                case 3:
                input.close();
                return;
                default:
                System.out.println("Invalid Input.");
    
            }

            System.out.println("Enter an action: ");
            System.out.println("1) Dijkstra's algorithm\n" + "2) Prim's algorithm\n" + "3) Exit");
            x = input.nextInt();

        }

    }

    public static void enter1(){

        SSSPGraph graph1 = new SSSPGraph();
        int n;
        int m;
        int ids;
        int idd;
        int w;

        System.out.println("Enter the number of nodes:");
        n = input.nextInt();
        System.out.println("Enter the number of edges:");
        m = input.nextInt();
        System.out.println("Enter the values of the nodes:");

        for(int i = 0; i < n; i++){

            ids = input.nextInt();
            graph1.addNode(ids);

        }

        System.out.println("Enter the edges and their weights:");

        for(int j = 0; j < m; j++){

            System.out.println("Enter the source node:");
            ids = input.nextInt();
            System.out.println("Enter the destination node:");
            idd = input.nextInt();
            System.out.println("Enter the weight:");
            w = input.nextInt();
            graph1.addEdge(ids, idd, w);

        }

        System.out.println("Enter the source node for Dijkstra's approach:");
        ids = input.nextInt();
        graph1.DijkstrasAlg(ids);

        /** graph1.addNode(1);
        graph1.addNode(2);
        graph1.addNode(3);
        graph1.addNode(4);
        graph1.addNode(5);
        graph1.addEdge(1, 2, 2);
        graph1.addEdge(1, 3, 12);
        graph1.addEdge(4, 1, 10);
        graph1.addEdge(2, 3, 8);
        graph1.addEdge(3, 4, 6);
        graph1.addEdge(3, 5, 3);
        graph1.addEdge(5, 2, 4);
        graph1.addEdge(2, 5, 9);
        graph1.addEdge(5, 4, 2);
        graph1.addEdge(4, 5, 4);
        graph1.DijkstrasAlg(1); */

    }

    public static void enter2(){

        MST graph2 = new MST();
        int n;
        int m;
        int id1;
        int id2;
        int w;
        System.out.println("Enter the number of nodes:");
        n = input.nextInt();
        System.out.println("Enter the number of edges:");
        m = input.nextInt();
        System.out.println("Enter the values of the nodes:");

        for(int i = 0; i < n; i++){

            id1 = input.nextInt();
            graph2.addNode(id1);

        }

        System.out.println("Enter the edges and their weights:");

        for(int j = 0; j < m; j++){

            System.out.println("Enter the first node:");
            id1 = input.nextInt();
            System.out.println("Enter the second node:");
            id2 = input.nextInt();
            System.out.println("Enter the weight:");
            w = input.nextInt();
            graph2.addEdge(id1, id2, w);

        }

        System.out.println("Enter the Root node for Prim's MST:");
        id1 = input.nextInt();
        graph2.PrimsAlg(id1);

    }

}