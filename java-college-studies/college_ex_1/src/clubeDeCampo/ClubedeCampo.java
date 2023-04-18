/*10) Classe ClubeDeCampo. (Difícil) Um clube de campo, com o intuito de conhecer o perfil de
seus frequentadores, criou um cadastro com as idades e alturas das pessoas que lá estiveram
num final de semana. Fazer um programa para:
a) Ler um inteiro N (1 <= N <= 10) correspondente ao número de pessoas cadastradas. Não 
permita o usuário digitar um número inválido;
b) Ler para os arrays "ID" e "ALT" os dados correspondentes à idade e à altura das pessoas 
cadastradas;
c) Calcular e imprimir os valores das alturas médias para as 4 faixas etárias que seguem: 
Faixa 1: idade menor ou igual a 10 anos;
Faixa 2: idade maior que 10 e menor ou igual a 15 anos; 
Faixa 3: idade maior que 15 e menor ou igual a 21 anos; 
Faixa 4: idade maior que 21 anos. */
package clubeDeCampo;
import java.util.Scanner;

public class ClubedeCampo {
    public static void main(String[] args) {

        double AGEArray[] = new double[10];
        double HEIGHTarray[] = new double[10];
        double N, age10 = 0, age15 = 0, age21 = 0, age21Above = 0, sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Type the number of people registrated: ");
        N = sc.nextInt();

        while(N < 0 || N > 10){
        System.out.println("THE NUMBER IS INVALID, TYPE AGAIN");
        System.out.println("Type the number of people registrated: ");
        N = sc.nextInt();
        }

        for(int i = 0; i < N; i++){
        System.out.println("Type the age of student "+ (i+1));
        AGEArray[i] = sc.nextDouble();
        System.out.println("Type the heigh of student " +(i+1));
        HEIGHTarray[i] = sc.nextDouble();
        System.out.println(AGEArray[i]);
        
        if(AGEArray[i] <= 10){
            age10++;
            sum1 += AGEArray[i];
        }if(AGEArray[i] > 10 && AGEArray[i] <= 15){
            age15++;
            sum2 += AGEArray[i];
        }if(AGEArray[i] > 15 && AGEArray[i] <= 21){
            age21++;
            sum3 += AGEArray[i];
        }if(AGEArray[i] > 21){
            age21Above++;
            sum4 += AGEArray[i];
        }
    }

        if(sum1 > 0){
        System.out.println("The average of students aged 10 or below is: " +(sum1 / age10));
        }
        if(sum2 > 0){
        System.out.println("The average of students aged 10 above and 15 below or equal is: " +(sum2 / age15));
        }
        if(sum3 > 0){
        System.out.println("The average of students ages 15 above year and 21 below or equal is: " +(sum3 / age21));
        }
        if(sum4 > 0){
        System.out.println("The average of students aged above 21 is: " +(sum4 / age21Above));
        }
        

        sc.close();




        

        
    }
    
}
