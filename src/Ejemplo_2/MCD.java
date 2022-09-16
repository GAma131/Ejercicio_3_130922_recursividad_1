package Ejemplo_2;

public class MCD {
    private int n;
    private int x;

    public MCD(int n, int x) {
        setN(n);
        setX(x);
    }

    public void setN(int n){
        this.n = n<0?1:n;
    }

    public void setX(int x){
        this.x = x<0?1:x;
    }

    public int getN(){
        return n;
    }

    public int getX(){
        return x;
    }

    // METODO ITERATIVO
    public String calcMCD_I(){
        int residuo=1;
        int cociente=0;

        while (residuo > 0) {
            cociente= n/x;
            residuo= n%x;
            n=x;
            x=residuo;
        }

        return "residuo: "+residuo+" | cociente: "+cociente+" | MCD: "+n;
    }

    // METODO RECURSIVO
}
