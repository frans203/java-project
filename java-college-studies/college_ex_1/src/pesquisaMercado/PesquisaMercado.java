package pesquisaMercado;

/* Exercício 7
 * Aluno: FRANCISCO SANTANA DE SOUSA JÚNIOR – Matricula: 20210025969
 */
public class PesquisaMercado {
    public static void main(String args[]){
        int quantityMale = 0; int quantityFemale = 0; int yesVotes = 0; int noVotes = 0;

        for(int i=1;i<=2000;i++){
            if(i<=1000){ //female
                ++quantityFemale;
                if(i<=500){ //yes votes
                    ++yesVotes;
                }else{ //no votes
                    ++noVotes;
                }
            }else if(i>1000){ //male
                ++quantityMale;
                if(i<=1500){//yes votes
                    ++yesVotes;
                }else{ //no votes
                    ++noVotes;
                }
            }
        }
        int totalPeople = quantityFemale + quantityMale;

        System.out.println("Number of people who said yes: " + yesVotes);
        System.out.println("Number of people who said no: " + noVotes);
        System.out.println("Percentage females: " + quantityFemale * 100/totalPeople + "%");
        System.out.println("Percentage males: " + quantityMale * 100 /totalPeople + "%");
    }
}
