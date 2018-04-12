/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.impl;

import com.dao.DaoApp;
import com.model.Umur;
import java.util.ArrayList;

/**
 *
 * @author ZAKARIA
 */
public class DaoUmur implements DaoApp<Umur, Long>{

    private ArrayList<Umur> dbUmur = new ArrayList<Umur>();
    
    @Override
    public void init() {
        dbUmur.add(new Umur(new Long(1), "muda"));
        dbUmur.add(new Umur(new Long(2), "paruh baya"));
        dbUmur.add(new Umur(new Long(3), "tua"));
    }

    @Override
    public void save(Umur t) {
        dbUmur.add(t);
    }

    @Override
    public void update(Umur t, Long id) {
        dbUmur.set(id.intValue(), t);
    }

    @Override
    public void delete(Long id) {
        dbUmur.remove(id.intValue());
    }

    @Override
    public ArrayList<Umur> getAll() {
        return dbUmur;
    }

    @Override
    public Umur getById(Long id) {
        for (Umur m : dbUmur) {
            if (m.getId() == id) {
                return m;
            }
        }
        return null;
    }
    
}
