package Ejemplo_2;

public class Suma {
    private int n;

    public Suma(int n) {
        setN(n);
    }

    public void setN(int n){
        this.n = n<0?1:n;
    }

    public int getN(){
        return n;
    }

    public String calcSuma(){
        String imp="";
        double result=0;

        for (int i = 1; i <= n; i++) {
            imp+=1+"/"+i+" + ";
            result+=1/i;
        }
        return imp+" | Resultado= "+result;
    }
}
