package clases;

/**
 *
 * @author Noemí Lara Acono
 */
public class Numero {
    private int valor;
    private static int cont=0;

    public Numero(int valor) {
        this.valor = valor;
    }

    public Numero() {
        this(8);
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    @Override
    public String toString(){
        return "" + valor;
    }
    
    public int fib(){
        return fib(valor);
    }
    
    private int fib(int n){
        cont++;
        System.out.println(cont + " n=" + n);
        if (n<2)
            return n;
        return fib(n-1) + fib(n-2);
    }
    
    public static int fibw(int n)
   {
       int f1 = 1, f2 = 1, nuevo;
       while (n > 2)
       {
           cont++;
           System.out.println("Procesando ciclo... " + n);
           nuevo = f1 + f2;
           f1 = f2;   f2 = nuevo;
           n--;
       }
       return f2;
   }
    
    
    
    
}
