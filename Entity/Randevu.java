/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

public class Randevu {

    private String doktoradi;
    private String poliklinik;
    private String randevusaati;

    public Randevu() {
    }

    public Randevu(String doktoradi, String poliklinik, String randevusaati) {
        this.doktoradi = doktoradi;
        this.poliklinik = poliklinik;
        this.randevusaati = randevusaati;
    }

    public String getRandevusaati() {
        return randevusaati;
    }

    public void setRandevusaati(String randevusaati) {
        this.randevusaati = randevusaati;
    }

    public String getDoktoradi() {
        return doktoradi;
    }

    public void setDoktoradi(String doktoradi) {
        this.doktoradi = doktoradi;
    }

    public String getPoliklinik() {
        return poliklinik;
    }

    public void setPoliklinik(String poliklinik) {
        this.poliklinik = poliklinik;
    }

    @Override
    public String toString() {
        return "Randevu{" + "doktoradi=" + doktoradi + ", poliklinik=" + poliklinik + ", randevusaati=" + randevusaati + '}';
    }

    
}
