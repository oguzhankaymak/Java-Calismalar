/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package minifutbolgame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Oguzhan
 */
public class MiniFutbolGame {
        

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Mini Futbol Oyununa Hoşgeldiniz....");
        System.out.println("Rastgele Takım Seçilecek.....");
        System.out.println("Çıkmak isterseniz 'q' tusuna basınız..");
        
        Scanner scanner = new Scanner(System.in);
        
        
        
        Fabrika fabrika= new Fabrika();
        Random random = new Random();
        while(true){
            System.out.println("Baslamak istiyorsanız 'evet' yaziniz : ");
            String islem = scanner.nextLine();
            if(islem.equals("q")){
                break;
            }
            else if(islem.equals("evet")){
                int sayi = random.nextInt(3);
                System.out.println("Gelen sayi : " + sayi );
                Takim secilen_takim = fabrika.Takimuret(sayi);
                
                secilen_takim.takimBilgisiGoster();
                secilen_takim.atakYap();
                secilen_takim.ozelYetenekKullan();
  
            }
            else{
                System.out.println("Gecersiz islem girdiniz !! ");
            }
            
            
            
            
            
        }
        
        
        // TODO code application logic here
    }
    
}
