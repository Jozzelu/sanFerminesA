/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanferminesa;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Jozzelu
 */
public class SanFerminesA {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws FileNotFoundException {
        // TODO code application logic here
        File archivo = new File("src/SanFerminesA/newfile");
        Scanner entrada = new Scanner(archivo);
        int numToros=0;
        int velocidad=0;
        int velocidadMaxima=0;
        String lineaArchivo="";
        Scanner lineaToros;
        
        while (entrada.hasNext()){
            
            numToros=entrada.nextInt();
            velocidadMaxima=0;
            for (int i=1;i<=numToros;i++){
                velocidad=entrada.nextInt();
                
                if (velocidad > velocidadMaxima){
                    velocidadMaxima=velocidad;
                }
            }
            System.out.println(velocidadMaxima);
        }
        
    }
}
