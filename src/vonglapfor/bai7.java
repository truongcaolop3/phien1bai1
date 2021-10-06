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
public class bai7 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNumber = 1;
		int secondNumber = 1;
		int fibonaci = 0;
		for (int i=2; i<=10; i++) {
			fibonaci = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = fibonaci;
		}
		System.out.println("Fibonaci series up to 10 terms is " + fibonaci);
	}
}
