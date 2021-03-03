/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

/**
 *
 * @author Vinni
 */
public class Matriz {

    public static void main(String[] args) {
        //int arr1[] = {12000, 7000, 3000, 0};
        int arr1[] = {4625, 1625, 125, 0};

        int arr0[] = {0, 0, 0, 6375};
        int arrS[] = new int[16];
        
        int matriz[][] = new int[4][4];
        int fila =0;
        for (int i = arr1.length - 1; i > 0; i--) {
            int miplata = arr0[i];
            System.out.println("tengo " + miplata);
            for (int j = 0; j < arr1.length; j++) {
                System.out.println("i" + i + "j" + j);
                
                    miplata = miplata - arr1[j];

                    if (miplata >= 0) {
                        System.out.println("pague " + arr1[j]);
                        arrS[fila++]=arr1[j];
                        arr1[j] = 0;
                    } else {
                        System.out.println("pague " + (miplata * -1));
                       arrS[fila++]=(miplata * -1);
                        arr1[j] = arr1[j] + miplata;
                        miplata = 0;
                    }
                
            }
           

        }
        fila = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i != j ){
                 matriz[i][j] = arrS[fila++];   
                }else{
                    matriz[i][j] = -1;
                }
            }
            
        }
        for (int i = 0; i < arrS.length; i++) {
            System.out.println(arrS[i]);
            
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                
                    System.out.print(matriz[i][j]+" \t");   
                
            }
            System.out.println("");
            
        }
        
    }

}
