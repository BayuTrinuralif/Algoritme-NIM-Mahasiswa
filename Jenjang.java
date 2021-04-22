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
public class Jenjang {
        private String nim;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJenjang(){
        char kodeJen = nim.charAt(0);

        if(kodeJen == '1'){
            return "Jenjang S-1";
        }else if(kodeJen == '2'){
            return "Jenjang S-2";
        }else if(kodeJen == '3'){
            return "Jenjang S-3";
        }
        return "UNKNOWN";
    }
}
