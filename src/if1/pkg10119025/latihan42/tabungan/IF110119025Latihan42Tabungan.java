/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119025.latihan42.tabungan;

import java.util.Scanner;

/**
 *
 * @author User
 * * NAMA     : ADHIRA FAHRI GATHAN
 * KELAS    : PBO
 * NIM      : 10119025
 * Deskripsi Program : Program ini berisi tentang Tabungan
 */
public class IF110119025Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("====Program Penarikan Saldo====");
        System.out.print("Masukkan saldo awal : ");
        Tabungan tabungan = new Tabungan(scan.nextInt());
        System.out.print("Jumlah uang yang diambil : ");
        int sisaSaldo = tabungan.ambilTabungan(scan.nextInt());
        System.out.println("Saldo Anda Sekarang : "+sisaSaldo);
    }
}