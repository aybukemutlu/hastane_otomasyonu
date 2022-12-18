/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryPattern;

public class Hemsire implements Worker {

    @Override
    public void works() {
        System.out.println("**Hemşire Listesi**");
        System.out.println("ÖZHAN KILIÇ	");
        System.out.println("CENGİZ GÜL");
        System.out.println("MİNE CENGİZ");
        System.out.println("SEHER AYDIN	");
        System.out.println("UĞUR KALAÇ");
    }

}
