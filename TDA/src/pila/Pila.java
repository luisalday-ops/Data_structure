/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pila;

/**
 *
 * @author luism
 */
public interface Pila {
    void push(String elemento);
    String pop();
    char observar();
    boolean estaVacia();

    public Object verTope();
}
