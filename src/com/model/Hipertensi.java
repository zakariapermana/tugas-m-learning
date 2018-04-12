/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.util.Comparator;

/**
 *
 * @author ZAKARIA
 */
public class Hipertensi {
    Long id;
    Umur umur;
    Kegemukan kegemukan;
    Boolean hipertensi;
    Double distance;
    Integer label;

    public Integer getLabel() {
        return label;
    }

    public void setLabel(Integer label) {
        this.label = label;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Hipertensi(Long id, Umur umur, Kegemukan kegemukan, Boolean hipertensi) {
        this.id = id;
        this.umur = umur;
        this.kegemukan = kegemukan;
        this.hipertensi = hipertensi;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Umur getUmur() {
        return umur;
    }

    public void setUmur(Umur umur) {
        this.umur = umur;
    }

    public Kegemukan getKegemukan() {
        return kegemukan;
    }

    public void setKegemukan(Kegemukan kegemukan) {
        this.kegemukan = kegemukan;
    }

    public Boolean getHipertensi() {
        return hipertensi;
    }

    public void setHipertensi(Boolean hipertensi) {
        this.hipertensi = hipertensi;
    }   
    
    public static Comparator<Hipertensi> distanceComparator = new Comparator<Hipertensi>() {
        @Override
        public int compare(Hipertensi o1, Hipertensi o2) {
            Double distance1 = o1.getDistance();
            Double distance2 = o2.getDistance();
            return distance1.compareTo(distance2);
        }
    };
}
