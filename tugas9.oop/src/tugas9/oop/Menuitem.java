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
class Menuitem extends Harga implements DeskripsiMenu{
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

    public String getNamaMenu() {
        return namaMenu;
    }

    public String getKategori() {
        return kategori;
    }

    public int getHarga() {
        return harga;
    }

    @Override
    public int getHarga(String menu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

