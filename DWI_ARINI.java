/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_sederhana;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author LENOVO 330
 */
public class DWI_ARINI {

    /**
     * @param args the command line arguments
     */
   
      public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int  pilih; 
        String nama;
        System.out.print("siapa nama anda :");
        nama = input.next();
        System.out.print("pilih permainan: \n[1].bermain bola voly \n[2].bermain petak umpet \n[3].bermain bulu tangkis \nMasukkan pilihan :");
   
        pilih = input.nextInt();
     
        System.out.println("================");
        
        Scanner scan = new Scanner(System.in);
        
        switch(pilih){       
                
            case 1 : 
                System.out.println("Nama  :"+nama);
                System.out.println("bermain bola voly");
            
               boolean running = true;
            String jawab;
            
            int counter = 0;
            
          while (running) {
              System.out.println("apakah anda ingin bermain bola voly lagi ?");
              System.out.println("jawab [ya / tidak]");
              
              jawab = scan.nextLine();
              
        // cek jawabannya, kalau pesan maka berhenti
        if (jawab.equalsIgnoreCase("tidak") ){
            running = false;
        }
        counter++;
          }  
                System.out.println("anda bermain bola voly selama " + counter + " kali");
        
               
                break;
            case 2 :
                System.out.println("Nama :"+nama);
                System.out.println("bermain petak umpet");
                
                 boolean donat = true;
            String jawab1;
            
            int counter1 = 0;
            
          while (donat) {
              System.out.println("apakah anda ingin bermain petak umpet lagi ?");
              System.out.println("jawab [ya / tidak]");
              
              jawab1 = scan.nextLine();
              
        // cek jawabannya, kalau pesan maka berhenti
        if (jawab1.equalsIgnoreCase("tidak") ){
            donat = false;
        }
        counter1++;
          }  
                System.out.println("anda bermain petak umpet selama " + counter1 + " kali");
       
                break;
            case 3 :
                System.out.println("Nama :"+nama);
                System.out.println("bermain bulu tangkis");
             
                boolean running2 = true;
            String jawab2;
          
            int counter2 = 0;
            
          while (running2) {
              System.out.println("apakah anda ingin bermain bulu tangkis lagi ?");
              System.out.println("jawab [ya / tidak]");
              
              jawab2 = scan.nextLine();
              
        // cek jawabannya, kalau pesan maka berhenti
        if (jawab2.equalsIgnoreCase("tidak") ){
            running2 = false;
        }
        counter2++;
          }  
                System.out.println("anda bermain bulu tangkis selama " + counter2 + "kali");
        
            break;
            
            default:
            System.out.println("Maaf permainan yang Anda pilih tidalk ada ! ");
            
           
    }    
}

}    
    
    

