/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopjava.uts.no4;

/**
 *
 * @author Lenovo
 */
public class Balok {
    private int panjang;
    private int lebar;
    private int tinggi;

    // Constructor tanpa parameter
    public Balok() {
        this.panjang = 0;
        this.lebar = 0;
        this.tinggi = 0;
    }

    // Constructor dengan parameter
    public Balok (int panjangBaru, int lebarBaru, int tinggiBaru) {
        this.panjang = panjangBaru;
        this.lebar = lebarBaru;
        this.tinggi = tinggiBaru;
    }

    // Method menghitung luas
    public int getLuas() {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }

    // Method menghitung keliling
    public int getKeliling() {
        return 4 * (panjang + lebar + tinggi);
    }

    // Method menghitung volume
    public int getVolume() {
        return panjang * lebar * tinggi;
    }
    
    public int getPanjang() {
        return this.panjang;
    }

    public int getLebar() {
        return this.lebar;
    }

    public int getTinggi() {
        return this.tinggi;
    }
}

