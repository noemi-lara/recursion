/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Noemí Lara Acono
 */
public class Cadena {
    private String cadena;

    public Cadena(String cadena) {
        this.cadena = cadena;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }
    
    public int mayus(){
        return mayus(cadena, 0);
    }
    
    private int mayus(String str, int indice) {

        // Caso base: fin de la cadena retornar -1
        if (indice == str.length()) return -1;

        // Caseo base:si el caracter es mayúscula retornar el indice
        if (Character.isUpperCase(str.charAt(indice))) return indice;

        // paso recursivo
        return mayus(str, indice + 1);
    }
    
    @Override
    public String toString(){
        return cadena;
    }
    
    
}
