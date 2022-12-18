/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.Hasta;
import Model.HastaModel;

public class HastaController {

    private HastaModel model;

    public HastaModel getModel() {
        if (this.model == null) {
            this.model = new HastaModel();
        }
        return model;
    }

    public void setModel(HastaModel model) {
        this.model = model;
    }

    public void create(int id, String tc, String adisoyadi, String sifre) {
        Hasta hasta = new Hasta(id, tc, adisoyadi, sifre);
        this.getModel().insert(hasta);
    }

}
