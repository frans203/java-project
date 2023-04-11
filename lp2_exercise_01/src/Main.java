import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void create(int[][] matrix, boolean flag){
        Random random = new Random();
        for(int row=0;row<matrix.length;row++){
            for(int column=0;column<matrix[0].length;column++){
                matrix[row][column] = flag ? random.nextInt(10) : 0;
            }
        }
    }

    public static void print(int[][] matrix){
        for(int row=0;row<matrix.length;row++){
            for(int column=0;column<matrix[0].length;column++){
                System.out.printf("%d ", matrix[row][column]);
            }
        }
    }

    public static void multSequential(int[][] matrixA,
                                      int[][] matrixB,
                                      int[][] matrixResult){
        int resultRows = matrixResult.length;
        int resultColumns = matrixResult[0].length;
        int numberOfOperations = matrixB.length;
        for(int row=0;row<resultRows;row++){
            for(int column=0;column<resultColumns;column++){
                matrixResult[row][column] = 0;
                for(int i=0;i<numberOfOperations;i++){
                    matrixResult[row][column] += matrixA[row][i]*matrixB[i][column];
                }
            }
        }
    }

    public static void multConcurrentByCell(int[][] matrixA,
                                            int[][] matrixB,
                                            int[][] matrixResult){
        
    }
    public static void multConcurrentByQuadrant(int[][] matrixA,
                                                int[][] matrixB,
                                                int[][] matrixResult){
        Thread[][] threads = new Thread[2][2];
        for(int row=0;row<2;row++){
            for(int column=0;column<2;column++){
                threads[row][column] =
                        new MatrixHandlerByQuadrant(matrixA,
                                matrixB, matrixResult,row, column );
                threads[row][column].start();
            }
        }

        for(int row=0;row<2;row++) {
            for (int column = 0; column < 2; column++) {
                try{
                    threads[row][column].join();
                }catch (InterruptedException e){
                    System.out.println(e.getMessage());
                }
            }
        }

    }
    public static void main(String[] args) {
        int[][] matrixA,matrixB, matrixResult;
        matrixA= new int[8][8];
        matrixB = new int[8][8];
        matrixResult = new int[8][8];

        create(matrixA, true);
        create(matrixB, true);
        create(matrixResult, false);

        long startTime, endTime;
        double seqTime, concTime;


        startTime = System.nanoTime();
        multConcurrentByQuadrant(matrixA, matrixB, matrixResult);
        endTime = System.nanoTime();
        concTime = (double) (endTime - startTime) / 1000000;
        System.out.printf("Concurrent Time: %.4f ms%n", concTime);
    }
}

