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

    // * Imprimir Hola mundo
    public String impHolaM(){
        String imp="";
        while (n>0) {
            imp+="Hola mundo\n";
        }
        return imp;
    }

    @Override
    public String toString() {
        return "Veces a imprimir 'Hola mundo'"+n+"\n";
    }
}
