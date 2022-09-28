package operacoesMatrizes;

/* Exercício 13
 * Aluno: FRANCISCO SANTANA DE SOUSA JÚNIOR – Matricula: 20210025969
 */
public class OperacoesMatrizes {
    public static void arrayOperations(){
        double matrix[][] = {
                {2,0,3},
                {5,6,7},
                {9,10,11}};

        double sumBelow = 0;
        double sumAbove = 0;
        double sumMain = 0;
        double smallestValue = matrix[1][1];
        double sumElements = 0;

        System.out.println("a) Average elements below main diagonal");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i>j){
                    sumBelow += matrix[i][j];
                }
            }
        }
        System.out.println("Sum: " + sumBelow/3);

        System.out.println("b) Average elements above main diagonal");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i<j){
                    sumAbove += matrix[i][j];
                }
            }
        }
        System.out.println("Sum: " + sumAbove/3);

        System.out.println("c) Average elements of main diagonal");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==j){
                    sumMain += matrix[i][j];
                }
            }
        }
        System.out.println("Sum: " + sumMain/3.0);

        System.out.println("d) Smallest element: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
               if(matrix[i][j] < smallestValue){
                   smallestValue = matrix[i][j];
               }
            }
        }
        System.out.println("SmallestValue: " + smallestValue);

        System.out.println("e) Sum of all Elements: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                sumElements += matrix[i][j];
            }
        }
        System.out.println("Sum: " + sumElements);

    }
}
