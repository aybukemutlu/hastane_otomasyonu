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
public class ListMaker {

    private List hemsire;
    private List hademe;

    public ListMaker() {
        hemsire = new HemsireList();
        hademe = new HademeList();
    }

    public void ListHemsire() {
        hemsire.nobetListesi();
    }

    public void ListHademe() {
        hademe.nobetListesi();
    }

}
