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
public abstract class Harga{
    protected int hargaMieAyam = 15000;
    protected int hargaSotoAyam = 18000;
    protected int hargaTehManis = 3000;
    protected int hargaKentang = 5000;
    
    public abstract int getHarga(String menu);
}
