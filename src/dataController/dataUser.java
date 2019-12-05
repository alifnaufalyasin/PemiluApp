/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataController;

import java.io.Serializable;

/**
 *
 * @author alifn
 */
public class dataUser implements Serializable {
    String NIM;
    String tglLahir;
    boolean hakSuara;

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(String tglLahir) {
        this.tglLahir = tglLahir;
    }

    public boolean isHakSuara() {
        return hakSuara;
    }

    public void setHakSuara(boolean hakSuara) {
        this.hakSuara = hakSuara;
    }

    public dataUser(String NIM, String tglLahir) {
        this.NIM = NIM;
        this.tglLahir = tglLahir;
        this.hakSuara = false;
    }
    
    
    
    
}
