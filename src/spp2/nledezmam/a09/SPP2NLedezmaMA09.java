/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.nledezmam.a09;
import java.util.Scanner;
/**
 *
 * @author normaledezma
 */
public class SPP2NLedezmaMA09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] a,b,r;
        int tamaño;
        tamaño=solicitaEntero("el tamaño del arreglo");
        
        //crear matrices
        a= crearMatriz(" A", tamaño);
        b= crearMatriz(" B", tamaño);
                
        //suma matrices
       SumaMatrices (a,b);
    }
    public static int solicitaEntero(String mensaje){
        Scanner tecl = new Scanner (System.in);
        int varEntera = 0;
        boolean flag;
        
        do{
        System.out.println("Introduzca " + mensaje);
        try{
        varEntera = tecl.nextInt();
        flag=false;
    }catch (Exception ex){
            System.out.println("Introdujo una variable incorrecta ");
            flag=true;
            tecl.nextLine();
    } 
  } while (flag); 
    return varEntera;
    }
    public static int[][]crearMatriz(String nom, int t){
        Scanner tecl = new Scanner (System.in);
        System.out.println("Introduce los elementos de la matriz" + nom);
        int [][]miMatriz = new int [t][t];
        for (int i=0; i<miMatriz.length; i++){
            for (int j= 0; j<miMatriz[i].length; j++){
                miMatriz[i][j]= solicitaEntero("el valor corresponiente");
            }
            
        }
        
    return miMatriz;
    }
    public static void SumaMatrices(int[][]a, int [][]b){
        
        int [][]r = new int[a.length][a.length];
        for (int i=0; i<r.length; i++){
            for (int j= 0; j<r[i].length; j++){
                r[i][j]= a[i][j]+b[i][j];
                // Muestre resultado
                System.out.println("El resultado es: " + r[i][j]);
            }   
        }   
    
    }
    }

