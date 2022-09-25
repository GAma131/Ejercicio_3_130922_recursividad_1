package Ejer_Recursividad;

import javax.swing.JOptionPane;

public class Imprimir {
    private int n;

    public Imprimir(int n) {
        setN(n);
    }

    public void setN(int n){
        this.n = n<0?1:n;
    }

    public int getN(){
        return n;
    }

    // MODO ITERATIVO
    public String impHola_I(){
        String imp="";
        for (int i = 0; i < n; i++) {
            imp+="Hola mundo\n";
        }
        return imp;
    }

    // MODO RECURSIVO
    public void impHola_R(){
        Imp(n);
    }

    private void Imp(int n){
        if (n>0) {
            System.out.println("Hola mundo");
            Imp(n-1);
        }
    }
}
