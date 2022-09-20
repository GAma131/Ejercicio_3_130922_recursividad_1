package Ejemplo_1;

public class Factorial {
    private int x;

    public Factorial(int x) {
        setX(x);
    }

    public void setX(int x){
        this.x = x<0?0:x;
    }

    public int getX(){
        return x;
    }

    // METODO ITERATIVO
    public int FactIterativo(){
        int fact=1;
        for (int i = 1; i <= x; i++) {
            fact*=i;
        }
        return fact;
    }


    // METODO RECURSIVO
    public int factRecursivo(){
        return fact(x);
    }

    private int fact(int n){
        if (n == 1 || n==0) {
            // Caso Base
            return 1;
        }else{
            // Caso General
            return n*fact(n-1);
        }
    }

    @Override
    public String toString() {
        return "El valor de n es: "+x;
    }
}
