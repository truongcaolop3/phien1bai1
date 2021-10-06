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
public class bai3 {
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int s = 0;
        for (int i =1; i<=n;i++){
            s = s + i;
        }
        System.out.println("tổng các số " + s);
    }
    
}
