import java.util.Scanner;

class multiplyMatrix {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int matrixColumn1, matrixColumn2, matrixRow1, matrixRow2;
        do {
            System.out.print(" ---> Enter the matrix1 size\n\tmatrixRow 1     : ");         // input matrix1 size
            matrixRow1 = sc.nextInt();
            System.out.print("\tmatrixColumn 1  : ");
            matrixColumn1 = sc.nextInt();
            System.out.print(" ---> Enter the matrix2 size\n\tmatrixRow 2     : ");         // input matrix2 size
            matrixRow2 = sc.nextInt();
            System.out.print("\tmatrixColumn 2  : ");
            matrixColumn2 = sc.nextInt();
            line();
            if (matrixColumn1 != matrixRow2) {              // check multiply
                System.out.printf(" *** matrix[%d][%d] and matrix[%d][%d] ***\n\t !!! Can't multiply !!!\ntry again...(Enter)", matrixRow1, matrixColumn1,
                        matrixRow2, matrixColumn2);
                sc.nextLine();
                sc.nextLine();
                line();
            }else{
                System.out.printf(" *** matrix[%d][%d] and matrix[%d][%d] ***\n\t !!! Can multiply !!!\n", matrixRow1, matrixColumn1,
                matrixRow2, matrixColumn2);
            }
        } while (matrixColumn1 != matrixRow2);
        int[][] matrix1 = new int[matrixRow1 + 1][matrixColumn1 + 1];       // create matrix1
        int[][] matrix2 = new int[matrixRow2 + 1][matrixColumn2 + 1];       // create matrix2
        int[][] matrixResult = new int[matrixRow1 + 1][matrixColumn2 + 1];  // create matrixResult
        line(); System.out.println(" ---> Enter matrix1");          //   input matrix1
        inputMatrix(matrix1);
        System.out.println(" ---> Enter matrix2");          //   input matrix2
        inputMatrix(matrix2);
        line(); System.out.println(" ---> matrix1");
        showMatix(matrix1);
        System.out.println(" \t######   multiply   ######   "); 
        System.out.println(" ---> matrix2");
        showMatix(matrix2);
        multiplyMatrixSolution(matrix1, matrix2, matrixResult);
        line();
        System.out.println(" ---> result multiply");
        showMatix(matrixResult);
        line();
    }

    public static void multiplyMatrixSolution(int matrix1[][],int matrix2[][],int matrixResult[][]){
        for (int row = 1; row < matrix1.length; row++) {
            for (int column = 1; column < matrix2[1].length; column++) {
                int totalResult = 0;
                for (int count = 1; count < matrix2.length; count++)
                    totalResult += matrix1[row][count] * matrix2[count][column];
                matrixResult[row][column] = totalResult;
            }
        }
    }
    public static void inputMatrix(int[][] matrix) {
        for (int i = 1; i < matrix.length; i++) {
            for (int x = 1; x < matrix[i].length; x++) {
                System.out.printf("\tmatrix[%d][%d] => ", i, x);
                matrix[i][x] = sc.nextInt();
            }
        }
    }

    public static void showMatix(int[][] Matix) {
        for (int y = 1; y < Matix.length; y++) {
            System.out.print("|");
            for (int x = 1; x < Matix[y].length; x++)
                System.out.printf("%3d ", Matix[y][x]);
            System.out.println(" |");
        }
    }

    public static void line(){
            System.out.println("---------------------------------------");
    }

}