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
public class Menuitem {
    private String namaPelanggan;
    private String namaMenu;
    private int harga;
    private String kategori;

    public Menuitem(String namaPelanggan, String namaMenu, int harga, String kategori) {
        this.namaPelanggan = namaPelanggan;
        this.namaMenu = namaMenu;
        this.harga = harga;
        this.kategori = kategori;
    }

    public String getDeskripsi() {
        return "Nama Pelanggan: " + namaPelanggan + "\n" +
               "Menu: " + namaMenu + "\n" +
               "Kategori: " + kategori + "\n" +
               "Harga: Rp " + harga;
    }
}

