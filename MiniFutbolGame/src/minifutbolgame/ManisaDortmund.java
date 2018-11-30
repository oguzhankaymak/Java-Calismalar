/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minifutbolgame;

/**
 *
 * @author Oguzhan
 */
public class ManisaDortmund extends Takim {
    private String ozelYetenek;

    public ManisaDortmund(String takim_adi, String teknik_direktor, int atak_gucu, int defans, String ozelYetenek) {
        super(takim_adi, teknik_direktor, atak_gucu, defans);
        this.ozelYetenek = ozelYetenek;
    }
    


    @Override
    public void ozelYetenekKullan() {
        System.out.println("Ozel Yetenek Kullaniliyor....");
        System.out.println(getTakim_adi()+ "' ın ozel yetenegi : " +ozelYetenek );
    }
    @Override
    public void takimBilgisiGoster(){
        super.takimBilgisiGoster();
        System.out.println("Ozel Yetenek : " + ozelYetenek);
    }

    @Override
    public void teknikDirektorDegis(String new_Teknik_Direktor) {
        super.teknikDirektorDegis(new_Teknik_Direktor); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
