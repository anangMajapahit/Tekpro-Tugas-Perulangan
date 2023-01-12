/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menabung.pkg1;

import java.util.Scanner;

/**
 *
 * @author toshiba
 */
public class Menabung1  {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    Scanner z = new Scanner(System.in); 
    
        int JB; //jumlah bulan joko menabung
        System.out.print("Masukkan Bulan : ");
        JB = z.nextInt();
        
        int TA; //tabungan awal joko 
        System.out.print("Masukkan Setoran Awal : ");
        TA = z.nextInt();
        
        int JT; //jumlah yangg ditabung joko (t)
        System.out.print("Masukkan Setoran Perbulan : ");
        JT = z.nextInt();
        System.out.print("hasil : ");
        
        for (int i= JB; JB>0; JB--){
            System.out.print(TA+" ");
            TA+=JT;
        }
    }
    
}