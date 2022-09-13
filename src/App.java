import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        boolean sentinel = true;
        int n=0;
        Factorial obj= new Factorial(n);

        do {
            n=Integer.parseInt(JOptionPane.showInputDialog("Introduce un valor o -1 para terminar ->"));

            if (n==-1) {
                sentinel=false;
            } else {
                obj.setX(n);
                JOptionPane.showMessageDialog(null, "El factorial interativo es: "+obj.FactIterativo()
                + "\nEl factorial recurisvo es: "+obj.factRecursivo());
            }
        } while (sentinel);
        JOptionPane.showMessageDialog(null, "bye");
    }
}
