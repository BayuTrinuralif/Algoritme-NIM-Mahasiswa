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
public class RunJenjang {
        public static void main(String[] args) {
        String nim = "12050110492";
        Jenjang objNim = new Jenjang();
        objNim.setNim(nim);
        System.out.println(objNim.getJenjang());
    }
}
