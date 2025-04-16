/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopjava.uts.no4;

/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String[] args) {
        // Balok 1
        Balok balok1 = new Balok(1, 1, 1);
        tampilkanInfo("Balok1", balok1);

        // Balok 2
        Balok balok2 = new Balok(30, 40, 50);
        tampilkanInfo("Balok2", balok2);

        // Balok 3
        Balok balok3 = new Balok(25, 35, 45);
        tampilkanInfo("Balok3", balok3);
    }

    public static void tampilkanInfo(String nama, Balok b) {
        System.out.println(nama + ":");
        System.out.println("Panjang : " + b.getPanjang());
        System.out.println("Lebar   : " + b.getLebar());
        System.out.println("Tinggi  : " + b.getTinggi());
        System.out.println("Luas    : " + b.getLuas());
        System.out.println("Keliling: " + b.getKeliling());
        System.out.println("Volume  : " + b.getVolume());
        System.out.println("-----------------------------");
    }
}
