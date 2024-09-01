/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO;

/**
 *
 * @author Azzam Wildan
 */
public class Staff extends CivitasAkademika {

    String idStaff;

    Staff(String nama, String idStaff) {
        super(nama, "Staff");
        this.idStaff = idStaff;
    }

    @Override
    void perkenalan() {
        System.out.println("Perkenalkan, saya " + nama + ", bekerja sebagai " + role + " dengan ID Staff " + idStaff + ".");
    }
}
