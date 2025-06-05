/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

import tugas2.*;

/**
 *
 * @author lasmanaadit
 */
public class menu {

    String[] namaMenu;
    int[] hargaMenu;

    // Konstruktor
    public menu() {
        namaMenu = new String[]{"Mie Ayam", "Soto Ayam", "Mie Ayam + Teh Manis", "Soto Ayam + Teh Manis", "Kentang"};
        hargaMenu = new int[]{15000, 18000, 18000, 21000, 5000};
    }

    public void tampilkanMenu() {
        System.out.println("===== KATALOG MENU =====");
        for (int i = 0; i < namaMenu.length; i++) {
            System.out.println("Menu: " + namaMenu[i]);
            System.out.println("Harga: Rp " + hargaMenu[i]);
            System.out.println("----------------------------");
        }
    }

    public static void main(String[] args) {
        menu katalog = new menu();  // Memanggil konstruktor
        katalog.tampilkanMenu();
    }
}

