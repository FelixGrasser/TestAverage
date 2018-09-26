import java.util.Scanner;
public class TestAverage
{
public static void main(String[] args)
{

      // Creating a scanner
      Scanner scanner = new Scanner(System.in);
      double score1;
      double score2;
      double score3;
      double average;
      
      System.out.println("Please enter the first score");
      score1 = scanner.nextDouble();
      
      System.out.println("Please enter the second score");
      score2 = scanner.nextDouble();
      
      System.out.println("Please enter the third score");
      score3 = scanner.nextDouble();
      
      average = ( score1 + score2 + score3 ) / 3;
      
      // Determines your average based on the scores you put in.
      
      if(average < 60) {
      System.out.printf( "The average score is: %.0f. Your grade is a F", average);
      
      } else if (average < 70){
      System.out.printf( "The average score is: %.0f. Your grade is a D", average);
      
      } else if (average < 80){
      System.out.printf( "The average score is: %.0f. Your grade is a C", average);
      
      } else if (average < 90){
      System.out.printf( "The average score is: %.0f. Your grade is a B", average);
      
      } else if (average <= 100){
      System.out.printf( "The average score is: %.0f. Your grade is a A", average);
       
       } else {
       
       System.out.println( "The average score is" + average + ".That is an invalid average");
       }
       }
       }

     

