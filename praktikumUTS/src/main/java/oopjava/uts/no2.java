/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopjava.uts;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class no2 {
    public static void main(String[] args){
        //pattern A
//        for (int i = 1; i <= 6; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
        
        //pattern B
//        for (int i = 1; i <= 6; i++) {
//            for (int j = 1; j <= 7 - i; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
        
        //pattern C
//        for(int i = 1; i <= 6; i++) {
//            for(int space = 1; space <= 6 - i; space++) {
//                System.out.print("  ");
//            }
//            for(int j = i; j >= 1; j--) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
        
        //pattern D
        for(int i = 6; i >= 1; i--) {
            for(int space = 0; space < 6 - i; space++) {
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
