/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import MODEL.Pasien;
import java.io.File;

/**
 *
 * @author admin
 */
public class TestStream2 {
    public static void main(String[] args) {
        Pasien.bacaDaftarPasien(new File("daftar.txt"));
        for (int i = 0; i < Pasien.getDaftarpasienKlinik().size(); i++) {
            System.out.println(Pasien.getDaftarpasienKlinik().get(i).toString());
           
        }
    }
}
