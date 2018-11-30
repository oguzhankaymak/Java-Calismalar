/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beybladegame;

/**
 *
 * @author Oguzhan
 */
public class Dranza extends Beyblade {
    private String kutsalCanavar;
    
    public Dranza(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void BilgileriGoster() {
        super.BilgileriGoster(); 
        System.out.println("Kutsal Canavar Adı : " + kutsalCanavar);
    }
    public void KutsalCanavarıCikar(){
        System.out.println(getBeybladeci() + " " + kutsalCanavar + " " + "i ortaya çıkarıyor..." );
        System.out.println(getBeybladeci() + " ın saldırısı : Alev Kılıcı");
        
    }
    
    
}
