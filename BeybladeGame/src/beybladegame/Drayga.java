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
public class Drayga extends Beyblade {
    private String kutsalCanavar;

    public Drayga(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void BilgileriGoster() {
        super.BilgileriGoster(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Kutsal Canavar Adı : " + kutsalCanavar);
    }

    @Override
    public void KutsalCanvariCikar() {
        super.KutsalCanvariCikar(); //To change body of generated methods, choose Tools | Templates.
        System.out.println(getBeybladeci() + " " + kutsalCanavar + "ı ortaya çıkarıyor..." );
        System.out.println(getBeybladeci() + " saldırısı : Kaplan Pençesi");
    }
   
    
    
}
