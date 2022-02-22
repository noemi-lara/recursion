
package practica;

import javax.swing.JOptionPane;

/**
 *
 * @author Noemí
 */
public class Recursividad {
    
    static int contador;
    public static void main(String[] args) {
        int n;
        do{
            n = Integer.parseInt(
                    JOptionPane.showInputDialog("Ingrese un número"));
           
            contador=0;     
            System.out.printf("fibCic(%d) = %d contador=%d\n", 
                                        n, fibCic(n), contador);
            contador = 0;
            System.out.printf("fibRec(%d) = %d contador=%d\n\n", 
                                        n, fib(n), contador);
            
            //System.out.println("fibRec(" + n + ") = " + fib(n));
            
            //System.out.println("suma(" + n + ") = " + suma(n));
            //imprimir(5);
            //System.out.println("factorial = " + factorial(n));
        }while (n>0);
    }
    
    public static int suma(int n) {
        //System.out.println("n=" + n);
	if (n<=9)
            return n;
        else{
            //int residuo = n % 10;
            //System.out.println("residuo = " + residuo);
            //return suma(n/10) + residuo;
            return suma(n/10) + n%10;
        }
    }
    
    public static int suma2(int n) {
	if (n<=9)
            return n;
        return suma(n/10) + n%10;
    }
    
    public static void imprimir(int n){
        if (n>0){
            //System.out.println("n=" + n);
            imprimir();
            imprimir(--n);
            System.out.println("n=" + (n+1) );
            //System.out.println("Fin n=" + n );
        }
    }
    
    private static void imprimir(){
        System.out.println("Hola yo no soy recursivo");
    }
    
    public static int factorial (int n) {
	if (n < 2) 
            return 1;
        return n * factorial(n-1);
}

    public static int fib (int n)
   {
       contador++;
       System.out.println("Procesando recursión... " + n);
       if  (n < 2)
            return n;
       else
            return  fib (n-2)   +
                         fib (n-1);
   }
public static int fibCic(int n)
   {
       if (n==0) return 0;
       int f1 = 1, f2 = 1, nuevo;
       while (n > 2)
       {
           contador++;
           System.out.println("Procesando ciclo... " + n);
           nuevo = f1 + f2;
           f1 = f2;   f2 = nuevo;
           n--;
       }
       return f2;
   }

    
}
