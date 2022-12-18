/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryPattern;

/**
 *
 * @author nurcan
 */
public class Bashekim implements Worker {

    @Override
    public void works() {
        System.out.println("**Başhekim Listesi**");
        System.out.println("Ahmet YAPTIRMIŞ - Diş polikliniği");
        System.out.println("Dr. Serdal Akgündüz - Aile Hekimliği");
        System.out.println("Uzm. Dr. Hande Acartürk - Anestezi Polikliniği");
        System.out.println("Dyt. Nuran Aksu - Beslenme Polikliniği");
        System.out.println("Prof. Dr. Gülşah Bademci - Beyin ve Sinir Cerrahisi Polikliniği");
        System.out.println("Merve Bingöl - Cildiye Poliklinikleri");
        System.out.println("Doç. Dr. Özgür Ekinci - Genel Cerrahi Poliklinikleri");
    }

}
