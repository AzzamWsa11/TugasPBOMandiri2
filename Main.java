/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO;

/**
 *
 * @author Azzam Wildan
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek untuk setiap jenis civitas akademika
        Mhsiswa mahasiswa = new Mhsiswa("Azzam Wildan Shidqii Al-Afghani", "09040623054");
        Dosen dosen = new Dosen("Ibu Dwi", "197909272014032001");
        Staff staff = new Staff("Pak Surya", "STF001");

        // Memanggil metode perkenalan pada setiap objek
        mahasiswa.perkenalan();
        dosen.perkenalan();
        staff.perkenalan();
    }
}

