/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TEST;

import java.util.ArrayList;
import MODEL.Pasien;
import MODEL.RumahSakit;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author admin
 */
public class TestRumahSakit2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        RumahSakit rs = new RumahSakit();
        
        rs.bacaObjekRumahSakit(new File("rsku.dat"));
        System.out.println("Nama RS = "+rs.getNama());
        ArrayList<Pasien> daftar = rs.getDaftarPasien();
        for (int i = 0; i < daftar.size(); i++) {
            System.out.println("Pasien = "+daftar.get(i).toString());
        }
                     
    }
}
