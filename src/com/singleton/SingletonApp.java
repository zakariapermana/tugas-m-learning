/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.singleton;

import com.service.ServiceEnjoySport;

/**
 *
 * @author ZAKARIA
 */
public class SingletonApp {
    private static SingletonApp instance=null;
 
 public SingletonApp(){
     init();
 }
 public static SingletonApp getInstance(){
     if(instance==null){
         instance = new SingletonApp();
     }
     return instance;
 }
 
 private ServiceEnjoySport serviceEnjoySport;
 
 private void init(){
     serviceEnjoySport = new ServiceEnjoySport();
 }
 
 public ServiceEnjoySport getServiceEnjoySport(){
     return serviceEnjoySport;
 }
}
