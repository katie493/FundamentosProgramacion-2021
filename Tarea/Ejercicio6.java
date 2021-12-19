import java.util.Scanner;

public class Ejercicio6 {
    static Scanner sc = new Scanner(System.in);
    public static void problema6(){
        int a=0;
        Object matriZ_06[][] = new Object[5][5];
    
        for (int x=0; x < matriZ_06.length; x++){
            for (int m = 0; m <= x; m++) {
                matriZ_06[x][m]=a;
                a++;
                
            }
            
        }
        System.out.println("El resultado del ejercicio 6 es:\n");
        imprimirMatriz(matriZ_06);   
    }

    public static void problema9(){
        Object matriZ_09 [][] =new Object[5][5];
    
        int a = 0;
    
        for (int x = 0; x < matriZ_09.length; x++) {
            for (int m = ((matriZ_09[0].length)-1)-x; m <=(matriZ_09[0].length)-1 ; m++) {
                matriZ_09[x][m]=a;
                a++;
                
            }
            
        }
        System.out.println("El resultado del ejercicio 9 es:\n");
        imprimirMatriz(matriZ_09);
    
    
    
    }

    public static void problema11(){
        Object matriZ_11 [][] = new Object[5][5];
        int a=0;
    
        for (int x = 0; x < matriZ_11.length; x++){
            for (int m = ((matriZ_11[0].length)-1)-x; m >=0 ; m--){
                matriZ_11[x][m]=a;
                a++;
                
            }
            
        }
        System.out.println("El resultado del ejercicio 11 es:\n");
        imprimirMatriz(matriZ_11);
    
    }
    public static void problema12(){
        Object matriZ_12 [][] =new Object[5][5];
    
        int a = 0;
    
        for (int x = 0; x < matriZ_12.length; x++) {
            for (int m = (matriZ_12[0].length)-1; m >= x ; m--) {
                matriZ_12[x][m]=a;
                a++;
                
            }
            
        }
        System.out.println("El resultado del ejercicio 12 es:\n");
        imprimirMatriz(matriZ_12);
    
    }
    public static void problema13(){
        Object matriZ_13 [][] =new Object[5][5];
        int a =0;
    
        for (int x = 0; x < matriZ_13[0].length; x++){
            for (int m = 0; m < (matriZ_13.length)-x; m++){
                matriZ_13[m][x]=a;
                a++;
                
            }
                
            
        }
        System.out.println("El resultado del ejercicio 13 es:\n");
        imprimirMatriz(matriZ_13);
        
    }
    public static void imprimirMatriz(Object[][] matriz) {
        for (int x = 0; x < matriz.length; x++) {
            for (int m = 0; m < matriz[0].length; m++) {
               if(matriz[x][m]!=null){
                System.out.print("|"+matriz[x][m]+"|"+"\t");
                
               }else{
                System.out.print("\t");
               }                               
            }
            System.out.println("");
        }
        
    }
    public static void tarea(){        
        int opcionZ=0;
        System.out.println("-----------------------Ejercicios de matrices--------------------");
        System.out.println("\nEliga una Opcion"+ 
        "\n1=Mostrar problema6"+
        "\n2=Mostrar problema9"+
        "\n3=Mostrar problema11"+
        "\n4=Mostrar problema12"+
        "\n5=Mostrar problema13"+
        "\n");
        opcionZ = sc.nextInt();  
        
        while(opcionZ!=0){
            switch(opcionZ) {

              case 1:problema6();break;

              case 2:problema9();;break;
              
              case 3:problema9();;break;

              case 4:problema12();;break;
              
              case 5:problema13();;break;

              case 6:;break;
              
              case 7:;break;
              default: System.out.println("La opcion ingresada no existe!");
            }   
          System.out.println("##############################################");         
          System.out.println("-----------------------Ejercicios de matrices--------------------");
        System.out.println("\nEliga una Opcion"+ 
        "\n1=Mostrar problema6"+
        "\n2=Mostrar problema9"+
        "\n3=Mostrar problema11"+
        "\n4=Mostrar problema12"+
        "\n5=Mostrar problema13"+
        "\n");
        opcionZ = sc.nextInt();    
        }        
    }
    
    public static void main(String [] args){
        tarea();
    }
    
}