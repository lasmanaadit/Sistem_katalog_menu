/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4.oop;

/**
 *
 * @author lasmanaadit
 */
public class Kategori extends Harga {
    // Atribut
    private String kategoriTerakhir;

    // Method
    public String getKategori(String item) {
        switch(item.toLowerCase()) {
            case "mie ayam":
            case "soto ayam":
                kategoriTerakhir = "Makanan";
                break;
            case "teh manis":
                kategoriTerakhir = "Minuman";
                break;
            case "kentang":
                kategoriTerakhir = "Snack";
                break;
            default:
                kategoriTerakhir = "Tidak diketahui";
                break;
        }
        return kategoriTerakhir;
    }

    // Getter untuk atribut kategoriTerakhir (opsional)
    public String getKategoriTerakhir() {
        return kategoriTerakhir;
    }
}

