/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.singleton;

import com.service.ServiceEnjoySport;
import com.service.ServiceHipertensi;
import com.service.ServiceKegemukan;
import com.service.ServiceUmur;

/**
 *
 * @author ZAKARIA
 */
public class SingletonApp {

    private static SingletonApp instance = null;

    public SingletonApp() {
        init();
    }

    public static SingletonApp getInstance() {
        if (instance == null) {
            instance = new SingletonApp();
        }
        return instance;
    }

    private ServiceEnjoySport serviceEnjoySport;
    private ServiceHipertensi serviceHipertensi;
    private ServiceUmur serviceUmur;
    private ServiceKegemukan serviceKegemukan;

    private void init() {
        serviceEnjoySport = new ServiceEnjoySport();
        serviceHipertensi = new ServiceHipertensi();
        serviceUmur = new ServiceUmur();
        serviceKegemukan = new ServiceKegemukan();
    }

    public ServiceEnjoySport getServiceEnjoySport() {
        return serviceEnjoySport;
    }
    
    public ServiceHipertensi getServiceHipertensi(){
        return serviceHipertensi;
    }
    
    public ServiceUmur getServiceUmur(){
        return serviceUmur;
    }
    
    public ServiceKegemukan getServiceKegemukan(){
        return serviceKegemukan;
    }

}
