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
public class dataSuara implements Serializable{
    int totalPemilih;
    int pemilihAktif;
    int suara1;
    int suara2;
    String namaCP1;
    String namaCP2;
    String ketCP1;
    String ketCP2;
    String sourceCapil1;
    String sourceCapil2;

    public String getNamaCP1() {
        return namaCP1;
    }

    public void setNamaCP1(String namaCP1) {
        this.namaCP1 = namaCP1;
    }

    public String getNamaCP2() {
        return namaCP2;
    }

    public void setNamaCP2(String namaCP2) {
        this.namaCP2 = namaCP2;
    }

    public String getKetCP1() {
        return ketCP1;
    }

    public void setKetCP1(String ketCP1) {
        this.ketCP1 = ketCP1;
    }

    public String getKetCP2() {
        return ketCP2;
    }

    public void setKetCP2(String ketCP2) {
        this.ketCP2 = ketCP2;
    }

    
    
    public String getSourceCapil1() {
        return sourceCapil1;
    }

    public void setSourceCapil1(String sourceCapil1) {
        this.sourceCapil1 = sourceCapil1;
    }

    public String getSourceCapil2() {
        return sourceCapil2;
    }

    public void setSourceCapil2(String sourceCapil2) {
        this.sourceCapil2 = sourceCapil2;
    }
    
    
    
    public int getTotalPemilih() {
        return totalPemilih;
    }

    public void addTotalPemilih() {
        this.totalPemilih += 1;
    }

    public int getPemilihAktif() {
        return pemilihAktif;
    }

    public void addPemilihAktif() {
        this.pemilihAktif += 1;
    }

    public int getSuara1() {
        return suara1;
    }

    public void addSuara1() {
        this.suara1 += 1;
    }

    public int getSuara2() {
        return suara2;
    }

    public void addSuara2() {
        this.suara2 += 1;
    }

    public dataSuara() {
        this.totalPemilih = 0;
        this.pemilihAktif = 0;
        this.suara1 = 0;
        this.suara2 = 0;
        namaCP1 = "Raisa";
        namaCP2 = "Isyana";
        ketCP1 = "Penyanyi, sudah punya suami";
        ketCP2 = "Penyanyi, Single";
//        this.sourceCapil1 = "E:\\Kuliah\\Semester 3\\PemiluApp\\PemiluApp\\src\\img\\raisa.jfif";
//        this.sourceCapil2 = "E:\\Kuliah\\Semester 3\\PemiluApp\\PemiluApp\\src\\img\\isyana.jfif";
        this.sourceCapil1 = "/img/raisa.jfif";
        this.sourceCapil2 = "/img/isyana.jfif";
    }
}
