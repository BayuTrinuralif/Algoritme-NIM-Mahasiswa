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
public class Urut {
    
    private String nim;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getUrut(){

        String kodeUr = nim.substring(7);
	
	    return "No Urut Mahasiswa Adalah : "+kodeUr;
    }
}
