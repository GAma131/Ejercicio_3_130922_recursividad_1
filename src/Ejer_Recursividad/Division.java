package Ejer_Recursividad;

import javax.swing.JOptionPane;

import Ejemplo_1.Factorial;

public class Division {
    private int n;
    private double e;
    private Factorial objFact;

    public Division(int n) {
        setN(n);
        objFact= new Factorial(n);
        this.e=1;
    }

    public void setN(int n) {
        this.n = (n>=1)?n:1;
    }

    public int getN() {
        return n;
    }

    public void setE(double e) {
        this.e = e;
    }

    public double getE() {
        return e;
    }


    // METODO ITERATIVO
    public double Calcular() {
        double z = 0;

        for (double i = 1; i <= n; i++) {
            objFact.setX(i);
            z += i / objFact.FactIterativo();
        }
        return z;
    }

    // MODO RECURSIVO
    public double Division_R() {
        return suma(n);
    }

    private double suma(int n) {
        if (n == 1) {
            return 1;
        } else {
            objFact.setX(n);
            e+= n / objFact.FactIterativo();
            suma(n-1);

            return e;
        }
    }
}
