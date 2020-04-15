import java.util.Scanner;

class test {
    
    public static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        int map[][] = new int[][] { { 0, 2, 1, 4, 0, 0, 0 }, 
                                    { 2, 0, 2, 0, 3, 0, 0 },
                                    { 1, 2, 0, 2, 5, 7, 0 }, 
                                    { 4, 0, 2, 0, 0, 4, 0 }, 
                                    { 0, 3, 5, 0, 0, 0, 3 },
                                    { 0, 0, 7, 4, 0, 0, 3 }, 
                                    { 0, 0, 0, 0, 1, 3, 0 } };
        System.out.print("Input Start Point (0-6) => ");
        int startPoint =sc.nextInt();
        sc.nextLine();
        dijkstra(map, startPoint);

    }

    public static void printTableSolution(int point[], String route[], boolean visited[],int startPoint) {
        System.out.printf("\n=========================================================================================\n\t\t\tThe shortest distance from the point  %d\n=========================================================================================\n",startPoint);
        System.out.printf("|    Visited    |     Vertex    |     Distance from %2d     |\t  Shortest Route \t|\n",startPoint);
        System.out.println("=========================================================================================");
        for (int i = 0; i < point.length; i++) {
            System.out.printf("|      %5s    |    %5d      |  %13d\t   |\t\t%s\t\t|\n", visited[i], i, point[i], route[i]);
        }
        System.out.println("=========================================================================================\n");
    }

    public static int minDistance(int point[], boolean visited[], int startPoint) {

        int min = Integer.MAX_VALUE, minIndex=0;

        for (int i = 0; i < point.length; i++) {
            if (visited[i] == false && point[i] <= min) {
                min = point[i];
                minIndex = i;
            }
        }
        System.out.println("########    Choose the point where the shortest distance and not visited ==> " + minIndex + "   ########");
        System.out.println("=========================================================================================\n * Start at point a then pass point "+startPoint+" and finish at point "+minIndex+" and point not visited *");
        return minIndex;
    }

    public static void dijkstra(int map[][], int startPoint) {
        int[] point = new int[map.length];
        boolean[] visited = new boolean[map.length];
        String[] route = new String[map.length];
        for (int i = 0; i < map.length; i++) {
            point[i] = 999999;          // like infinnte  (this case range 0-999999);
            visited[i] = false;         
            route[i] = String.valueOf(startPoint);
        }
        point[startPoint] = 0;

        printTableSolution(point ,route ,visited ,startPoint );

        for (int i = 0; i < map.length ; i++) {
            int start = minDistance(point, visited, startPoint);
            visited[start] = true;
            int checkFind=0;
            for (int visit = 0; visit < map.length; visit++) {
                if (!visited[visit] && map[start][visit] != 0 && point[start] != 999999) {
                    System.out.printf(" --->   Point %d can go to point %d\n", start, visit);
                    System.out.printf("\tStart    => %3d    Pass  => %s    To => %3d\n\tDistance => %3d    Route => %s\n", startPoint ,route[start] ,visit ,map[start][visit],route[start] + String.valueOf(visit));
                    if (point[start] + map[start][visit] < point[visit]) {
                        System.out.printf("\t- This route is shortest distance point %d to point %d\n\t\t- Start => %3d  To => %3d  Distance => %3d  Route => %s\n",startPoint,visit,startPoint,visit,point[start] + map[start][visit],route[start] + String.valueOf(visit));
                        System.out.printf("\t\t- Less\n\t\t- Start => %3d  To => %3d  Distance => %3d  Route => %s\n",startPoint,visit,point[visit],route[visit]);
                        route[visit] = route[start] + String.valueOf(visit);
                        point[visit] = point[start] + map[start][visit];
                        
                    } else {
                        System.out.printf("\t- This route not is shortest distance point %d to point %d\n\t\t- Start => %3d  To => %3d  Distance => %3d  Route => %s\n\t\t- More\n\t\t- Start => %3d  To => %3d  Distance => %3d  route => %s\n",startPoint,visit,startPoint,visit,point[start] + map[start][visit],route[start] + String.valueOf(visit),startPoint,visit,point[start],route[visit]);

                    }
                    System.out.println("------------------------------------------------------------------------------------------");
                }else{
                    ++checkFind;
                    if(checkFind==map.length) System.out.printf(" --->\tNot Found !!!\n------------------------------------------------------------------------------------------\n");
                }
            }
            System.out.print("Next step..."); sc.nextLine();
            printTableSolution(point, route, visited,startPoint);
        }

    }

}