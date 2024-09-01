/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO;

/**
 *
 * @author Azzam Wildan
 */
public class Dosen extends CivitasAkademika {

    String nidn;

    Dosen(String nama, String nidn) {
        super(nama, "Dosen");
        this.nidn = nidn;
    }

    @Override
    void perkenalan() {
        System.out.println("Selamat pagi, saya " + nama + ", seorang " + role + " dengan NIDN " + nidn + ".");
    }
}
