/*8) Classe CensoEngenhariaUFCG. (Difícil) Foi feita uma pesquisa para determinar o perfil dos
alunos que ingressaram na engenharia na UFCG num determinado semestre. Fazer um programa 
que:
• leia inicialmente o número total de alunos que prestaram vestibular para engenharia no 
semestre
• leia, em seguida, um número indeterminado de linhas com informações sobre os alunos que 
passaram no vestibular. Cada linha contém o sexo do aluno ('m' para masculino e 'f' para 
feminino) e o número de vezes que este aluno prestou vestibular. A última linha, que não 
entrará nos cálculos, contém no lugar do sexo a letra 'x'. Este é o "sinal" para parar de ler 
dados.
• determine e imprima;
o a porcentagem de alunos que passaram no vestibular;
o a porcentagem de alunos do sexo masculino que passaram no vestibular;
o a porcentagem de alunos, independente de sexo, que prestou vestibular 3 ou mais
vezes no período. */
package censoEngenharia;
import java.util.Scanner;
public class CensoEngenharia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double studentsTotal, studentsAproved = 0, male = 0, entranceExam, timesThree = 0;
        char genre;

        System.out.println("Type the amount of students who took the Entrance Exam: ");
        studentsTotal = sc.nextInt();

        do{
            System.out.println("Type the student's genre and the times he took the entrance exam: ");
            genre = sc.next().toUpperCase().charAt(0);
            if(genre == 'X'){
            break;
            }
            entranceExam = sc.nextInt();

            

            if(genre == 'M'){
                male++;
            }
            if(entranceExam >= 3){
                timesThree++;
            }

            System.out.println("Type 'x' to leave");
            studentsAproved++;
            
            System.out.println("" +studentsAproved);
            System.out.println(""+timesThree);
            System.out.println("" +male);




        }while(genre != 'X' && studentsAproved <= studentsTotal);
        
        double suceeded = (studentsAproved / studentsTotal) * 100;
        double malePercentage = (male / studentsAproved) * 100;
        double timesThreePercentage = (timesThree / studentsAproved) * 100;
   
        

        System.out.println("The percentage of students who suceeded in the exam is: " +suceeded+ "%");
        System.out.println("The percentage of male students is: " +malePercentage+ "%");
        System.out.println("The percentage of students who where aproved 3 times or more is: " +timesThreePercentage+ "%");
        sc.close();

    

        
    }
    
}
