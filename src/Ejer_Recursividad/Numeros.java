package Ejer_Recursividad;

public class Numeros {
    private int n;

    public Numeros(int n) {
        setN(n);
    }

    public void setN(int n){
        this.n = n<0?1:n;
    }

    public int getN(){
        return n;
    }

    // MODO ITERATIVO
    public String impNumeros_I(){
        String imp="";
        for (int i = 1; i <= n; i++) {
            imp+=i+"\n";
        }
        return imp;
    }

    // MODO RECURSIVO
    public void impNumeros_R(){
        Imp(n);
    }

    private void Imp(int n){
        if (n>0) {
            System.out.println(n);
            Imp(n-1);
        }
    }
}
