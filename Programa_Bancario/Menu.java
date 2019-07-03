	/*
 	* FECHA MIERCOLES 3 DE JULIO DEL 2019
 	*  INSTITUTO TECNOLÒICO SUPERIOR RUMIÑAHUI 
 	* NOMBRE : BRYAN GONZALEZ 
 	* NOMBRE DE PROGRAMA : PROGRAMA BANCARIO
 	* MATERIA : PROGRAMACION VISUAL
 	* NIVEL : CUARTO DE SISTEMAS NOCTURNO
 	*/


	import java.util.Scanner;




	public class Menu {
    	public void menu(){
        int op=0;
        float monto=0;
        Scanner entrada = new Scanner(System.in);
        Banco obj2=new Banco(200);
        do{
            System.out.println("1.- Deposito");
             System.out.println("2.- retiro");
              System.out.println("3.- saldo");
              System.out.println("4.- salir");
              System.out.println("ingrese opcion :");
              op=entrada.nextInt();
              
              if(op==1){
                  System.out.println("\n\nIngrese el monto: ");
                  monto=entrada.nextFloat();
                  obj2.calcular(monto, op); 
              }
               if(op==2){
                  System.out.println("\n\nIngrese el monto: ");
                  monto=entrada.nextFloat();
                  obj2.calcular(monto, op); 
              }
              if(op==3){
                  System.out.println("el saldo es "+obj2.getSaldo()); 
              }
              
        	}while(op!=4);
    		}

	    
		}
