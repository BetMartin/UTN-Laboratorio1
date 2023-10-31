/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpmutantes;

/**
 *
 * @author betsa
 */
public class esMutantante {
//Método para evaluar si es mutante
    public static boolean esMutante(String[]adnFila){
        boolean mutante=false;
        int cantidaSecuencias=esMutanteHorizontal(adnFila);
        if(cantidaSecuencias>1){
            mutante=true;
        }else{
            cantidaSecuencias=cantidaSecuencias+esMutanteVertical(adnFila);
            if(cantidaSecuencias>1){
                mutante=true;
            }else{
                cantidaSecuencias=cantidaSecuencias+esMutanteDiagonalIzqAbaj(adnFila);
                if(cantidaSecuencias>1){
                    mutante=true;
                }else{
                    cantidaSecuencias=cantidaSecuencias+esMutanteDiagonalDerArrib(adnFila);
                    if(cantidaSecuencias>1){
                        mutante=true;    
                    }    
                }
            }   
        }
        return mutante;
        
    }    

    
    //Analizar secuencia de modo Horizontal
    public static int esMutanteHorizontal(String[] secuencia){
        int CantidadSecuencias=0;
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 3; j++){
                boolean existenConsecutivos=true;
                char CharParaComparar = secuencia[i].charAt(j);
                for(int k = 1; k<4;k++){
                    if(CharParaComparar != secuencia[i].charAt(j+k)){
                        existenConsecutivos = false;        
                        break;
                    }
                }
                if(existenConsecutivos==true){
                    CantidadSecuencias++; 
                    break;
                }
            }
        }
        return CantidadSecuencias;
    }
//Analizar secuencia de modo Vertical
    public static int esMutanteVertical(String[] secuencia){
        int mutante=0;
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 3; j++){
                boolean existenConsecutivos=true;
                char CharParaComparar = secuencia[j].charAt(i);
                for(int k = 1; k<4;k++){
                    if(CharParaComparar != secuencia[j+k].charAt(i)){
                        existenConsecutivos = false;
                        break;
                    }
                }
                if(existenConsecutivos==true){
                    mutante++;
                    break;
                }
            }
        }
        return mutante;
    }

//Analizar secuencia de modo diagona con dirección izquierda y abajo
    public static int esMutanteDiagonalIzqAbaj(String[] secuencia){
        int mutante=0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                boolean existenConsecutivos=true;
                char CharParaComparar = secuencia[j].charAt(i);
                for(int k = 1; k<4;k++){
                    if(CharParaComparar != secuencia[j+k].charAt(i+k)){
                        existenConsecutivos = false;
                        break;
                    }
                }
                if(existenConsecutivos==true){
                    mutante++;
                    break;
                }
            }
        }
        return mutante;
    }
//Analizar secuencia de modo diagona con dirección derecha y arriba
    public static int esMutanteDiagonalDerArrib(String[] secuencia){
        int mutante=0;
        for(int i = 0; i < 3; i++){
            for(int j = 3; j < 6; j++){
                boolean existenConsecutivos=true;
                char CharParaComparar = secuencia[j].charAt(i);
                for(int k = 1; k<4;k++){
                    if(CharParaComparar != secuencia[j-k].charAt(i+k)){
                        existenConsecutivos = false;
                        break;
                    }
                }
                if(existenConsecutivos==true){
                    mutante++;
                    break;
                }
            }
        }
        return mutante;
    }         
}
