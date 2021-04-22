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
public class Tahun {
        private String nim;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getTahun(){

        String kodeJe = nim.substring(1,3);
	
        if(kodeJe.equals("20")){
            return "Tahun 2020";
        }else if(kodeJe.equals("19")){
            return "Tahun 2019";
        }
	return "Tidak Diketahui";
    }
}
