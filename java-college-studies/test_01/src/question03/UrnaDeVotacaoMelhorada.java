package question03;

import javax.swing.*;
import java.util.Scanner;

/* EQUIPE
 * FRANCISCO SANTANA DE SOUSA JÚNIOR – Matricula: 20210025969
 * ANA LAURA FERNANDES MENDONÇA - Matrícula: 20210025889
 */
public class UrnaDeVotacaoMelhorada {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String winner = "";
        String enter;
        int votesWinner = 0, i = 0, peopleVoting = 0;
        int[] candidate = {0, 0, 0, 0};

        System.out.println("Type the amount of people to vote");
        peopleVoting = sc.nextInt();
        do{

            System.out.println("Type the candidate code \n" +
                    "111 - Maria da Silva \n"+
                    "222 - Pedro De Araújo \n"+
                    "333 - Jose de Souza \n");

            enter = sc.next();

            if(enter.equals("111")){
                candidate[0]++;
            }else if(enter.equals("222")){
                candidate[1]++;
            }else if(enter.equals("333")){
                candidate[2]++;
            }else{
                candidate[3]++;
            }
            i++;
        }while(i < peopleVoting);




        if(candidate[0]>candidate[1] && candidate[0]>candidate[2] && candidate[0]>candidate[3]){
            winner = "Maria Silva";
            votesWinner = candidate[0];
        }else if(candidate[1]>candidate[0] && candidate[1]>candidate[2] && candidate[1]>candidate[3] ){
            winner = "Pedro Araújo";
            votesWinner = candidate[1];
        }else if(candidate[2]>candidate[1] && candidate[2]>candidate[0] && candidate[2]>candidate[3] ){
            winner = "José de Sousa";
            votesWinner = candidate[2];
        }

        int sumValidVotes = candidate[0] + candidate[1] + candidate[2];
        double percentual1 = (double)candidate[0]/sumValidVotes * 100;
        double percentual2 = (double)candidate[1]/sumValidVotes * 100;
        double percentual3 = (double)candidate[2]/sumValidVotes * 100;


        System.out.println("The winner was " + winner + " with " + votesWinner + " votes");
        System.out.println("The amount of valid votes was " +(peopleVoting - candidate[3]));
        System.out.println("The amount of invalid votes " + candidate[3]);
        System.out.println("Percentual for each Candidate: ");
        System.out.printf("Candidate 1: %.2f %% \n", percentual1 );
        System.out.printf("Candidate 2: %.2f %% \n", percentual2 );
        System.out.printf("Candidate 3: %.2f %% \n", percentual3 );

        sc.close();

        System.exit(0);



    }

}
