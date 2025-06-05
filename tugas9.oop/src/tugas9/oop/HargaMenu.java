/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas9.oop;

/**
 *
 * @author lasmanaadit
 */
public class HargaMenu extends Harga {
    @Override
    public int getHarga(String menu) {
        menu = menu.toLowerCase().replaceAll("\\s+", "");
        switch (menu) {
            case "mieayam":
            case "mieayam1":
                return hargaMieAyam;
            case "sotoayam":
                return hargaSotoAyam;
            case "tehmanis":
                return hargaTehManis;
            case "kentang":
                return hargaKentang;
            default:
                return 0;
        }
    } 
}
