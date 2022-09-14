import javax.swing.JOptionPane;

import Ejemplo_2.Imprimir;
import Ejemplo_2.Numeros;

public class App2 {
    public static void main(String[] args) {
        int opcion= Integer.parseInt(JOptionPane.showInputDialog("1) Imprimir 'Hola mundo'"
            + "\n2) Imprimir número (menor a mayor)"));

        switch (opcion) {
            case 1:
                Imprimir obj = new Imprimir(4);
                System.out.println(obj.impHola());
            break;

            case 2:
                Numeros obj1 = new Numeros(4);
                System.out.println(obj1.impNumeros());
            break;

            default:
                break;
        }
    }
}
