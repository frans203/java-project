package question03;

import java.util.Scanner;

public class UrnaDeVotacao {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String winner = "";
        String enter;
        int votesWinner = 0, i = 0, peopleVoting;
        int[] candidate = {0, 0, 0, 0};

        System.out.println("Type the amount of people to vote");
        peopleVoting = sc.nextInt();
        do{

            System.out.println("Type the candidate code \n" +
                    "111 - Maria da Silva \n"+
                    "222 - Pedro De Araújo \n"+
                    "333 - Jose de Souza \n");

            enter = sc.nextLine();

            if(enter.equals("111")){
                candidate[0]++;
            }else if(enter.equals("222")){
                candidate[1]++;
            }else if(enter.equals("333")){
                candidate[2]++;
            }else{
                candidate[3]++;
            }
            System.out.println(candidate[3]);
            i++;
        }while(i < peopleVoting + 1);


        if(candidate[0]>candidate[1] && candidate[0]>candidate[2]){
            winner = "Maria Silva";
            votesWinner = candidate[0];
        }else if(candidate[1]>candidate[2]){
            winner = "Pedro Araújo";
            votesWinner = candidate[1];
        }else{
            winner = "José de Sousa";
            votesWinner = candidate[2];
        }

        System.out.println(candidate[0]);
        System.out.println(candidate[1]);
        System.out.println(candidate[2]);
        System.out.println(candidate[3]);
        System.out.println("The winner was " + winner + " with " + votesWinner + " votes");
        System.out.println("The amount of valid votes was " +(peopleVoting - candidate[3]));
        System.out.println("The amount of invalid votes " +candidate[3]);

        sc.close();

        System.exit(0);



    }
}

