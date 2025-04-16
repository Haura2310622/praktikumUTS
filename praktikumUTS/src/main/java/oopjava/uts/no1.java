/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package oopjava.uts;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class no1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tiga digit integer:");
        int x = input.nextInt();
        int ori_num = x;
        
        int palindrome_int = 0;
        while(x > palindrome_int){
            int pop = x % 10;
            x /= 10;
            
            palindrome_int = (palindrome_int * 10) + pop;
        }
        
        if(x == palindrome_int || x == palindrome_int / 10){
            System.out.println(ori_num + " adalah palindrom");
        } else{
            System.out.println(ori_num + " bukan palindrom");
        }
    }
}
