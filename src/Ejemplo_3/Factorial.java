package Ejemplo_3;

public class Factorial {
    private int n;

    public Factorial(int n) {
        setN(n);
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        if (n>=0) {
            this.n = n;
        };
    }

    public long factorial_I(){
        long fact=1;
        for (int i = 1; i < n; i++) {
            fact*=i;
        }
        return fact;
    }


    @Override
    public String toString() {
        return "Factorial [n=" + n + "]";
    }
}
