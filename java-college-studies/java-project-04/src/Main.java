import users.Parent;
import users.Student;
import users.Teacher;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int QUANTITY = 2;

//        Student student1 = new Student("Jose", "email@gmail.com", "993212", "25/04/2002", 22, "93242");
//        Student student2 = new Student("Jose games", "993212", "25/04/2002", 25, "93242");
//        Parent parent1 = new Parent("Jose", "email.com@gmail.com", "323232", "25/04/1960", 50);
//        Parent parent2 = new Parent("Jose games pai", "email.com@gmail.com", "323232", "25/04/1960", 50);

        Student[] studentArray = new Student[QUANTITY];
        Parent[] parentArray =  new Parent[QUANTITY];
        Teacher[] teacherArray = new Teacher[QUANTITY];

        Scanner scan = new Scanner(System.in);

        int option = 0;

        do{
            System.out.println("Select an option");
            System.out.println("1) Register Students");
            System.out.println("2) Register Parents");
            System.out.println("3) Show all Students");
            System.out.println("4) Show all Parents");
            System.out.println("5) Show single Student");
            System.out.println("6) Show single Parent");
            System.out.println("7) Register Teachers");
            System.out.println("8) Show Teachers");
            System.out.println("9) Show single Teacher");
            System.out.println("-1) Exit");
            option = scan.nextInt();

            if(option == 1){
                for(int i = 0; i < QUANTITY;i++){
                    Student student = new Student();
                    System.out.println("ENTER DATA FOR STUDENT " + (i + 1) + "\n");

                    System.out.println("Name: ");
                    String name = scan.next();
                    student.setName(name);

                    System.out.println("Email: ");
                    String email = scan.next();
                    student.setEmail(email);

                    System.out.println("Phone Number: ");
                    String phoneNumber = scan.next();
                    student.setPhoneNumber(phoneNumber);

                    System.out.println("Registration: ");
                    String registration = scan.next();
                    student.setRegistration(registration);

                    System.out.println("Birthdate: ");
                    String birthDate = scan.next();
                    student.setBirthDate(birthDate);

                    System.out.println("Age: ");
                    Number age = scan.nextInt();
                    student.setAge(age);

                    studentArray[i] = student;

                }

                System.out.println("SHOWING ALL STUDENTS: ");
                showAllStudents(studentArray, QUANTITY);


            }else if(option == 2){
                for(int i = 0; i < QUANTITY;i++){
                    Parent parent = new Parent();
                    System.out.println("ENTER DATA FOR PARENT " + (i + 1) + "\n");

                    System.out.println("Name: ");
                    String name = scan.next();
                    parent.setName(name);

                    System.out.println("Email: ");
                    String email = scan.next();
                    parent.setEmail(email);


                    System.out.println("Phone Number: ");
                    String phoneNumber = scan.next();
                    parent.setPhoneNumber(phoneNumber);

                    System.out.println("Birth Date: ");
                    String birthDate = scan.next();
                    parent.setBirthDate(birthDate);

                    System.out.println("Age: ");
                    Number age = scan.nextInt();
                    parent.setAge(age);

                    parentArray[i] = parent;

                }

                System.out.println("SHOWING ALL PARENTS: ");
                showAllParents(parentArray, QUANTITY);

            }else if(option == 3){
                System.out.println("SHOWING ALL STUDENTS: ");
                showAllStudents(studentArray, QUANTITY);
            }else if(option == 4){
                System.out.println("SHOWING ALL PARENTS: ");
                showAllParents(parentArray, QUANTITY);
            }else if(option == 5){
                System.out.println("Enter a position(1-5) for a student: ");
                int position = scan.nextInt();
                printOneStudent(studentArray, position);
            }else if(option == 6){
                System.out.println("Enter a position(1-5) for a parent: ");
                int position = scan.nextInt();
                printOneParent(parentArray, position);
            }else if(option == 7){
                for(int i = 0; i < QUANTITY;i++){
                    Teacher teacher = new Teacher();
                    System.out.println("ENTER DATA FOR TEACHER " + (i + 1) + "\n");

                    System.out.println("Name: ");
                    String name = scan.next();
                    teacher.setName(name);

                    System.out.println("Email: ");
                    String email = scan.next();
                    teacher.setEmail(email);

                    System.out.println("Phone Number: ");
                    String phoneNumber = scan.next();
                    teacher.setPhoneNumber(phoneNumber);

                    System.out.println("Registration: ");
                    String registration = scan.next();
                    teacher.setRegistration(registration);

                    System.out.println("Subject: ");
                    String subject = scan.next();
                    teacher.setSubject(subject);

                    teacherArray[i] = teacher;

                }
                System.out.println("SHOWING ALL TEACHERS: ");
                showAllTeachers(teacherArray, QUANTITY);
            }else if(option == 8){
                System.out.println("SHOWING ALL TEACHERS: ");
                showAllTeachers(teacherArray, QUANTITY);
            }else if(option == 9){
                System.out.println("Enter a position(1-5) for a teacher: ");
                int position = scan.nextInt();
                printOneTeacher(teacherArray, position);
            }



        }while(option != -1);
    }

    public static void showAllParents(Parent[] arr, int QUANTITY){
        for(int i = 0; i < QUANTITY;i++){
            System.out.println("parent number " + (i + 1) + "\n");
            System.out.println("name: " + arr[i].getName());
            System.out.println("age: " + arr[i].getAge());
            System.out.println("birthdate: " + arr[i].getBirthDate());
            System.out.println("email: " + arr[i].getEmail());
            System.out.println("phone number: " + arr[i].getPhoneNumber());
            System.out.println("\n");
        }
    }

    public static void showAllStudents(Student[] arr, int QUANTITY){
        for(int i = 0; i < QUANTITY;i++){
            System.out.println("student number " + (i + 1) + "\n");
            System.out.println("name: " + arr[i].getName());
            System.out.println("age: " + arr[i].getAge());
            System.out.println("birthdate: " + arr[i].getBirthDate());
            System.out.println("registration: " + arr[i].getRegistration());
            System.out.println("email: " + arr[i].getEmail());
            System.out.println("phone number: " + arr[i].getPhoneNumber());
            System.out.println("\n");
        }
    }

    public static void showAllTeachers(Teacher[] arr, int QUANTITY){
        for(int i = 0; i < QUANTITY;i++){
            System.out.println("teacher number " + (i + 1) + "\n");
            System.out.println("name: " + arr[i].getName());
            System.out.println("registration: " + arr[i].getRegistration());
            System.out.println("email: " + arr[i].getEmail());
            System.out.println("phone number: " + arr[i].getPhoneNumber());
            System.out.println("subject: " + arr[i].getSubject());
            System.out.println("\n");
        }
    }

    public static void printOneStudent(Student[] arr, int position){
        if(position > 0 && position < 5){
            System.out.println("SHOWING STUDENT NUMBER " + (position));
            System.out.println("name: " + arr[position - 1].getName());
            System.out.println("age: " +  arr[position - 1].getAge());
            System.out.println("birthdate: " +  arr[position - 1].getBirthDate());
            System.out.println("registration: " +  arr[position - 1].getRegistration());
            System.out.println("email: " +  arr[position - 1].getEmail());
            System.out.println("phone number: " +  arr[position - 1].getPhoneNumber());
            System.out.println("\n");
        }
    }
    public static void printOneParent(Parent[] arr, int position){
        if(position > 0 && position < 5){
            System.out.println("SHOWING PARENT NUMBER " + (position));
            System.out.println("name: " + arr[position - 1].getName());
            System.out.println("age: " +  arr[position - 1].getAge());
            System.out.println("birthdate: " +  arr[position - 1].getBirthDate());
            System.out.println("email: " +  arr[position - 1].getEmail());
            System.out.println("phone number: " +  arr[position - 1].getPhoneNumber());
            System.out.println("\n");
        }
    }

    public static void printOneTeacher(Teacher[] arr, int position){
        if(position > 0 && position < 5){
            System.out.println("SHOWING STUDENT NUMBER " + (position));
            System.out.println("name: " + arr[position - 1].getName());
            System.out.println("registration: " +  arr[position - 1].getRegistration());
            System.out.println("email: " +  arr[position - 1].getEmail());
            System.out.println("phone number: " +  arr[position - 1].getPhoneNumber());
            System.out.println("subject: " + arr[position - 1].getSubject());
            System.out.println("\n");
        }
    }




}