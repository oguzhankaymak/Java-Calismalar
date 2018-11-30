
package beybladegame;

import java.util.Scanner;

public class BeybladeGame {

    public static void main(String[] args) {
        System.out.println("Beyblade Programına Hoşgeldiniz");
        System.out.println("Çıkış İçin q tuşuna basınız");
        Scanner scanner = new Scanner(System.in);
        
        
        while(true){
            
            System.out.println("Hangi Beyblade' i üretmek istiyorsunuz ?");
            String islem = scanner.nextLine();
            if(islem.equals("q")){
                break;
            }
            else{
                BeybladeFabrikasi fabrika = new BeybladeFabrikasi();
                Beyblade beyblade = fabrika.beybladeUret(islem);
                
                if(beyblade == null){
                    System.out.println("Lütfen Geçerli Bir Beyblade İsmi Girin...");
                }
                else{
                    beyblade.BilgileriGoster();
                    beyblade.saldir();
                    beyblade.KutsalCanvariCikar();
                }
            }
            
        }
    }
    
}
