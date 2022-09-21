package Ejemplo_3;

import Ejemplo_1.Factorial;

public class Division {
    private int n;
    private Factorial objFact;

    public Division(int n) {
        setN(n);
        objFact= new Factorial(n);
    }

    public void setN(int n) {
        this.n = (n>=1)?n:1;
    }

    public int getN() {
        return n;
    }


    // METODO ITERATIVO
    public double Calcular(){
        double z=0;

        for (int i = 1; i <= n; i++) {
            z+=1/fact(i);
        }

        return z;
    }

    private long fact(int n){
        int fact=1;
        for (int i = 1; i <= n; i++) {
            fact*=i;
        }
        return fact;
    }

    public double Calcular2(){
        Factorial objFact=new Factorial(n);
        double z=0;

        for (int i = 1; i <= n; i++) {
            objFact.setX(i);
            z+=i/objFact.FactIterativo();
        }
        return z;
    }
}
