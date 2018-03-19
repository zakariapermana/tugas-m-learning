/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.impl;

import com.dao.DaoApp;
import com.model.EnjoySport;
import java.util.ArrayList;

/**
 *
 * @author ZAKARIA
 */
public class DaoEnjoySport implements DaoApp<EnjoySport, Long> {

    private ArrayList<EnjoySport> dbEnjoySport = new ArrayList<EnjoySport>();

    @Override
    public void init() {
        dbEnjoySport.add(new EnjoySport(new Long(1), "sunny", "warm", "normal", "strong", "warm", "same", true));
        dbEnjoySport.add(new EnjoySport(new Long(2), "sunny", "warm", "high", "strong", "warm", "same", true));
        dbEnjoySport.add(new EnjoySport(new Long(3), "rainy", "cold", "high", "strong", "warm", "change", false));
        dbEnjoySport.add(new EnjoySport(new Long(4), "sunny", "warm", "high", "strong", "cold", "change", true));
    }

    @Override
    public void save(EnjoySport t) {
        dbEnjoySport.add(t);
    }

    @Override
    public void update(EnjoySport t, Long id) {
        dbEnjoySport.set(id.intValue(), t);
    }

    @Override
    public void delete(Long id) {
        dbEnjoySport.remove(id.intValue());
    }

    @Override
    public ArrayList<EnjoySport> getAll() {
        return dbEnjoySport;
    }

    @Override
    public EnjoySport getById(Long id) {
        for (EnjoySport m : dbEnjoySport) {
            if (m.getId() == id) {
                return m;
            }
        }
        return null;
    }

}
