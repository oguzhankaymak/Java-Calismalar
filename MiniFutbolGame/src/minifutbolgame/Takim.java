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
public class Takim {
    private String takim_adi;
    private String teknik_direktor;
    private int atak_gucu;
    private int defans;

    public Takim(String takim_adi, String teknik_direktor, int atak_gucu, int defans) {
        this.takim_adi = takim_adi;
        this.teknik_direktor = teknik_direktor;
        this.atak_gucu = atak_gucu;
        this.defans = defans;
    }

    
    

    

    public String getTeknik_direktor() {
        return teknik_direktor;
    }

    public void setTeknik_direktor(String teknik_direktor) {
        this.teknik_direktor = teknik_direktor;
    }

    public String getTakim_adi() {
        return takim_adi;
    }

    public void setTakim_adi(String takim_adi) {
        this.takim_adi = takim_adi;
    }

    public int getAtak_gucu() {
        return atak_gucu;
    }

    public void setAtak_gucu(int atak_gucu) {
        this.atak_gucu = atak_gucu;
    }

    public int getDefans() {
        return defans;
    }

    public void setDefans(int defans) {
        this.defans = defans;
    }
    
    public void  atakYap(){
        System.out.println(getTakim_adi() + " atak yapiyor....");
    }
    public void ozelYetenekKullan(){
        System.out.println("Ozel yetenginiz bulunmuyor...");
    }
    public void teknikDirektorDegis(String new_Teknik_Direktor){
        this.teknik_direktor = new_Teknik_Direktor;
    }
    public void takimBilgisiGoster(){
        System.out.println("Takim Adi : " + takim_adi);
        System.out.println("Atak Gucu : " + atak_gucu);
        System.out.println("Defans : " + defans);
    }
    
}
