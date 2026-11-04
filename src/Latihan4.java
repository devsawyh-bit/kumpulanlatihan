/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
    public class Latihan4 {

    static void tampilkanDaftarBarang(String namaBarang, int jumlahBeli) {

        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Jumlah Beli: " + jumlahBeli);
    }

    public static void main(String[] args) {

        boolean pembelianBerhasil = true;

        if (pembelianBerhasil) {
            System.out.println("Pembelian berhasil!");

            tampilkanDaftarBarang("Buku", 2);
            tampilkanDaftarBarang("Pensil", 3);
            tampilkanDaftarBarang("Penghapus", 1);
        }
    }
}
