/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO;

/**
 *
 * @author Azzam Wildan
 */
public class Mhsiswa extends CivitasAkademika {
  
    String nim;

    Mhsiswa(String nama, String nim) {
        super(nama, "Mahasiswa");
        this.nim = nim;
    }

    @Override
    void perkenalan() {
        System.out.println("Halo, saya " + nama + ", seorang " + role + " dengan NIM " + nim + ".");
    }
}


