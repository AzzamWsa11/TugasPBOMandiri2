/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO;

/**
 *
 * @author Azzam Wildan
 */
public abstract class CivitasAkademika {

    String nama;
    String role;

    CivitasAkademika(String nama, String role) {
        this.nama = nama;
        this.role = role;
    }

    abstract void perkenalan();
}
