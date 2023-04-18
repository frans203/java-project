package question02;

import java.util.Random;

/* EQUIPE
 * FRANCISCO SANTANA DE SOUSA JÚNIOR – Matricula: 20210025969
 * ANA LAURA FERNANDES MENDONÇA - Matrícula: 20210025889
 */
public class ImparPar {
    public static void main(String args[]){
        Random rand = new Random();

        int par[] = new int[10];
        int impar[] = new int[10];

        for(int i=0;i<10;i++){
            int valuePar = rand.nextInt(30/2) * 2;
            if(valuePar == 0){
                valuePar = 2;
            }
            int valueImpar = rand.nextInt(30/2) * 2 + 1;
            par[i] = valuePar;
            impar[i] = valueImpar;

        }
        System.out.println("ARRAY PARES: ");
        for(int i=0;i<10;i++){
            System.out.println("pares[" + i+ "] = " +par[i]);
        }

        System.out.println("ARRAY IMPARES: ");
        for(int i=0;i<10;i++){
            System.out.println("impar[" + i+ "] = " + impar[i]);

        }
    }
}
