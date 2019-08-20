/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

/**
 *
 * @author estudiante
 */
public class Operador {
    public int numero1 = 0;
    public int numero2 = 0;
    public int total = 0;
    
   //metodo constructor
    public Operador (int num1,int num2) {
        this.numero1 = num1;
        this.numero2 = num2;
    }
    //metodo suma
    public int suma () {
        return this.numero1 + this.numero2;
    }
    // metodo resta
    public int resta () {
        return this.numero1 - this.numero2;
    }
    // metodo multiplicacion
    public int multiplicacion () {
        return this.numero1 * this.numero2;
    }
    // metodo division
    public int division () {
        return this.numero1 / this.numero2;
    }
    
}
