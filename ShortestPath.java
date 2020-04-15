
import java.util.*;
import java.lang.*;
import java.io.*;

//  Integer.MAX_VALUE 2147483647 Make like Infinite

class ShortestPath {

    static final int V = 9;
    static final Scanner sc = new Scanner(System.in);

    int minDistance(int dist[], Boolean sptSet[]) {

        int min = Integer.MAX_VALUE, min_index = -1;

        for (int v = 0; v < V; v++) {
            System.out.println("Comparin dist[" + v + "] :: " + dist[v] + " <= " + min);
            if (sptSet[v] == false && dist[v] <= min) {
                System.out.println("Choose the shortest distance => " + v);

                min = dist[v];
                min_index = v;

            }
        }
        System.out.println("*****************************************************************************");
        System.out.println("\t  ######## Choose the shortest distance ==> " + min_index + " #########  ");
        System.out.println("*****************************************************************************");
        return min_index;
    }

    void printSolution(int dist[], String cs[], Boolean spt[]) {
        System.out
                .println("------------------------------------------------------------------------------------------");
        System.out.printf("|\tVisited\t|\tVertex\t|\tDistance from%2d\t|\t  Shortest istance\t|\n", 5);
        System.out
                .println("------------------------------------------------------------------------------------------");
        for (int i = 0; i < V; i++) {
            System.out.printf("|\t%5s\t|\t%6d\t|\t%15d\t|\t\t%s\t\t|\n", spt[i], i, dist[i], cs[i]);
        }
        System.out
                .println("------------------------------------------------------------------------------------------");
    }

    void dijkstra(int graph[][], int src) {
        int dist[] = new int[V];
        Boolean sptSet[] = new Boolean[V];
        String[] cs = new String[V];
        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
            cs[i] = String.valueOf(src);
        }
        dist[src] = 0;

        for (int count = 0; count < V - 1; count++) {
            System.out.println(
                    "oO0OoO0OoO0OooO0OoO0OoO0OooO0OoO0OoO0OooO0OoO0OoO0OooO0OoO0OoO0OooO0OoO0OoO0OooO0OoO0OoO0OooO0OoO0OoO0Oo");
            int u = minDistance(dist, sptSet);
            sptSet[u] = true;
            for (int v = 0; v < V; v++) {
                if (!sptSet[v]) { // check visit
                    if (graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE) { // can go
                        System.out.println(
                                "()___)____________)()___)____________)()___)____________)()___)____________)()___)____________)");
                        System.out.println(u + " can go to :: " + v);
                        System.out.println(dist[u] + graph[u][v] + " == comparie => " + dist[v] + "\n");
                        if (dist[u] + graph[u][v] < dist[v]) {
                            System.out.printf("Start :: %d   Pass:: %d   To:: %d   Way:: %s   || %d  <  %d \n", src, u,
                                    v, cs[u], dist[u] + graph[u][v], dist[v]);
                            cs[v] = cs[u] + String.valueOf(v);
                            dist[v] = dist[u] + graph[u][v];
                        } else {
                            System.out.printf("Start :: %d   Pass:: %d   To:: %d   Way:: %s   || %d  <  %d \n", src, u,
                                    v, cs[u], dist[u] + graph[u][v], dist[v]);
                            System.out.printf("%d  more %d\n", dist[u] + graph[u][v], dist[v]);
                        }
                        System.out.println(
                                "()___)____________)()___)____________)()___)____________)()___)____________)()___)____________)\n");
                    }
                }

            }
            printSolution(dist, cs, sptSet);

            System.out.println(
                    "oO0OoO0OoO0OooO0OoO0OoO0OooO0OoO0OoO0OooO0OoO0OoO0OooO0OoO0OoO0OooO0OoO0OoO0OooO0OoO0OoO0OooO0OoO0OoO0Oo\n....");
            sc.nextLine();

        }

    }

    public static void main(String[] args) {
        // A B C D F E
        int graph[][] = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 }, { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
                { 0, 8, 0, 7, 0, 4, 0, 0, 2 }, { 0, 0, 7, 0, 9, 14, 0, 0, 0 }, { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                { 0, 0, 4, 14, 10, 0, 2, 0, 0 }, { 0, 0, 0, 0, 0, 2, 0, 1, 6 }, { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
        ShortestPath t = new ShortestPath();
        System.out.println("Start Point :" + 0);
        t.dijkstra(graph, 0);
    }
}