/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class latihan3 {

    static int hitungKembalian(int uangBayar, int totalHarga) {
        return uangBayar - totalHarga;
    }

    public static void main(String[] args) {

        int uangBayar = 50000;
        int totalHarga = 35000;

        if (uangBayar >= totalHarga) {
            int kembalian = hitungKembalian(uangBayar, totalHarga);

            System.out.println("Pembayaran berhasil");
            System.out.println("Uang bayar: " + uangBayar);
            System.out.println("Total harga: " + totalHarga);
            System.out.println("Kembalian: " + kembalian);
        } else {
            System.out.println("Uang tidak cukup");
        }
    }
}
