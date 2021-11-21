package pe.edu.upeu.keac.examen;

import pe.edu.upeu.keac.utils.LeerTeclado;
import java.util.Scanner;

public class ResolucionExamen{

 LeerTeclado lp1 = new LeerTeclado();
  Scanner jdk = new Scanner();

  //Pregunta02 - impuesto de autos

  public Static void main(String []args) {
    int n, clave;
    float precio, impuesto, categoria1, categoria2, categoria3, total;
    total = 0;
    categoria1 = 0;
    categoria2 = 0;
    categoria3 = 0;
   
    n =objTec.leer(0,"ingresar la cantidad de autos" );
    while (n>0){
        
        precio =objTec.leer(0, "ingresa el precio del auto: "+n);
        
        clave =objTec.leer(0, "ingresa la clave del auto: ");
        if (clave > 0 && clave<4){
            if (clave ==1){
                impuesto = precio * 0.10f; 
                categoria1 = categoria1 + impuesto;
                total = total + impuesto;
            System.out.println("el impuesto a pagar por el auto: "+n+" es s/: "+impuesto);
            }
            if (clave ==2){
                impuesto = precio * 0.07f; 
                categoria2 = categoria2 + impuesto;
                total = total + impuesto;
            System.out.println("el impuesto a pagar por el auto: "+n+" es s/: "+impuesto);
            }
            if (clave ==3){
                impuesto = precio * 0.05f; 
                categoria3 = categoria3 + impuesto;
                total = total + impuesto;
            System.out.println("el impuesto a pagar por el auto: "+n+" es s/: "+impuesto);
            }
//total = total + impuesto;
//System.out.println("el impuesto a pagar por el auto: "+n+" es s/: "+impuesto);
        }
        else
            System.out.println("ingrese la clave correcta");
    
        }
        System.out.println("el impuesto por la categoria 1 es s/: "+categoria1);
        System.out.println("el impuesto por la categoria 2 es s/: "+categoria2);
        System.out.println("el impuesto por la categoria 3 es s/: "+categoria3);
        System.out.println("el impuesto total por todos los autos es s/: "+total);     
    }
  
  //Pregunta03 - multiplicacion hasta 20

    public static void main(String[]args){

        for (int i = 1; i <= 20; i++) {
            
            for (int j = 1; j <= 20; j++) {
                
                System.out.println(i+" x " +j+ "=" +(i*j) );
                
            }
        }

    }
    
  //Pregunta04 - numeros perfectos

  public static void main(String [] args) {
        int i, j, suma;
        System.out.println("Números perfectos entre 1 y 1000: ");
        for(i=1;i <= 1000;i++){      // i es el número que vamos a comprobar
            suma = 0;
            for(j = 1;j < i;j++){    // j son los divisores. Se divide desde 1 hasta i-1                          
                    if(i % j==0){
                    suma = suma + j; // si es divisor se suma
                    }
            }
            if(i == suma){             // si el numero es igual a la suma de sus divisores es perfecto              
                System.out.println(i);
            }
        }
    }

  //Pregunta05 - potencia

  public static void main(String [] args) {
    int b
    int e 
        if (e==1) {
            return b;
        } if (e==0) {
            return 1;
        } else{
            return b * potencia(b, e-1);
        }
                  }
    
    
} 
    
    