/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119025.latihan42.tabungan;

/**
 *
 * @author User
 * * NAMA     : ADHIRA FAHRI GATHAN
 * KELAS    : PBO
 * NIM      : 10119025
 * Deskripsi Program : Program ini berisi tentang Tabungan
 */
public class Tabungan {
    private int saldo;
    public Tabungan(int saldo){
        this.saldo = saldo;
    }

    public int ambilTabungan(int jumlah){
        return saldo - jumlah;
    }
}