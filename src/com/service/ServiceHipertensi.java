/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.dao.impl.DaoHipertensi;
import com.model.Hipertensi;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ZAKARIA
 */
public class ServiceHipertensi {
    DaoHipertensi daoHipertensi = new DaoHipertensi();

    public void init() {
        daoHipertensi.init();
    }

    public boolean add(Hipertensi hipertensi) {
        List<Hipertensi> ln = daoHipertensi.getAll();
        for (Hipertensi m : ln) {
            if (m.getId().equals(hipertensi.getId())) {
                return false;
            }
        }
        daoHipertensi.save(hipertensi);
        return true;
    }

    public boolean update(Hipertensi hipertensi) {
        List<Hipertensi> ln = daoHipertensi.getAll();
        for (Hipertensi m : ln) {
            if (m.getId().equals(hipertensi.getId())) {
                daoHipertensi.update(hipertensi, Integer.toUnsignedLong(ln.indexOf(m)));
                return true;
            }
        }
        return false;
    }

    public void delete(Long index) {
        daoHipertensi.delete(index);
    }

    public ArrayList<Hipertensi> getAll() {
        return daoHipertensi.getAll();
    }

    public Hipertensi getById(Long id) {
        return daoHipertensi.getById(id);
    }
    
    public Float getDistance(Hipertensi s, Hipertensi e){
        
        return 0f;
    }
}
