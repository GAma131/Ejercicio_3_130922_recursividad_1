package Ejemplo_2;

public class NumerosIn {
    private int n;

    public NumerosIn(int n) {
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
        int c=n;
        for (int i = 1; i <= n; i++) {
            imp+=c+"\n";
            c--;
        }
        return imp;
    }
}
