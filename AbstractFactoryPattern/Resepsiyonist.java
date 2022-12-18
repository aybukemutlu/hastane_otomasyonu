/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryPattern;

public class Resepsiyonist implements Worker{

    @Override
    public void works() {
        System.out.println("**Resepsiyonist Listesi**");
        System.out.println("ALPER KONUKCU");
        System.out.println("EMSAL KAMBAY");
        System.out.println("NESRİN FIRTINA");
    }
    
}
