/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author lasmanaadit
 */
public class menu {

    // Data nama menu dan harga
    static String[] namaMenu = {
        "Mie Ayam",
        "Soto Ayam",
        "Teh Manis",
        "Kentang"
    };

    static int[] hargaMenu = {
        15000,
        18000,
        3000,
        5000
    };

    // Fungsi untuk menampilkan katalog menu
    static void tampilkanMenu() {
        System.out.println("===== KATALOG MENU =====");
        for (int i = 0; i < namaMenu.length; i++) {
            System.out.println("Nama Menu : " + namaMenu[i]);
            System.out.println("Harga     : Rp " + hargaMenu[i]);
            System.out.println("-----------------------------");
        }
    }

    public static void main(String[] args) {
        tampilkanMenu();
    }
}

