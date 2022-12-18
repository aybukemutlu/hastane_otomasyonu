/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

public class Hasta {

    private int id;
    private String tc;
    private String adisoyadi;
    private String sifre;

    public Hasta() {
    }

    public Hasta(int id, String tc, String adisoyadi, String sifre) {
        this.id = id;
        this.tc = tc;
        this.adisoyadi = adisoyadi;
        this.sifre = sifre;
    }

    public Hasta(String tc, String sifre) {
        this.tc = tc;
        this.sifre = sifre;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public String getAdisoyadi() {
        return adisoyadi;
    }

    public void setAdisoyadi(String adisoyadi) {
        this.adisoyadi = adisoyadi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
