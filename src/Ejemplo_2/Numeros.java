package Ejemplo_2;

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

    public String impNumeros(){
        String imp="";
        for (int i = 1; i <= n; i++) {
            imp+=i+"\n";
        }
        return imp;
    }
}
