package oopjava.uts;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

public class no3 {
    // Metode untuk membalik angka
    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

    // Metode untuk mengecek palindrom
    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }

    // Program utama
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sebuah bilangan bulat: ");
        int num = input.nextInt();

        if (isPalindrome(num)) {
            System.out.println(num + " adalah palindrom.");
        } else {
            System.out.println(num + " bukan palindrom.");
        }
    }
}
