/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nim.mahasiswa;

/**
 *
 * @author Bayu
 */
public class RunTahun {
        public static void main(String[] args) {
        String nim = "12050110492";
        Tahun objNim = new Tahun();
        objNim.setNim(nim);
        System.out.println("Tahun Masuk = "+objNim.getTahun());
    }
}
