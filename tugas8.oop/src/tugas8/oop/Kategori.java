/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas8.oop;

/**
 *
 * @author lasmanaadit
 */
public class Kategori extends Harga {
        public String getKategori(String item) {
        switch(item.toLowerCase()) {
            case "mie ayam":
            case "soto ayam":
                return "Makanan";
            case "teh manis":
                return "Minuman";
            case "kentang":
                return "Snack";
            default:
                return "Tidak diketahui";
        }
    }

    @Override
    public int getHarga(String menu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
