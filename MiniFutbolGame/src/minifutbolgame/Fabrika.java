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
public class Fabrika {
    public Takim Takimuret(int sayi){
        switch (sayi) {
            case 0:
                return new RealSakarya("Real Sakarya", "Fatih Terim", 213, 190,"Full ATAK");
            case 1:
                return new ManisaDortmund("Manisa Dortmund", "Senol Gunes",180,249,"Full Defans");
            case 2:
                return new NewUnited("New United"," Aykut Kocaman",190,250,"Altın Top");
            default:
                return null;
        }
        
    }
    
    
}
