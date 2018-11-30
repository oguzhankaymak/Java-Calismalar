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
public class Dragon extends Beyblade{
    private String kutsalCanavar;
    private String gizliYetenek;

    public Dragon(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar, String gizliYetenek) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
        this.gizliYetenek = gizliYetenek;
    }

    @Override
    public void BilgileriGoster() {
        super.BilgileriGoster(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Kutsal Canavar Adı : " + kutsalCanavar);
        System.out.println("Gizli Yetenek : " + gizliYetenek);
        
        
    }

    @Override
    public void KutsalCanvariCikar() {
        
        System.out.println(getBeybladeci() + " " + kutsalCanavar + "ı ortaya çıkarıyor..." );
        System.out.println(getBeybladeci() + " saldırısı : Hayalet Kasırgası");
    }
    
    
}
