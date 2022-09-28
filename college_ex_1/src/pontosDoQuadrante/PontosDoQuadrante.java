package pontosDoQuadrante;

import java.util.Scanner;

/* Exercício 11
 * Aluno: FRANCISCO SANTANA DE SOUSA JÚNIOR – Matricula: 20210025969
 */
public class PontosDoQuadrante {
    public static void points(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number for n: ");
        int n = scan.nextInt();
        if(n > 0 && n < 20){
            double arrX[] = new double[n];
            double arrY[] = new double[n];
            double arrQ[] = new double[n];
            System.out.println("ENTER VALUES FOR X ARRAY: ");
            for (int i=0;i<n;i++){
                System.out.println("arrX["+i+"]: ");
                arrX[i] = scan.nextDouble();
            }

            System.out.println("ENTER VALUES FOR Y ARRAY: ");
            for (int i=0;i<n;i++){
                System.out.println("arrY["+i+"]: ");
                arrY[i] = scan.nextDouble();
            }


            for(int i=0;i<n;i++){
                if(arrX[i] > 0 && arrY[i] > 0){
                    arrQ[i] = 1;
                }else if(arrX[i] < 0 && arrY[i] > 0){
                    arrQ[i] = 2;
                }else if(arrX[i] < 0 && arrY[i] < 0){
                    arrQ[i] = 3;
                }else if(arrX[i] > 0 && arrY[i] < 0){
                    arrQ[i] = 4;
                }else if(arrX[i] == 0 || arrY[i] ==0){
                    arrQ[i] = 0;
                }
            }
            System.out.println("Coordenadas (X,Y) e Quadrante");
            for(int i=0;i<n;i++){
                System.out.println("(" + arrX[i] + "," + arrY[i] + ") quadrante: " + arrQ[i]);
            }
        }else{
            return;
        }

    }
}
