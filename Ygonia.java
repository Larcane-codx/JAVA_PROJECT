/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenprojectzz;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class Mavenprojectzz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("==WELCOME TO MINI CAL==");
        System.out.print("Enter 1st: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd: ");
        int num2 = sc.nextInt();
        System.out.print("Enter operation: ");
        char op = sc.next().charAt(0);
        
        int met = Method(num1, num2);
        int meth = Method(num1, num2, op);
        
        System.out.println("Result: " + meth);
        
    }
    
    static int Method(int num1, int num2) {
        return num1 * num2;
    }
    
    static int Method(int num1, int num2, char operation) {
        switch (operation) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2; 
            case '*':
                return num1 * num2;    
            case '/':
                return num1 / num2;
            default:
                System.out.println("Undefined!");
        } return 0;
    }
    
}
