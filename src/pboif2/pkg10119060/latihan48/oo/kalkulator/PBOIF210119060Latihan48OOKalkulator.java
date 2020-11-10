/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119060.latihan48.oo.kalkulator;



/**
 *
  @author Megianto Adi saputra
 Nama         : Megianto Adi Saputra
 Kelas        : IF-2
 NIM          : 10119060
 Deskripsi    : Program kalkulator
 */
public class PBOIF210119060Latihan48OOKalkulator {

    public static void main(String[] args) {
        // TODO code application logic here
   
        kalkulator objKalkulator = new kalkulator();
        
        System.out.println("VALUE 1 = "+objKalkulator.getValue1());
        objKalkulator.setValue1(7);
        System.out.println("VALUE 2 = "+objKalkulator.getValue2());
        objKalkulator.setValue2(5);
        objKalkulator.setNameProject();
        objKalkulator.setNoteProject();
        System.out.println("Result Add is = "+objKalkulator.add(objKalkulator.getValue1(),objKalkulator.getValue2()));
        System.out.println("Result Minus is = "+objKalkulator.minus(objKalkulator.getValue1(),objKalkulator.getValue2()));
        System.out.println("Result Multiple is = "+objKalkulator.multiplication(objKalkulator.getValue1(),objKalkulator.getValue2()));
        System.out.println("Result Division is = "+objKalkulator.division(objKalkulator.getValue1(),objKalkulator.getValue2()));
    }
    
}
