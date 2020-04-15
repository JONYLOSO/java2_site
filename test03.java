class test03 {


    public static void main(String[] args){

        int graph[][] = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 }, 
                                      { 4, 0, 8, 0, 0, 0, 0, 1, 0 }, 
                                      { 0, 8, 0, 7, 0, 4, 0, 0, 2 }, 
                                      { 0, 0, 7, 0, 9, 14, 0, 0, 0 }, 
                                      { 0, 0, 0, 9, 0, 10, 0, 0, 0 }, 
                                      { 0, 0, 4, 14, 10, 0, 2, 0, 0 }, 
                                      { 0, 0, 0, 0, 0, 2, 0, 1, 6 }, 
                                      { 8, 1, 0, 0, 0, 0, 1, 0, 7 }, 
                                      { 0, 0, 2, 0, 0, 0, 6, 7, 0 } }; 

        int dist[] = new int[V]; 
        Boolean sptSet[] = new Boolean[V]; 
        for (int i = 0; i < V; i++) { 
            dist[i] = Integer.MAX_VALUE; 
            sptSet[i] = false; 
        } 




    }

    static int minDistance(int dist[], Boolean sptSet[]) 
    { 

        int min = Integer.MAX_VALUE, min_index = -1; 
  
        for (int v = 0; v < V; v++) {
            
            if (sptSet[v] == false && dist[v] < min) { 
                System.out.println("Comparin dist["+v+"] :: "+dist[v]+" <==> "+min); 
                min = dist[v]; 
                min_index = v; 
        
            } }
            System.out.println("End Times "); 
        return min_index; 
    } 



}