package calculator;

import java.util.Scanner;

public class Calculator {
	 public static void main(String args[]) {
	      double num1;
	      double num2;
	      double ans = 0;
	      int op;
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.print("\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n \nEnter the option");
	      op = sc.nextInt();
	      System.out.print("Enter two numbers: ");
	      num1 = sc.nextDouble();
	      num2 = sc.nextDouble();
	     
	      switch(op) {
	         case 1: ans = num1 + num2;
	            break;
	         case 2: ans = num1 - num2;
	            break;
	         case 3: ans = num1 * num2;
	            break;
	         case 4: ans = num1 / num2;
	            break;
	         default:  System.out.printf("Error! Enter correct option");
	                break;
	      }
	      System.out.print("\nThe result is:\n");
	      System.out.print(ans);
	     sc.close();
	 }

}
