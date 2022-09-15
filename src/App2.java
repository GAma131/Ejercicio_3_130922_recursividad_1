import javax.swing.JOptionPane;

import Ejemplo_2.Imprimir;
import Ejemplo_2.Numeros;
import Ejemplo_2.NumerosIn;
import Ejemplo_2.Suma;

public class App2 {
    public static void main(String[] args) {
        int opcion= Integer.parseInt(JOptionPane.showInputDialog("1) Imprimir 'Hola mundo'"
            + "\n2) Imprimir número (menor a mayor)"
            + "\n3) Imprimir número (mayor a menor)"
            + "\n4) Calcular suma ??"));

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
                Numeros obj1 = new Numeros(4);
                System.out.println(obj1.impNumeros());
            break;

            case 3:
                NumerosIn obj2 = new NumerosIn(4);
                System.out.println(obj2.impNumeros());
            break;

            case 4:
                Suma obj3 = new Suma(4);
                System.out.println(obj3.calcSuma());
            break;

            default:
            JOptionPane.showMessageDialog(null, "Opción no disponible");
                break;
        }
    }
}
