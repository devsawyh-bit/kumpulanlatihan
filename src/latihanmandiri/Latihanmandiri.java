/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanmandiri;

/**
 *
 * @author User
 */
public class Latihanmandiri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int hargaBarang = 5000;
int jumlahBeli = 5;
int totalHarga = 0;

for (int nomor = 1; nomor <= jumlahBeli; nomor++) {
    totalHarga += hargaBarang;
    System.out.println("Total setelah " + nomor + " barang: Rp" + totalHarga);
}

System.out.println("Total akhir: Rp" + totalHarga);

System.out.println("Proses selesai.");// TODO code application logic here
    }
    
}
