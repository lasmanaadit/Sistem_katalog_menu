/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas5.oop;

/**
 *
 * @author lasmanaadit
 */
// MenuPelanggan.java
public class MenuPelanggan extends Harga {
    private Kategori kategori = new Kategori();
    public Menuitem buatMenu(String namaPelanggan, int pilihan) {
        switch (pilihan) {
            case 0:
                return new Menuitem(namaPelanggan, "Mie Ayam", hargaMieAyam, kategori.getKategori("mie ayam"));
            case 1:
                return new Menuitem(namaPelanggan, "Soto Ayam", hargaSotoAyam, kategori.getKategori("soto ayam"));
            case 2:
                return new Menuitem(namaPelanggan, "Mie Ayam + Teh Manis", hargaMieAyam + hargaTehManis, kategori.getKategori("mie ayam"));
            case 3:
                return new Menuitem(namaPelanggan, "Soto Ayam + Teh Manis", hargaSotoAyam + hargaTehManis, kategori.getKategori("soto ayam"));
            case 4:
                return new Menuitem(namaPelanggan, "Kentang", hargaKentang, kategori.getKategori("kentang"));
            default:
                return new Menuitem(namaPelanggan, "Menu Tidak Diketahui", 0, "Tidak Diketahui");
        }
    }

    @Override
    public int getHarga(String menu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


