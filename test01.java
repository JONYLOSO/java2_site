import java.util.Scanner;

class test01 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int matrixColumn1, matrixColumn2, matrixRow1, matrixRow2;
        do {
            System.out.print("Enter the matrix1 size\nmatrixRow 1     : ");
            matrixRow1 = sc.nextInt();
            System.out.print("matrixColumn 1  : ");
            matrixColumn1 = sc.nextInt();
            System.out.print("Enter the matrix2 size\nmatrixRow 2     : ");
            matrixRow2 = sc.nextInt();
            System.out.print("matrixColumn 2  : ");
            matrixColumn2 = sc.nextInt();
            if (matrixColumn1 != matrixRow2) {
                System.out.printf("matrix[%d][%d] and matrix[%d][%d]\nCan't multiply !!!\n", matrixRow1, matrixColumn1,
                        matrixRow2, matrixColumn2);
            }
        } while (matrixColumn1 != matrixRow2);

        int[][] matrix1 = new int[matrixRow1 + 1][matrixColumn1 + 1];
        int[][] matrix2 = new int[matrixRow2 + 1][matrixColumn2 + 1];
        int[][] matrixResult = new int[matrixRow1 + 1][matrixColumn2 + 1];

        System.out.println(" ---> Enter matrix1");
        inputMatrix(matrix1);
        System.out.println(" ---> Enter matrix2");
        inputMatrix(matrix2);
        showMatix(matrix1);

        for (int row = 1; row < matrix1.length; row++) {
            for (int column = 1; column < matrix2[row].length; column++) {
                int totalResult = 0;
                for (int count = 1; count < matrix2.length; count++)
                    totalResult += matrix1[row][count] * matrix2[count][column];
                matrixResult[row][column] = totalResult;
            }
        }
        showMatix(matrixResult);
    }

    public static void inputMatrix(int[][] matrix) {
        for (int i = 1; i < matrix.length; i++) {
            for (int x = 1; x < matrix[i].length; x++) {
                System.out.printf("matrix[%d][%d] => ", i, x);
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

}