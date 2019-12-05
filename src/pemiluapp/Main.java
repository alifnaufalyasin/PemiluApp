/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemiluapp;
import GUIdock.howTo;
import dataController.*;
import GUIdock.loginPage;
import java.io.*;

/**
 *
 * @author alifn
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        dataCenter a = new dataCenter();
//        a.addUser("1301184321", "17111999");
//        a.writeData();
        a.readData();
        System.out.println(a.totalPemilih());
        System.out.println(a.suaraCapil1());
        System.out.println(a.suaraCapil2());
        System.out.println(a.totalSuara());
//        for (dataUser b : a.getdataUser()){
//            System.out.println(b.getNIM()+" "+b.getTglLahir());
//            System.out.println(b.isHakSuara());
//        }
        new loginPage().setVisible(true);
        
        // view panel how to use
        new howTo().setVisible(true);
        
    }
    
}
