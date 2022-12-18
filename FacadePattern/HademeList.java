/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacadePattern;

/**
 *
 * @author nurcan
 */
public class HademeList implements List {

    @Override
    public void nobetListesi() {
        System.out.println("****Hademe için 1 haftalık nöbet listesi:****");
        System.out.println("Pazartesi: Hademe1 00:00 - 08:00 saatleri arasında ");
        System.out.println("Salı: Hademe2 00:00 - 08:00 saatleri arasında ");
        System.out.println("Çarşamba: Hademe3 00:00 - 08:00 saatleri arasında ");
        System.out.println("Perşembe: Hademe1 00:00 - 08:00 saatleri arasında ");
        System.out.println("Cuma: Hademe2 00:00 - 08:00 saatleri arasında ");

    }

}
