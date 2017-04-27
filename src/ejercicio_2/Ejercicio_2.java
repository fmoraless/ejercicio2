
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
		
		summarArreglo(arr);
    }
	
	public static void summarArreglo(int arr1[]){
		int total = 0;
		for(int i=0; i<arr1.length; i++){
            total+=arr1[i];
        }
		System.out.println("La suma de los elementos del arreglo es: "+total);
	}
    
}
