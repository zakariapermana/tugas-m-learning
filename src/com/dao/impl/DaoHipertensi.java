/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.impl;

import com.dao.DaoApp;
import com.model.Hipertensi;
import com.model.Umur;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ZAKARIA
 */
public class DaoHipertensi implements DaoApp<Hipertensi, Long>{

    private ArrayList<Hipertensi> dbHipertensi = new ArrayList<Hipertensi>();
    
    @Override
    public void init() {

    }

    @Override
    public void save(Hipertensi t) {
        dbHipertensi.add(t);
    }

    @Override
    public void update(Hipertensi t, Long id) {
        dbHipertensi.set(id.intValue(), t);
    }

    @Override
    public void delete(Long id) {
        dbHipertensi.remove(id.intValue());
    }

    @Override
    public ArrayList<Hipertensi> getAll() {
        return dbHipertensi;
    }

    @Override
    public Hipertensi getById(Long id) {
        for (Hipertensi m : dbHipertensi) {
            if (m.getId() == id) {
                return m;
            }
        }
        return null;
    }
    
}
