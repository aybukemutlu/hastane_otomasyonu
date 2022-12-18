/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.Randevu;
import Model.RandevuModel;
import java.util.List;

/**
 *
 * @author nurcan
 */
public class RandevuController {
    private RandevuModel model;

    public RandevuModel getRandevumodel() {
        if (this.model == null) {
            this.model = new RandevuModel();
        }
        return model;
    }

    public void setRandevumodel(RandevuModel randevumodel) {
        this.model = randevumodel;
    }

    public void create(String doktoradi, String poliklinik, String randevusaati) {
        Randevu randevu = new Randevu(doktoradi, poliklinik, randevusaati);
        this.getRandevumodel().insert(randevu);
    }

    public List<Randevu> getList() {
        return this.model.getList();
    }

}
