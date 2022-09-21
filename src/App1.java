
import javax.swing.JOptionPane;

import Ejemplo_1.Factorial;
import Ejemplo_1.Fibonacci;

public class App1 {
    public static void main(String[] args) {
        Factorial obj1;
        double factI, factR;
        String cadena;

        int n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de n: "));
        obj1 = new Factorial(n);

        factI = obj1.FactIterativo();
        factR = obj1.factRecursivo();

        cadena = obj1.toString() + "\nEl Resultafo del Factorial Interativo es: "
                + factI + "\n El resultado del Factorial rescurrsivo es: " + factR;

        JOptionPane.showMessageDialog(null, cadena);
    }

    // public static void main1(){
    // boolean sentinel = true;
    // int n=0;
    // Factorial obj= new Factorial(n);

    // do {
    // n=Integer.parseInt(JOptionPane.showInputDialog("Introduce un valor o -1 para
    // terminar ->"));

    // if (n==-1) {
    // sentinel=false;
    // } else {
    // obj.setX(n);
    // JOptionPane.showMessageDialog(null, "El factorial interativo es:
    // "+obj.FactIterativo()
    // + "\nEl factorial recurisvo es: "+obj.factRecursivo());
    // }
    // } while (sentinel);
    // JOptionPane.showMessageDialog(null, "bye");
    // }
}
