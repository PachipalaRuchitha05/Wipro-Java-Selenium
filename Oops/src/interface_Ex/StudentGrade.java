 package interface_Ex;
import java.util.InputMismatchException;
 import java.util.Scanner;
 public class StudentGrade {

        public static void main(String[] args) {

                 Scanner scan = new Scanner(System.in);

               try {

                 System.out.println("enter the number students :");

                     int students = scan.nextInt();

                     for (int i = 1; i < students; i++) {
                            try {

                                System.out.println("No.of students are :" + i);

                                scan.nextLine();

                                System.out.println("Student grade is : ");

                                int grade = scan.nextInt();

                                if (grade < 0 || grade > 100) {

                                    throw new InvalidGradeException("grade must be between 0 and 100");
                                }

                                System.out.println("student grade is :" + grade);

                            } catch (InvalidGradeException e) {

                                System.out.println("caught error:" + e.getMessage());

                            }

                            catch (InputMismatchException e) {
                                System.out.println("Please enter valid integer input.");
                            }
                           
                        }
                     
                    }
               finally {

                   System.out.println(" finally block is executed ");
               }
              
                }
            }



