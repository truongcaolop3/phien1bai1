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
public class bai6 {
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        int s=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập n: ");
        n = sc.nextInt();
        for(int i =2;i<=n;i++){
            for ( int j = 2;j<=Math.sqrt(j);j++){
                if (i %j == 0){
                s++;
            }
        }
        if (s == 0){
            System.out.print(i + " ");
        }else s = 0;
    }
        sc.close();
    } 
}
