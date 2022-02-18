package programas;

import javax.swing.JOptionPane;
import clases.Cadena;

/**
 *
 * @author Noemí Lara Acono
 */
public class TestCadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cadena frase = new Cadena (
                JOptionPane.showInputDialog("Ingrese una frase"));
        
        int r = frase.mayus();
        System.out.println("La mayúscula está en la posición: " + r );
        
        System.out.println("En la cadena " + frase + 
                (r==-1? " NO hay mayúsculas" 
                        :" la primera mayúscula está en la posición " + r));

        Cadena texto = new Cadena("hola Mundo");
        System.out.println("Resultado = " + texto.mayus());
        double x = Math.PI*5;
        
    }
    
}
