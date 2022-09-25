package Ejer_Recursividad;

public class Suma {
    private int n;

    public Suma(int n) {
        setN(n);
    }

    public void setN(int n){
        this.n = n<0?1:n;
    }

    public int getN(){
        return n;
    }

    // MODO ITERATIVO
    public double calcSuma_I(){
        double result=0.0;

        for (double i = 1; i <= n; i++) {
            result+=(1/i);
        }
        return result;
    }

    // MODO RECURSIVO
    public double calcSuma_R(){
        return calcSuma(n);
    }

    public double calcSuma(double n){
        if (n != 1) {
            return calcSuma(n-1) + (1/n);
        }else{
            return 1;
        }
    }
}