/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119060.latihan48.oo.kalkulator;

/**
 *
 * @author asus
 */
public class kalkulator {
    private double value1;
    private double value2;
    
    public double getValue1(){
        return value1;
    }
    
    public void setValue1(double value1){
        this.value1 = value2;
    }
    
    public double getValue2(){
        return value2;
    }
    
    public void setValue2(double value2){
        this.value2 = value2;
    }
    
    public void setNameProject(){
        System.out.println("Project Calculator");
    }
    
    public void setNoteProject(){
        System.out.println("This project shown you now to manage methodein java");
    }
    
    public double add(double val1, double val2){
        return val1 + val2;
    }
    
    public double minus(double val1, double val2){
        return val1 - val2;
    }
    
     public double multiplication(double val1, double val2){
        return val1 * val2;
    }
     
     public double division(double val1, double val2){
        return val1 / val2;
    }

}
