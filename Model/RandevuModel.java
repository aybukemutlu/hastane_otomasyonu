/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.Randevu;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nurcan
 */
public class RandevuModel {

    private DBConnection db;

    public DBConnection getDb() {

        if (db == null) {
            this.db = new DBConnection();
        }
        return db;
    }

    public void setDb(DBConnection connection) {
        this.db = connection;
    }

    public void insert(Randevu c) {
        try {
            Statement st = this.getDb().connect().createStatement();
            st.executeUpdate("insert into randevularım(doktoradi,poliklinik,randevusaati) values ('" + c.getDoktoradi() + "','" + c.getPoliklinik() + "','" + c.getRandevusaati() + "')");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Randevu> getList() {
        List<Randevu> cList = new ArrayList<>();
        try {
            Statement st = this.getDb().connect().createStatement();
            ResultSet rs = st.executeQuery("select * from randevularım");

            while (rs.next()) {
                Randevu tmp = new Randevu(rs.getString("doktoradi"), rs.getString("poliklinik"), rs.getString("randevusaati"));
                cList.add(tmp);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return cList;

    }

}
