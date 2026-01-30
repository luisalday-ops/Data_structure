/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pila;

/**
 *
 * @author luism
 */
public class PruebaPila {
    public static void main(String[] args){
        Pila pila = new PilaArrayList();
        
        pila.push("10");
        pila.push("20");
        pila.push("30");
        
        while (!pila.estaVacia()){
            System.out.println(pila.pop());
        }
    }
}
