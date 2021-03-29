package Guia4;

import java.util.Scanner;

public class Caso5 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] arrCodigo = {"400-A", "500-B" , "600-C", "700-D"};
		String[] arrNombre = {"Cesar Lopez", "Julio Martinez", "Diana Salazar","Jose Sanchez"};
		int[] arrSaldo = {1500, 2000, 9000, 5000};
		int[] arrContraseña = {123, 245, 678, 998};
		
		System.out.println("Búsqueda de datos");
		System.out.println("------------------");
		System.out.println("Ingrese código: ");
		String codigo = sc.nextLine();
		System.out.println("Ingrese contraseña: ");
		int contra= sc.nextInt();
		
		int contraseña2 = -1;
		
		int p = -1;
        
        for (int x=0; x< arrCodigo.length; x++) {
        	if (codigo.equals(arrCodigo[x])) {
        	    p = x;
        	    break;
        	   
        	}
        	
        }
            
        for (int z=0; z< arrContraseña.length; z++ ) {
        	if (contra == (arrContraseña[z])) {
        		contraseña2=z;
        		break;
        	}
        }
        
        if (p==-1) {
        	System.out.println("-------------------");
        	System.out.println("Código no encontrado");
        	System.out.println("-------------------");
        }	
        
        else {
        	System.out.println("--------------------");
        	System.out.println("Código registrado");
        	System.out.println("--------------------");
        	System.out.println("Código....: " + arrCodigo[p]);
        	
        	if (contraseña2==-1) {
            	System.out.println("Contraseña incorrecta ");
            	}
        	if (p==0 && contraseña2==1) {
                System.out.println("Contraseña incorrecta ");
               }
            if (p==0 && contraseña2==2) {
            	System.out.println("Contraseña incorrecta ");
            	}
            if (p==0 && contraseña2==3 ) {
            	System.out.println("Contraseña incorrecta ");
            	}
        	if (p==0 && contraseña2==0  ) {
            	System.out.println("Contraseña correcta ");
            	System.out.println("Bienvenido...: " + arrNombre[p]);
            	System.out.println("Presione 1 para consultar saldo:");
            	System.out.println("Presione 2 para depositar:");
            	System.out.println("Presione 3 para transferir saldo:");
            	System.out.println("Presione 4 para retirar saldo:");
            	int u1= sc.nextInt();
            	
            	if (u1==1) {
            		System.out.println("Su saldo es de: " + arrSaldo[p]);
            	}
            	
            	if (u1==2) {
            		System.out.println("Seleccione el monto: ");
            		int s1 = sc.nextInt();
            		
            		if (arrSaldo[p]>=s1 && arrSaldo[p]>0) {
            			System.out.println("Finalizado");
            		}            		
            		else {
            			System.out.println("Saldo no válido");
            		}
            	
            		}
            	if (u1==3)	{
            		System.out.println("Seleccione el monto: ");
            		int s1 = sc.nextInt();
            		
            		if (arrSaldo[p]>=s1 && arrSaldo[p]>0) {
            			System.out.println("Finalizado");
            		}            		
            		else {
            			System.out.println("Saldo no válido");
            		}
            		
            	}
            	if (u1==4) {
            		System.out.println("Seleccione el monto: ");
            		int s1 = sc.nextInt();
            		
            		if (arrSaldo[p]>=s1 && arrSaldo[p]>0) {
            			System.out.println("Finalizado");
            		}            		
            		else {
            			System.out.println("No hay saldo suficiente");
            		}
            	}
        	}
        	
        	if (p==1 && contraseña2==0  ) {
            	System.out.println("Contraseña incorrecta ");
        	}
            
        	if (p==1 && contraseña2==1  ) {
            	System.out.println("Contraseña correcta ");
            	System.out.println("Bienvenido...: " + arrNombre[p]);
            	System.out.println("Presione 1 para consultar saldo:");
            	System.out.println("Presione 2 para depositar:");
            	System.out.println("Presione 3 para transferir saldo:");
            	System.out.println("Presione 4 para retirar saldo:");
            	int u1= sc.nextInt();
            	
            	if (u1==1) {
            		System.out.println("Su saldo es de: " + arrSaldo[p]);
            	}
            	
            	if (u1==2) {
            		System.out.println("Seleccione el monto: ");
            		int s1 = sc.nextInt();
            		
            		if (arrSaldo[p]>=s1 && arrSaldo[p]>0) {
            			System.out.println("Finalizado");
            		}            		
            		else {
            			System.out.println("Saldo no válido");
            		}
            	
            		}
            	if (u1==3)	{
            		System.out.println("Seleccione el monto: ");
            		int s1 = sc.nextInt();
            		
            		if (arrSaldo[p]>=s1 && arrSaldo[p]>0) {
            			System.out.println("Finalizado");
            		}            		
            		else {
            			System.out.println("Saldo no válido");
            		}
            		
            	}
            	if (u1==4) {
            		System.out.println("Seleccione el monto: ");
            		int s1 = sc.nextInt();
            		
            		if (arrSaldo[p]>=s1 && arrSaldo[p]>0) {
            			System.out.println("Finalizado");
            		}            		
            		else {
            			System.out.println("No hay saldo suficiente");
            		}
            	}
            	
        	}
        	
        	if (p==1 && contraseña2==2) {
            	System.out.println("Contraseña incorrecta ");
        	}
        	
        	if (p==1 && contraseña2==3 ) {
            	System.out.println("Contraseña incorrecta ");
            	}
        	if (p==2 && contraseña2==0 ) {
            	System.out.println("Contraseña incorrecta ");
            	}
        	
        	if (p==2 && contraseña2==1 ) {
            	System.out.println("Contraseña incorrecta ");
            	}
        	if (p==2 && contraseña2==2  ) {
            	System.out.println("Contraseña correcta ");
            	System.out.println("Bienvenido...: " + arrNombre[p]);
            	System.out.println("Presione 1 para consultar saldo:");
            	System.out.println("Presione 2 para depositar:");
            	System.out.println("Presione 3 para transferir saldo:");
            	System.out.println("Presione 4 para retirar saldo:");
            	int u1= sc.nextInt();
            	
            	if (u1==1) {
            		System.out.println("Su saldo es de: " + arrSaldo[p]);
            	}
            	
            	if (u1==2) {
            		System.out.println("Seleccione el monto: ");
            		int s1 = sc.nextInt();
            		
            		if (arrSaldo[p]>=s1 && arrSaldo[p]>0) {
            			System.out.println("Finalizado");
            		}            		
            		else {
            			System.out.println("Saldo no válido");
            		}
            	
            		}
            	if (u1==3)	{
            		System.out.println("Seleccione el monto: ");
            		int s1 = sc.nextInt();
            		
            		if (arrSaldo[p]>=s1 && arrSaldo[p]>0) {
            			System.out.println("Finalizado");
            		}            		
            		else {
            			System.out.println("Saldo no válido");
            		}
            		
            	}
            	if (u1==4) {
            		System.out.println("Seleccione el monto: ");
            		int s1 = sc.nextInt();
            		
            		if (arrSaldo[p]>=s1 && arrSaldo[p]>0) {
            			System.out.println("Finalizado");
            		}            		
            		else {
            			System.out.println("No hay saldo suficiente");
            		}
            	}
        	    }
        	
        	if (p==2 && contraseña2==3) {
            	System.out.println("Contraseña incorrecta "); }
        	
        	if (p==3 && contraseña2==0 ) {
            	System.out.println("Contraseña incorrecta "); }
        	
        	if (p==3 && contraseña2==1 ) {
            	System.out.println("Contraseña incorrecta ");}
        	
        	if (p==3 && contraseña2==2 ) {
            	System.out.println("Contraseña incorrecta "); }
        	
        	if (p==3 && contraseña2==3 ) {
            	System.out.println("Contraseña correcta ");
            	System.out.println("Bienvenido...: " + arrNombre[p]);
            	System.out.println("Presione 1 para consultar saldo:");
            	System.out.println("Presione 2 para depositar:");
            	System.out.println("Presione 3 para transferir saldo:");
            	System.out.println("Presione 4 para retirar saldo:");
            	int u1= sc.nextInt();
            	
            	if (u1==1) {
            		System.out.println("Su saldo es de: " + arrSaldo[p]);
            	}
            	
            	if (u1==2) {
            		System.out.println("Seleccione el monto: ");
            		int s1 = sc.nextInt();
            		
            		if (arrSaldo[p]>=s1 && arrSaldo[p]>0) {
            			System.out.println("Finalizado");
            		}            		
            		else {
            			System.out.println("Saldo no válido");
            		}
            	
            		}
            	if (u1==3)	{
            		System.out.println("Seleccione el monto: ");
            		int s1 = sc.nextInt();
            		
            		if (arrSaldo[p]>=s1 && arrSaldo[p]>0) {
            			System.out.println("Finalizado");
            		}            		
            		else {
            			System.out.println("Saldo no válido");
            		}
            		
            	}
            	if (u1==4) {
            		System.out.println("Seleccione el monto: ");
            		int s1 = sc.nextInt();
            		
            		if (arrSaldo[p]>=s1 && arrSaldo[p]>0) {
            			System.out.println("Finalizado");
            		}            		
            		else {
            			System.out.println("No hay saldo suficiente");
            		}
            	}
        	    }
        	
        	
        	
            	
            	
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        	
        }
	}

        	