import javax.xml.namespace.QName;

class test00{
    public static void main(String[] args){


    int[][] x ={{1,1,1,5},
                {2,2,2},
                {3,3,3,3,3}};

    int[][] m1={{1,2},
                {5,5}};
    
    int[][] m2={{1,3},
                {5,3}};          

    System.out.println(x[1].length);
    mMatix(m1);
    showMatix(m1);
    }

    public static void mMatix(int[][] m1){
        for(int x=0;x<2;x++){
            for(int y=0;y<2;y++){
                    int t =m[x][y]
            }
            System.out.printf(t);
        }
    }


    public static void showMatix(int[][] Matix){
        for(int y=0;y<Matix.length;y++){
            for(int x=0;x<Matix[y].length;x++)
                System.out.printf("%d ",Matix[y][x]);
        System.out.println("");        
        }
    }
}