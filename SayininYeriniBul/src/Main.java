
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oguzhan
 */
public class Main {
    static Kart[][] kartlar =new Kart[3][3];
    
    
  /*
    -While - oyunBittiMi() fonksiyonu ile konumlarin birinde boolean degerinin false olmasi durumunda devami saglandi.
 
 */
    public static void main(String[] args) {
        oyunTahtasiDoldur();
        
        while(oyunBittiMi()==false){
            oyunTahtasi();
            tahminEt();
        }
        
        
    }
    
    /*
 - Matrisimize random ile degerler atadık atadıgımız degerlerin farkli olmasi icin once liste olusturup
   her atadaıgımız degeri listeye kaydettik. Sonraki asamalarda bu sayi atandi mi diye kontrol ettik.
 
 */
    public static void oyunTahtasiDoldur() {
       ArrayList<Integer> sayilar = new ArrayList<Integer>();
        
        Random random = new Random();
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                while(true){
                    int sayi = random.nextInt(9);
                    if(sayilar.contains(sayi)==false){
                        sayilar.add(sayi);
                        kartlar[i][j] = new Kart(sayi);
                        break;
                    }
                   
                }
                
            }
        }
    }
    
    /*
        - Oyun alanimizi olusturduk. Tahmin dogru kayitlanmis ise degeri gostermesini sagladik.
    */
    public static void oyunTahtasi() {
        for(int i = 0; i<3; i++){
            System.out.println("_____________________________");
            for(int j = 0; j<3; j++){
                if(kartlar[i][j].isTahmin()){
                    System.out.print(" | " +kartlar[i][j].getDeger() + " | " );
                }
                else{
                    System.out.print(" | | ");
                }
                
               
            }
            System.out.println("");
        }
        System.out.println("_____________________________");
        
        
    }
    
    /*
        - Kullanicidan konum ve sayi istendi eger eslesiyorsa konumun boolean degeri true yapildi bu sayede oyun tahtasinda
          degeri gozukecek.  
    */
    public static void tahminEt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tahmin Etmek İstediginiz Konumu Giriniz (i ve j degerini bir bosluk birakarak giriniz ...) :");
        
        int i1 = scanner.nextInt();
        int j1 = scanner.nextInt();
        
        System.out.println("Sayi Tahmininizi Giriniz : ");
        int sayi = scanner.nextInt();
        
        if(kartlar[i1][j1].getDeger()== sayi){
            System.out.println("Tebrikler Bildiniz !");
            kartlar[i1][j1].setTahmin(true);
        }
        else{
            System.out.println("Maalesef Bilemediniz Tekrar Deneyin !");
        }
            
        
    
    }
    /*
     - Tum konumlarin boolean degeri true olursa oyunun bitmesi icin olusturuldu. Main kisminda while ile kullanilacak. 
    */
    public static boolean  oyunBittiMi() {
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                if(kartlar[i][j].isTahmin()==false){
                    return false;
                }
            }
            
        }
        return true;
    }
    
    
    
}
