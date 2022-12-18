/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.Bashekim;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nurcan
 */
public class BashekimModel {

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

    public void insert(Bashekim c) {
        try {
            Statement st = this.getDb().connect().createStatement();
            st.executeUpdate("insert into bashekim(id,poliklinik, name) values ('" + c.getId() + "','" + c.getPoliklinik() + "','" + c.getName() + "')");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Bashekim> getList() {
        List<Bashekim> cList = new ArrayList<>();
        try {
            Statement st = this.getDb().connect().createStatement();
            ResultSet rs = st.executeQuery("select * from bashekim");

            while (rs.next()) {
                Bashekim tmp = new Bashekim(rs.getInt("id"), rs.getString("poliklinik"), rs.getString("name"));
                cList.add(tmp);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return cList;

    }

    public List<Bashekim> getDoktorList() {
        List<Bashekim> cList = new ArrayList<>();
        try {
            Statement st = this.getDb().connect().createStatement();
            ResultSet rs = st.executeQuery("select * from bashekim");

            while (rs.next()) {
                Bashekim tmp = new Bashekim(rs.getString("name"));
                cList.add(tmp);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return cList;

    }

}
