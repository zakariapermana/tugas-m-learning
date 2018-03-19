/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.dao.impl.DaoEnjoySport;
import com.model.EnjoySport;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ZAKARIA
 */
public class ServiceEnjoySport {

    DaoEnjoySport daoEnjoySport = new DaoEnjoySport();

    public void init() {
        daoEnjoySport.init();
    }

    public boolean add(EnjoySport enjoySport) {
        List<EnjoySport> ln = daoEnjoySport.getAll();
        for (EnjoySport m : ln) {
            if (m.getId().equals(enjoySport.getId())) {
                return false;
            }
        }
        daoEnjoySport.save(enjoySport);
        return true;
    }

    public boolean update(EnjoySport enjoySport) {
        List<EnjoySport> ln = daoEnjoySport.getAll();
        for (EnjoySport m : ln) {
            if (m.getId().equals(enjoySport.getId())) {
                daoEnjoySport.update(enjoySport, Integer.toUnsignedLong(ln.indexOf(m)));
                return true;
            }
        }
        return false;
    }

    public void delete(Long index) {
        daoEnjoySport.delete(index);
    }

    public ArrayList<EnjoySport> getAll() {
        return daoEnjoySport.getAll();
    }

    public EnjoySport getById(Long id) {
        return daoEnjoySport.getById(id);
    }
}
