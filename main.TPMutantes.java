/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tpmutantes;

import java.util.Scanner;

/**
 *
 * @author betsa
 */
public class TPMutantes {

    public static void main(String[] args) {
        
        //Solicitar el ingreso de la secuencia de adn 
        Scanner sc= new Scanner(System.in);
        String[] adnFila = new String[6];
        
        System.out.print("A continuación ingrese 6 secuencias de 6 bases nitrogenadas (A,T,C o G).\n");
        
        for(int i = 0; i < 6; i++){
            boolean baseNitrogenadaCorrecta=false;
            do{
                System.out.println("Secuencia de base nitrogenada "+(i+1)+": ");
                adnFila[i] = sc.nextLine();
                
               //Evaluar si los datos ingresados son correctos
                if (CondicionSecuencia.EsLargoCorrecto(adnFila[i])==true && CondicionSecuencia.EsBaseCorrecta(adnFila[i])==true){
                    baseNitrogenadaCorrecta=true;
                }
            }while(baseNitrogenadaCorrecta==false);      
        }
        
        //Mostrar secuencia ingresada 
        System.out.print("La secuencia ingresada:\n");
        MostrarValores.mostrarValores(adnFila);
        
        //Evaluar si es mutante y mostrar resultado
        if(esMutantante.esMutante(adnFila)==true){
            System.out.print("ES MUTANTE");
        }else{
            System.out.print("NO ES MUTANTE");
        }
    }
}
