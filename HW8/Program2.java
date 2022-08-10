import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chelsea Gallimore
 */
public class Program2 {
  
   

   public static void main(String[] args) {
       
       Scanner input = new Scanner(System.in);
       
   
      double firstNum;    // This will show the first number in the expression.
      double secondNum;   // This will show the second number in the expression.
      char operator;      // This will show the operator in the expression.
      double value;       // This will show the value of the expression.
      
       System.out.println("Enter expressions such as  5 + 5  or  202 * 105");
       System.out.println("using any of the operators +, -, *, /.");
       System.out.println("To end, enter a 0.");
       System.out.println();
      
      while (true) {
          
          // Get user's input, ending program if first number is 0. //
     
           System.out.print("? "); 
          firstNum = input.nextInt();
          if (firstNum == 0)
             break;
          operator = input.next().charAt(0);
          secondNum = input.nextInt(); 
          
          /* Compute the value of the expression. */
          
          switch (operator) {
              case '+':
                 value = firstNum + secondNum;
                 break;
              case '-':
                 value = firstNum - secondNum;
                 break;
              case '*':
                 value = firstNum * secondNum;
                 break;
              case '/':
                 value = firstNum / secondNum;
                 break;
              default:
                  System.out.println("Unknown operator: " + operator);
                 continue;  // Back to start of loop!
          } // end of switch
          
          /* Display the value. */
          
           System.out.println("Value is " + value);
           System.out.println();
                    
      } // end of while
      
       System.out.println("Good bye");
   
   }  

}  // end class Program2