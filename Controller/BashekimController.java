/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.Bashekim;
import Model.BashekimModel;
import java.util.List;

/**
 *
 * @author nurcan
 */
public class BashekimController {

    private BashekimModel model;

    public BashekimModel getBashekimodel() {
        if (this.model == null) {
            this.model = new BashekimModel();
        }
        return model;
    }

    public void setBashekimodel(BashekimModel bashekimodel) {
        this.model = bashekimodel;
    }

    public void create(int id, String poliklinik, String name) {
        Bashekim bashekim = new Bashekim(id, poliklinik, name);
        this.getBashekimodel().insert(bashekim);
    }

    public List<Bashekim> getList() {
        return this.model.getList();
    }

}
