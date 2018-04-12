/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.impl;

import com.dao.DaoApp;
import com.model.Kegemukan;
import java.util.ArrayList;

/**
 *
 * @author ZAKARIA
 */
public class DaoKegemukan implements DaoApp<Kegemukan, Long>{

    private ArrayList<Kegemukan> dbKegemukans = new ArrayList<Kegemukan>();
    @Override
    public void init() {
        dbKegemukans.add(new Kegemukan(new Long(1), "gemuk"));
        dbKegemukans.add(new Kegemukan(new Long(2), "sangat gemuk"));
        dbKegemukans.add(new Kegemukan(new Long(3), "terlalu gemuk"));
    }

    @Override
    public void save(Kegemukan t) {
        dbKegemukans.add(t);
    }

    @Override
    public void update(Kegemukan t, Long id) {
        dbKegemukans.set(id.intValue(), t);
    }

    @Override
    public void delete(Long id) {
        dbKegemukans.remove(id);
    }

    @Override
    public ArrayList<Kegemukan> getAll() {
        return dbKegemukans;
    }

    @Override
    public Kegemukan getById(Long id) {
        for (Kegemukan m : dbKegemukans) {
            if (m.getId() == id) {
                return m;
            }
        }
        return null;
    }
    
}
