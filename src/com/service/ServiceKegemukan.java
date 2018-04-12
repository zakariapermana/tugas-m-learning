/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.dao.impl.DaoKegemukan;
import com.model.Kegemukan;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ZAKARIA
 */
public class ServiceKegemukan {
    DaoKegemukan daoKegemukan = new DaoKegemukan();

    public void init() {
        daoKegemukan.init();
    }

    public boolean add(Kegemukan kegemukan) {
        List<Kegemukan> ln = daoKegemukan.getAll();
        for (Kegemukan m : ln) {
            if (m.getId().equals(kegemukan.getId())) {
                return false;
            }
        }
        daoKegemukan.save(kegemukan);
        return true;
    }

    public boolean update(Kegemukan kegemukan) {
        List<Kegemukan> ln = daoKegemukan.getAll();
        for (Kegemukan m : ln) {
            if (m.getId().equals(kegemukan.getId())) {
                daoKegemukan.update(kegemukan, Integer.toUnsignedLong(ln.indexOf(m)));
                return true;
            }
        }
        return false;
    }

    public void delete(Long index) {
        daoKegemukan.delete(index);
    }

    public ArrayList<Kegemukan> getAll() {
        return daoKegemukan.getAll();
    }

    public Kegemukan getById(Long id) {
        return daoKegemukan.getById(id);
    }
    
    public Kegemukan getByName(String name){
        for (Kegemukan m : daoKegemukan.getAll()) {
            if (m.getNama().equals(name)) {
                return m;
            }
        }
        return null;
    }
}
