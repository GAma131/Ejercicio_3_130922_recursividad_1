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
                Imprimir obj = new Imprimir(4);
                obj.impHola_R();
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
