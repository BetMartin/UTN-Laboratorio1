/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpmutantes;

/**
 *
 * @author betsa
 */
public class MostrarValores {
//Mostrar la matriz de los datos ingresados
    public static void mostrarValores(String[] secuencias){
        for (int i = 0; i< 6; i++){
            for(int j=0; j<5; j++){  
                System.out.print(secuencias[i].charAt(j)+"  ");
            }
            for(int j=5; j<6; j++){  
                System.out.print(secuencias[i].charAt(j)+"\n");
            }
        }
    }    
}
