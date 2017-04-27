
package ejercicio_2;

import javax.swing.JOptionPane;

public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arr[], tam;
 
        tam = Integer.parseInt(JOptionPane.showInputDialog(null, "De que tamaño desea el arreglo: "));
        arr = new int[tam];
 
        for(int i=0; i<tam; i++){
            arr[i]=(int)(Math.random()*9+0);
            System.out.println("Posición "+i+"--> "+arr[i]);
        }
    }
    
}
