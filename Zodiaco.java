import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practica2 {


public static void main(String[] args) throws IOException {


BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Ya tenemos el "lector"

        System.out.println("Por favor ingrese su nombre");//Se pide un dato al usuario

        String nombre= br.readLine();
        
        System.out.println("Da tus apellidos");
        	String apellidos=br.readLine();
        	
        System.out.println("Da tu edad");
        	String entrada=br.readLine();
        	int edad=Integer.parseInt(entrada);
        	
        System.out.println("Da tu numero de control");
        	entrada=br.readLine();
        	int numeroDeControl=Integer.parseInt(entrada);
	
       System.out.println("Da tu fecha de nacimiento [Dia]");
        	String diaString=br.readLine();
        	int dia=Integer.parseInt(diaString);
        	
        System.out.println("Da tu fecha de nacimiento [Mes]");	
        	String mesString=br.readLine();
        	int mes=Integer.parseInt(mesString);
        	
        System.out.println("Da tu fecha de nacimiento [Año]");
        	String añoString=br.readLine();
        	int año=Integer.parseInt(añoString);
        	
        System.out.println( dia + " "+mes+ " "+año);	        	

        
        	
        	

	}

}
