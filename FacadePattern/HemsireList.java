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
public class HemsireList implements List {

    @Override
    public void nobetListesi() {
        System.out.println("****Hemşire için 1 haftalık nöbet listesi:****");
        System.out.println("Pazartesi: Martha Ballard 22:00 - 06:00 saatleri arasında ");
        System.out.println("Salı: Dorothea Dix 22:00 - 06:00 saatleri arasında ");
        System.out.println("Çarşamba: Mary Todd Lincoln 22:00 - 06:00 saatleri arasında ");
        System.out.println("Perşembe: Walt Whitman 22:00 - 06:00 saatleri arasında ");
        System.out.println("Cuma: Florence Nightingale 22:00 - 06:00 saatleri arasında ");

    }

}
