package eleicaoSindical;

import java.util.Scanner;
/* Exercício 5
 * Aluno: FRANCISCO SANTANA DE SOUSA JÚNIOR – Matricula: 20210025969
 */
public class EleicaoSindical {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter votes of candidate A: ");
        int votesA = scan.nextInt();
        System.out.println("Enter votes of Candidate B: ");
        int votesB = scan.nextInt();
        System.out.println("Enter voes of candidate C: ");
        int votesC = scan.nextInt();
        System.out.println("Enter null votes: ");
        int nullVotes = scan.nextInt();
        System.out.println("Enter white votes: ");
        int whiteVotes = scan.nextInt();

        int totalVotes = votesA + votesB + votesC + nullVotes + whiteVotes;
        int validVotes = votesA + votesB + votesC;

        System.out.println("Total of voters: " + totalVotes);
        System.out.println("Valid votes: " + validVotes);

        System.out.println("valid votes percentage: " + (validVotes * 100/totalVotes) + "%");
        System.out.println("Candidate A votes percentage: " + (votesA * 100/totalVotes) + "%");
        System.out.println("Candidate B votes percentage: " + (votesB * 100/totalVotes) + "%");
        System.out.println("Candidate C votes percentage: " + (votesC * 100/totalVotes) + "%");
        System.out.println("null votes percentage: " + (nullVotes * 100/totalVotes) + "%");
        System.out.println("white votes percentage: " + (whiteVotes * 100/totalVotes) + "%");






    }
}
