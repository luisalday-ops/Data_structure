/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pila;

import java.util.Scanner;

/**
 *
 * @author luism
 */
public class PilaOrdenamiento {
    public static void main (String[] args){
        String vector[] = {"{","[","(","/",")","]","}"};
        
        Pila resultado = new PilaArrayList();
        Pila descarte = new PilaArrayList();
        Pila letras = new PilaArrayList();
        
        String cadena;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cual es la cadena a evaluar?");
        
        cadena = sc.nextLine();
        
        for (int i=0; i<cadena.length(); i++) {
            letras.push(String.valueOf(cadena.charAt(i)));
            
        }
        
        int cont = 0;
        String valor;
        while (!letras.estaVacia()) {
            valor = letras.pop();
            
            System.out.println(valor);
            
            if (vector[cont].equals(valor)) {
                resultado.push(valor);
                System.out.println("Se agrego a resultado: " + valor);
            }
            
            else {
                descarte.push(valor);
                System.out.println("Se descarto: " + valor);
            }
            cont++;
        }
        
        cont=0;
        while (!descarte.estaVacia()) {
            valor = descarte.pop();
            
            System.out.println(valor);
            
            if (vector[cont].equals(valor)) {
                resultado.push(valor);
                System.out.println("Se agrego a resultado: " + valor);
            }
            
            else {
                letras.push(valor);
                System.out.println("Se descarto: " + valor);
            }
            cont++;
        }
    }
}
