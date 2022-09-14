package Ejemplo_1;
import javax.tools.ForwardingJavaFileObject;

public class Fibonacci {
    private int n;

    public Fibonacci(int n){
        setN(n);
    }

    public void setN(int n){
        this.n=n>=0?n:0;
    }

    public int getnN(){
        return n;
    }

    // public int fiboIterativo(){

    // }


    public int fiboRecursivo(){
        return fibo(n);
    }

    private int fibo(int n){
        if (n==0) {
            // Caso Base:
            return 0;
        } else if(n==1) {
            // Caso Base
            return 1;
        }else{
            // Caso General
            return fibo(n-1) + fibo(n-2);
        }
    }
}
