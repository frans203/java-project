/*Classe CensoAltura. (Médio) Tem-se um conjunto de dados contendo a altura e o sexo
(masculino, feminino) de 20 pessoas. Fazer um programa que calcule e escreva:
a) A maior e a menor altura do grupo;
b) A média das alturas das mulheres;
c) O número de homens. */
package censoAltura;
import java.util.Scanner;

public class CensoAltura {
    public static void main(String[] args){

        double height[];
        height = new double[21];

        String genre[];
        genre = new String[21];
        int female = 0, male = 0;
        double biggerHeight = height[1], smallestHeight = 10, femaleHeight = 0 ;


        Scanner sc =  new Scanner(System.in);


        for(int i = 1; i <= 20; i++){

            System.out.println("Type the student's " +i+ " height");
            height[i] = sc.nextDouble();

            if(height[i] > biggerHeight){
             biggerHeight = height[i];   
            }
            if(height[i] < smallestHeight){
                smallestHeight = height[i];
            }
  
            System.out.println("Type the student's" +i+ " genre");
            genre[i] = sc.next().toUpperCase();
            
            if(genre[i].equals("MALE")){
                male++ ;
            }else{
                female++;
                femaleHeight += height[i];
            }
            
        }
        
        System.out.println("The bigger height is: " +biggerHeight); 
        System.out.println("The smallest height is: " +smallestHeight);
        System.out.println("The female height average is: " +(double)(femaleHeight / female));
        System.out.println("The number of mans is: " + male);

       


        sc.close();
        

    
}
    
}
