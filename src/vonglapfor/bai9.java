/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vonglapfor;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class bai9 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
		    
        int num1,num2, reversed = 0;
        System.out.println("Nhập vào số cần đảo ngược: ");
        num1 = sc.nextInt();
        num2 = num1;
        while(num1 != 0) {
          int digit = num1 % 10;
          reversed = reversed * 10 + digit;
          num1 /= 10;
        }
        System.out.printf("Số %d sau khi đảo ngược là: %d", num2, reversed);
    }

}
