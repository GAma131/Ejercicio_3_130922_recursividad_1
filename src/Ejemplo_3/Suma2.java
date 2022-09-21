package Ejemplo_3;

import Ejemplo_2.Suma;

public class Suma2 {
    private int n;

    public Suma2(int n) {
        setN(n);
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = (n >= 1) ? n : 1;
    }

    // MODO ITERATIVO
    public double suma_I() {
        double result = 0;
        while (n > 0) {
            result += n;
            n--;
        }
        return result;
    }

    // MODO RECURSIVO
    public void suma_R() {
        suma(n);
    }

    private void suma(int n) {
        if (n > 0) {
            n+=n-1;
            suma(n--);
        } else {
            System.out.println("Resultado: " + n);
        }
    }
}
