/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pila;

import java.util.ArrayList;

/**
 *
 * @author luism
 */
public class PilaArrayList  implements Pila{
    private final ArrayList<String> elementos = new ArrayList<>();
    
    @Override
    public void push (String elemento){
        elementos.add(elemento);
    }
    
    @Override
    public String pop(){
        return elementos.remove(elementos.size() - 1);
    }
    
    @Override
    public boolean estaVacia(){
        return elementos.isEmpty();
    }

    @Override
    public char observar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object verTope() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
