/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataController;
import java.util.*;
import java.io.*;
import java.text.*;

/**
 *
 * @author alifn
 */
public class dataCenter {
    dataSuara Suara ;
    List<dataUser> User = new ArrayList <>();

    public dataCenter() {
        this.Suara = new dataSuara();
    }
    
    public void setCapil1(String a, String b, String img){
        Suara.setNamaCP1(a);
        Suara.setKetCP1(b);
        Suara.setSourceCapil1(img);
    }
    public void setCapil2(String a, String b, String img){
        Suara.setNamaCP2(a);
        Suara.setKetCP2(b);
        Suara.setSourceCapil2(img);
    }
    public String getNamaCapil1(){
        return Suara.getNamaCP1();
    }
    public String getNamaCapil2(){
        return Suara.getNamaCP2();
    }
    public String getKetCapil1(){
        return Suara.getKetCP1();
    }
    public String getKetCapil2(){
        return Suara.getKetCP2();
    }
    public String getImgCapil1(){
        return Suara.getSourceCapil1();
    }
    public String getImgCapil2(){
        return Suara.getSourceCapil2();
    }
    
    public boolean isNull(){
        return (User.size() == 0);
    }
    
    public int totalPemilih() {
        return Suara.getTotalPemilih();
    } 
    
    public boolean canChoose(String NIM, String tgl){
        boolean o = false;
        for (dataUser a : User){
            if (a.getNIM().equals(NIM) && a.getTglLahir().equals(tgl) && !a.isHakSuara()){
                o = true;
            }
        }
        return o;
    }
    
    public void chooseCapil(int i){
        if (i==1){
            Suara.addSuara1();
        }else{
            Suara.addSuara2();
        }
    }
    
    public void haveChoose(String NIM, String tgl){
         for (dataUser a : User){
            if (a.getNIM().equals(NIM) && a.getTglLahir().equals(tgl)){
                a.setHakSuara(true);
                Suara.addPemilihAktif();
            }
        }
    }
    
    public int totalSuara(){
        return Suara.getPemilihAktif();
    }
    
    public int suaraCapil1(){
        return Suara.getSuara1();
    }
    
    public int suaraCapil2(){
        return Suara.getSuara2();
    }

    public void setSuara(dataSuara Suara) {
        this.Suara = Suara;
    }
    
    public dataSuara getSuara(){
        return Suara;
    }
    
    public List<dataUser> getdataUser(){
        return User;
    }
    
    public void addUser(String NIM, String tglLahir){
        dataUser a = new dataUser(NIM,tglLahir);
        User.add(a);
        Suara.addTotalPemilih();        
    }
    
    public void showUser(){
        for (dataUser a : User){
            System.out.println(a.getNIM());
            System.out.println(a.getTglLahir());
            System.out.println(a.isHakSuara());
        }
    }
    
    
    public void writeData() throws IOException {
        
            File fileSuara = new File("fileSuara.txt");
            File fileUser = new File("fileUser.txt");
        try{
            FileOutputStream fos1 = new FileOutputStream(fileSuara);
            ObjectOutputStream oos1 = new ObjectOutputStream(fos1);
            oos1.writeObject(Suara);
            oos1.close();

            FileOutputStream fos2 = new FileOutputStream(fileUser);
            ObjectOutputStream oos2 = new ObjectOutputStream(fos2);
                for (dataUser a : User){
                    oos2.writeObject(a);
                }   
                oos2.close();
        }catch(IOException ex){
        }
    }
    
    
    
    public void readData() throws IOException {
        File fileSuara = new File("fileSuara.txt");
        File fileUser = new File("fileUser.txt");
        try{
            FileInputStream fis1 = new FileInputStream(fileSuara);
            ObjectInputStream ois1 = new ObjectInputStream(fis1);
            this.setSuara((dataSuara) ois1.readObject());
            

            FileInputStream fis2 = new FileInputStream(fileUser);
            ObjectInputStream ois2 = new ObjectInputStream(fis2);
            dataUser e = (dataUser) ois2.readObject();
            while(e != null){
                User.add(e);
                e = (dataUser) ois2.readObject();
            }
        }catch(IOException | ClassNotFoundException ex){
        }
    }

    
}
