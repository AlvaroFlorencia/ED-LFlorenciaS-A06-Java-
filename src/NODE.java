/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class NODE {
    int dato;
NODE siguiente;
 

    public NODE(int dato, NODE siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }
public NODE(int dato) {
        this.dato = dato;   //Differents constructors with differents parameters
        this.siguiente = null;
    }

public NODE(NODE siguiente) {
        this.dato = 0;
        this.siguiente = siguiente;
    }
public NODE() {
        this.dato = 0;
        this.siguiente = null;
    }
    public int getDato() {  //Getters
        return dato;
    }

    public NODE getSiguente() {
        return siguiente;
    }

    public void setDato(int dato) {  //Setters
        this.dato = dato;
    }

    public void setSiguente(NODE siguiente) {
        this.siguiente = siguiente;
    }

    
}
