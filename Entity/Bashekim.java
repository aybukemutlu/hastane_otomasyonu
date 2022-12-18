/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author nurcan
 */
public class Bashekim {

    private int id;
    private String poliklinik;
    private String name;

    public Bashekim() {
    }

    public Bashekim(int id, String poliklinik, String name) {
        this.id = id;
        this.poliklinik = poliklinik;
        this.name = name;
    }

    public Bashekim(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPoliklinik() {
        return poliklinik;
    }

    public void setPoliklinik(String poliklinik) {
        this.poliklinik = poliklinik;
    }

    @Override
    public String toString() {
        return " \n Bashekim{" + "id=" + id + "poliklinik=" + poliklinik + ", name=" + name + '}';

    }

}
