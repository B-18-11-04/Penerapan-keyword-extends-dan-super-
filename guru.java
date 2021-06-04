/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ROG
 */
public class guru extends Murid{
    String name = "Budi Santoso";
    String Mapel = "BHS.Ingris";
    String address = "Jl Cendana Gg.4 no 21";
    int age =  30;
    
    public void showInfo(){
        System.out.println("Name / Nama : " + super.nama);
        System.out.println("Age / Umur: " + super.umur);
        System.out.println("Alamat : " + address);
    }
}
