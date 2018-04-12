/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.dao.impl.DaoUmur;
import com.model.Umur;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ZAKARIA
 */
public class ServiceUmur {
    DaoUmur daoUmur = new DaoUmur();

    public void init() {
        daoUmur.init();
    }

    public boolean add(Umur umur) {
        List<Umur> ln = daoUmur.getAll();
        for (Umur m : ln) {
            if (m.getId().equals(umur.getId())) {
                return false;
            }
        }
        daoUmur.save(umur);
        return true;
    }

    public boolean update(Umur umur) {
        List<Umur> ln = daoUmur.getAll();
        for (Umur m : ln) {
            if (m.getId().equals(umur.getId())) {
                daoUmur.update(umur, Integer.toUnsignedLong(ln.indexOf(m)));
                return true;
            }
        }
        return false;
    }

    public void delete(Long index) {
        daoUmur.delete(index);
    }

    public ArrayList<Umur> getAll() {
        return daoUmur.getAll();
    }

    public Umur getById(Long id) {
        return daoUmur.getById(id);
    }
    
    public Umur getByName(String name){
        for (Umur m : daoUmur.getAll()) {
            if (m.getNama().equals(name)) {
                return m;
            }
        }
        return null;
    }
}
