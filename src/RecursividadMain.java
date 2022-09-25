import javax.swing.JOptionPane;

import Ejer_Recursividad.Division;
import Ejer_Recursividad.Imprimir;
import Ejer_Recursividad.MCD;
import Ejer_Recursividad.Numeros;
import Ejer_Recursividad.Suma;
import Ejer_Recursividad.Suma2;

public class RecursividadMain {

  public static void main(String[] args) {
    int opcion = Integer.parseInt(
      JOptionPane.showInputDialog(
        "1) Imprimir 'Hola mundo'" +
        "\n2) Imprimir número (menor a mayor)" +
        "\n3) Calcular Suma (fracciones)" +
        "\n4) Calcular máximo común divisor" +
        "\n5) Calcular división (fracciones con factorial)" +
        "\n6) Suma de números"
      )
    );

    switch (opcion) {
      case 1:
        int opcion1 = Integer.parseInt(
          JOptionPane.showInputDialog(
            "1) Modo Iterativo" + "\n2) Modo Recursivo"
          )
        );

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
        int opcion2 = Integer.parseInt(
          JOptionPane.showInputDialog(
            "1) Modo Iterativo>" + "\n2) Modo Recursivo"
          )
        );

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
        int opcion_ = Integer.parseInt(
          JOptionPane.showInputDialog(
            "1) Modo Iterativo" + "\n2) Modo Recursivo"
          )
        );

        switch (opcion_) {
          case 1:
            Suma obj_ = new Suma(2);
            System.out.println(obj_.calcSuma_I());
            break;
          case 2:
            Suma obj__ = new Suma(2);
            System.out.println(obj__.calcSuma_R());
            break;
          default:
            break;
        }
        break;
      case 4:
        int opcion3 = Integer.parseInt(
          JOptionPane.showInputDialog(
            "1) Modo Iterativo" + "\n2) Modo Recursivo"
          )
        );

        switch (opcion3) {
          case 1:
            MCD obj4 = new MCD(174, 172);
            System.out.println(obj4.calcMCD_I());
            break;
          case 2:
            MCD obj5 = new MCD(174, 172);
            obj5.calcMCD_R();
            break;
          default:
            break;
        }
        break;
      // TODO: llamar clase división
      case 5:
        int opcion4 = Integer.parseInt(
          JOptionPane.showInputDialog(
            "1) Modo Iterativo" + "\n2) Modo Recursivo"
          )
        );

        switch (opcion4) {
          case 1:
            Division obj6 = new Division(5);
            System.out.println(obj6.Calcular());
            break;
          case 2:
            Division obj7 = new Division(5);
            System.out.println(obj7.Division_R());
            break;
          default:
            break;
        }

        break;
      case 6:
        int opcion5 = Integer.parseInt(
          JOptionPane.showInputDialog(
            "1) Modo Iterativo" + "\n2) Modo Recursivo"
          )
        );

        switch (opcion5) {
          case 1:
            Suma2 obj8 = new Suma2(5);
            System.out.println(obj8.suma_I());
            break;
          case 2:
            Suma2 obj9 = new Suma2(5);
            System.out.println(obj9.suma_R());
            break;
          default:
            break;
        }
        break;
      default:
        JOptionPane.showMessageDialog(null, "Opción no disponible");
        break;
    }
  }
}
