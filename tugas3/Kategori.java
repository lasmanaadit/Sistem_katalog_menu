/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

/**
 *
 * @author lasmanaadit
 */
public class Kategori {
    public String getKategori(String menu) {
        menu = menu.toLowerCase();
        switch (menu) {
            case "mie ayam":
            case "soto ayam":
            case "mie ayam + teh manis":
            case "soto ayam + teh manis":
                return "Makanan";
            case "teh manis":
                return "Minuman";
            case "kentang":
                return "Snack";
            default:
                return "Tidak diketahui";
        }
    }
}
