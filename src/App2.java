import javax.swing.JOptionPane;

import Ejemplo_2.Imprimir;
import Ejemplo_2.MCD;
import Ejemplo_2.Numeros;
import Ejemplo_2.NumerosIn;
import Ejemplo_2.Suma;

public class App2 {
    public static void main(String[] args) {
        int opcion= Integer.parseInt(JOptionPane.showInputDialog("1) Imprimir 'Hola mundo'"
            + "\n2) Imprimir número (menor a mayor)"
            + "\n3) Calcular Suma"
            + "\n4) Calcular máximo común divisor"));

        switch (opcion) {
            case 1:
                int opcion1= Integer.parseInt(JOptionPane.showInputDialog("1) Modo Iterativo>"
                + "\n2) Modo Recursivo"));

                switch (opcion1) {
                    case 1:
                        Imprimir obj = new Imprimir(4);
                        System.out.println(obj.impHola_I());
                    break;

                    case 2:
                        Imprimir obj1 = new Imprimir(4);
                        obj1.impHola_R();
                    break;

                    default:
                        break;
                }
            break;

            case 2:
                int opcion2= Integer.parseInt(JOptionPane.showInputDialog("1) Modo Iterativo>"
                + "\n2) Modo Recursivo"));

                switch (opcion2) {
                    case 1:
                        Numeros obj2 = new Numeros(4);
                        System.out.println(obj2.impNumeros_I());
                    break;

                    case 2:
                        Numeros obj3 = new Numeros(4);
                        obj3.impNumeros_R();
                    break;

                    default:
                        break;
                }
            break;

            case 3:
                Suma obj3 = new Suma(4);
                System.out.println(obj3.calcSuma());
            break;

            case 4:
                MCD obj4 = new MCD(4);
                System.out.println(obj3.calcSuma());
            break;

            default:
            JOptionPane.showMessageDialog(null, "Opción no disponible");
                break;
        }
    }
}
