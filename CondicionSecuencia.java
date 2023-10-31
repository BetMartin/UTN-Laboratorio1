/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpmutantes;

/**
 *
 * @author betsa
 */
public class CondicionSecuencia {
//Evaluar que el largo de la secuencia sea el correcto
    public static boolean EsLargoCorrecto(String cadenaIngresada){
        boolean largoCorrecto;
        if (cadenaIngresada.length()==6){
            largoCorrecto=true;
        }else{
            largoCorrecto=false;
            System.out.print("La secuencia debe tener un largo de 6 bases nitrogenadas.\nVuelva a ingresar la secuencia.\n");
        }
        return largoCorrecto;
    }
    
    //Evaluar que las bases nitrogenadas ingresadas sean correctas
    public static boolean EsBaseCorrecta (String cadenaIngresada){
        boolean baseCorrecta=true;
        for(int i=0; i<cadenaIngresada.length();i++){
            if (cadenaIngresada.charAt(i)!='A'&&cadenaIngresada.charAt(i)!='a'&&cadenaIngresada.charAt(i)!='T'&&cadenaIngresada.charAt(i)!='t'&&cadenaIngresada.charAt(i)!='C'&&cadenaIngresada.charAt(i)!='c'&&cadenaIngresada.charAt(i)!='G'&&cadenaIngresada.charAt(i)!='g'){
                System.out.print("Recuende que la secuencia puede estar compuesta solo por: A, T , C o G\n Vuelva a ingresar la secuencia.\n ");
                baseCorrecta=false;
                break;
            }
        }
        return baseCorrecta;
    }    
}
