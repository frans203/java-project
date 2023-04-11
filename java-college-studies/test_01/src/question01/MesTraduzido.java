package question01;
import java.util.Scanner;
/* EQUIPE
 * FRANCISCO SANTANA DE SOUSA JÚNIOR – Matricula: 20210025969
 * ANA LAURA FERNANDES MENDONÇA - Matrícula: 20210025889
 */
public class MesTraduzido {
    public static void main(String[] args ){

        Scanner sc = new Scanner(System.in);

        int language, month;
        char option;


        do{
            System.out.println("Enter the number regarding to the year month:");
            month = sc.nextInt();
            System.out.println("Enter the number regarding to the language option:\n(1)Portuguese\n(2)English");
            language = sc.nextInt();

            if(language == 1){
                switch (month) {

                    case 1:
                        System.out.println("The month regarded to number " + month + " is Janeiro");
                        break;

                    case 2:
                        System.out.println("The month regarded to number " + month + " is Fevereiro");
                        break;

                    case 3:
                        System.out.println("The month regarded to number " + month + " is Marco");
                        break;

                    case 4:
                        System.out.println("The month regarded to number " + month + " is Abril");
                        break;

                    case 5:
                        System.out.println("The month regarded to number " + month + " is Maio");
                        break;

                    case 6:
                        System.out.println("The month regarded to number " + month + " is Junho");
                        break;

                    case 7:
                        System.out.println("The month regarded to number " + month + " is Julho");
                        break;

                    case 8:
                        System.out.println("The month regarded to number " + month + " is Agosto");
                        break;

                    case 9:
                        System.out.println("The month regarded to number " + month + " is Setembro");
                        break;

                    case 10:
                        System.out.println("The month regarded to number " + month + " is Outubro");
                        break;

                    case 11:
                        System.out.println("The month regarded to number " + month + " is Novembro");
                        break;

                    case 12:
                        System.out.println("The month regarded to number " + month + " is Dezembro");
                        break;

                }
            }


            if(language == 2){
                switch (month) {

                    case 1:
                        System.out.println("The month regarded to number " + month + " is January");
                        break;

                    case 2:
                        System.out.println("The month regarded to number " + month + " is February");
                        break;

                    case 3:
                        System.out.println("The month regarded to number " + month + " is March");
                        break;

                    case 4:
                        System.out.println("The month regarded to number " + month + " is April");
                        break;

                    case 5:
                        System.out.println("The month regarded to number " + month + " is May");
                        break;

                    case 6:
                        System.out.println("The month regarded to number " + month + " is June");
                        break;

                    case 7:
                        System.out.println("The month regarded to number " + month + " is July");
                        break;

                    case 8:
                        System.out.println("The month regarded to number " + month + " is August");
                        break;

                    case 9:
                        System.out.println("The month regarded to number " + month + " is September");
                        break;

                    case 10:
                        System.out.println("The month regarded to number " + month + " is October");
                        break;

                    case 11:
                        System.out.println("The month regarded to number " + month + " is November");
                        break;

                    case 12:
                        System.out.println("The month regarded to number " + month + " is December");
                        break;

                }
            }
            System.out.println("Would you like to consult another month?");
            option = sc.next().charAt(0);

        }while(option == 's');;


        sc.close();

    }

}