/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryPattern;

public class AnotherWorkerFactory extends AbstractFactory{

    @Override
    public Worker getWorker(String worksType) {
          if(worksType.equalsIgnoreCase("BAŞHEKİM")){
         return new Bashekim();         
      }else if(worksType.equalsIgnoreCase("HEMŞİRE")){
         return new Hemsire();
      }else if(worksType.equalsIgnoreCase("RESEPSİYONİST"))
      {
         return new Resepsiyonist(); 
      }
      return null;
    }
    
}
