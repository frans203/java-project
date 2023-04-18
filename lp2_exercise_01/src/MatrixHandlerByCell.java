public class MatrixHandlerByCell extends Thread{
    private int[][] matrixA, matrixB, matrixResult;
    private int row, column; //row and column of array of threads
    // for each element

    public MatrixHandlerByCell(int[][] matrixA, int[][] matrixB,
                               int[][] matrixResult, int row,
                               int column) {
        this.matrixA = matrixA;
        this.matrixB = matrixB;
        this.matrixResult = matrixResult;
        this.row = row;
        this.column = column;
    }

    public void run(){
        int quantityOfOperations = matrixB.length;
        matrixResult[row][column] = 0;
        for(int i=0;i<quantityOfOperations;i++){
            matrixResult[row][column] += matrixA[row][i]*matrixB[i][column];
        }
    }
}
