package programas;

import clases.Numero;

/**
 *
 * @author Noemí Lara Acono
 */
public class TestNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Numero numero = new Numero();
        
        int x = numero.getValor();
        
        System.out.println("fibRec(" + x +")=" + Numero.fibw(x));
        System.out.println("fibCic(" + x +")=" + numero.fib());
        
    }
    
}
