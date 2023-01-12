/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menabung.pkg2;

import java.util.Scanner;

/**
 *
 * @author toshiba
 */
public class Menabung2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    // Scanner a = new Scanner(System.in) ;
        // int HR; //merupakan jmlh harga rumah joko 
        // System.out.print("Masukkan Harga rumah : ");
        // HR = a.nextInt();
        
        // int TA; //merupakan tabungan awal joko
        // System.out.print("Masukkan Setoran Awal : ");
        // TA = a.nextInt();
        
        // int JYDT; //merupakan jmlh yg ditabung joko
        // System.out.print("Masukkan Setoran Perbulan : ");
        // JYDT = a.nextInt();
        
        // System.out.print("hasil : ");
        
        // int i = HR;
        // while ( HR <= 6)
        // {
        //    System.out.println("Perulangan ke-' + J");
        //    HR--;
        // }
    
        
     Scanner scan = new Scanner(System.in);
        
        System.out.println("Masukkan Tabungan awal ");
        int TA = scan.nextInt(); 
        
        System.out.println("Masukkan jumlah yang ditabung tiap bulannya");
        int TTB = scan.nextInt(); 
        
        System.out.println("Harga Rumah");
        int HR = scan.nextInt(); 

        //mulai perhitungan 
        System.out.println("Hasil Tabungan Joko adalah");
        System.out.println(TA);
        
        //inisialisasi
        int i = TA; 
        while (i < HR ) { 
            TA = TA + TTB ; 
            System.out.println(TA); 
            i = i + TTB ; 
        }
    }
}


