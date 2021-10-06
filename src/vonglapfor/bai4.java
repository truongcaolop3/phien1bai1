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
public class bai4 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n,c;
        int s = 0;
        n =sc.nextInt();
        
        while ( n!=0){
            c = n% 10;
            s += c;
            n/=10;
        }
        System.out.println("tong các số là: "+ s);
    }
}
