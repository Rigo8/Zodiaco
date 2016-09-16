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

	switch(mes){
        	
        	case 01: 
        		
        		if(dia>=21)
        			zodiaco="Acuario";
        	
        		else
        			zodiaco="Capricornio";
        		
        		break;
        		
        	case 2: 
        		if(dia<=19)
        			zodiaco= "Acuario";
        		
        		else
        			zodiaco= "Pisis";
        		break;
        		
        	case 3:
        		if(dia <=20)
        			zodiaco="Pisis";
        		
        		else
        			zodiaco="Aries";
        		
        		break;
        		
        	case 4:
        		if(dia <=20)
        			zodiaco="Aries";
        		
        		else
        			zodiaco="Tauro";
        		break;
        		
        	case 5:
        		if(dia <= 20)
        			zodiaco="Tauro";
        		
        		else
        			zodiaco="Geminis";
        		break;
        		
        	case 6:
        		if(dia <=20)
        			zodiaco="Geminis";
        		
        		else
        			zodiaco="Cancer";
        		break;
        		
        	case 7:
        		if(dia<=21)
        			zodiaco="Cancer";
        		
        		else
        			zodiaco="Leo";
        		break;
        		
        	case 8:
        		if(dia<=22)
        			zodiaco="Leo";
        		
        		else
        			zodiaco="Virgo";
        		break;
        		
        	case 9:
        		if(dia<=22)
        			zodiaco="Virgo";
        		
        		else
        			zodiaco="Libra";
        		break;
        		
        	case 10:
        		if(dia<=22)
        			zodiaco="Libra";
        		
        		else
        			zodiaco="Escorpio";
        		break;
        	case 11:
        		if(dia<=21)
        			zodiaco="Escorpio";
        		
        		else
        			zodiaco="Sagitario";
        		break;
        	case 12:
        		if(dia<=21)
        			zodiaco="Sagitario";
        		
        		else
        			zodiaco="Capricornio";
        		break;
        		
        		
               	
              	
        
        	
        	}
        	
        System.out.println("Signo Zodiacal "+ zodiaco);    	

        
        	
        	

	}

}
