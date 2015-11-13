package boletin9_3;

import javax.swing.JOptionPane;

public class Clase9_3 {
    
    public float poneraltura(){
        return Float.parseFloat(JOptionPane.showInputDialog("Introduzca la altura "));
    }
    public float ponerbase(){
        return Float.parseFloat(JOptionPane.showInputDialog("Introduzca la base "));
    }
    public void calcularArea(){
        float base;
        float altura;
        do {
            base=ponerbase();
            altura=poneraltura();
        }
            while (base<=0||altura<=0);
        
        JOptionPane.showMessageDialog(null, "El area del rectangulo es : " + (base*altura));
        
        
    }
}
