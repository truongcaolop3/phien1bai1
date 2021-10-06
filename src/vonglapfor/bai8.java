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
public class bai8 {
    public static void main(String[] args) {
        // TODO code application logic here
        
	Scanner scanner = new Scanner(System.in);
	System.out.println("Nhập number cần tìm giai thừa: ");
	int number = scanner.nextInt();
	        long fact = 1;
	        for(int i = 1; i <= number; i++)
	        {
	            fact = fact * i;
	        }
	        System.out.println("Giai thừa của "+number+" là: "+fact);
    }
}
