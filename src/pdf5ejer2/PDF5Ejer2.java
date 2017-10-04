package pdf5ejer2;

import java.util.Scanner;

/**
 *
 * @author Gonzalo
 */
public class PDF5Ejer2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);        
        String cadena="";  
        System.out.print("Introduce la palabra : ");  
        cadena = sc.next();
        char []invertir=cadena.toCharArray();
        int cont;
        System.out.print(cadena);
        for(cont=cadena.length()-2;cont>=0;cont--){            
            System.out.print(invertir[cont]);
        }
         
    }
    
}
