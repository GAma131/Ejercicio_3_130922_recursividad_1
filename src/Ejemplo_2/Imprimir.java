package Ejemplo_2;

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

    public String impHola(){
        String imp="";
        for (int i = 0; i < n; i++) {
            imp+="Hola mundo\n";
        }
        return imp;
    }
}
