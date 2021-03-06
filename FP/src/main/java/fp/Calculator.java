package fp;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class Calculator {


	/*
     * este metodo devuelve el Class del object que le pasamos
     */
	public static Class classTypeOf(Object x) {
		return x.getClass();
	}


	/*
     * devuelve una lista con los n números de la serie de fibonacci.
     */
	public static List<Integer> fibonacci(int n) {
		List<Integer> fibo= new ArrayList<Integer>(); 	
		
		int n1 = 0;
        int n2 = 1;
        int aux;
        for(int i=0; i<n; i++) {
    	   aux = n1;
           n1 = n2;
           n2 = aux + n1;
             
           fibo.add(n1);
	    }
			return fibo;
	       
	    
	}

	/*
	 * Escribir todos los números del number al 0 de step en step.
	 */
	public static int[] stepThisNumber(int numero, int pasos) {
		if(pasos==0){
			int resultado[]={0};
			return resultado;
		}else{
			int numeros[];
						
		if(numero%pasos==0){
			numeros=new int [(numero)/pasos-1];
		}
		else{
			numeros=new int [(numero)/pasos];
		}
			
			
		int i=numero,j=0;
		while((i-pasos)>(0)){
			i-=pasos;
			numeros[j]=i;
			j++;
		}
		return numeros;
		}
	}

	/*
	 * Módulo al que se le pasa un número entero del 0 al 20 y devuelve los
	 * divisores que tiene.
	 */
	public static int[] divisors(int n) {
		if(n==0){
			return null;
		}else{
		int dividendo[]=new int[n];
		int j=0;
						
		for(int i=n;i>0;i--)
			if(n%i==0){
			dividendo[j]=i;
			j++;
		}
		int divisor[]=new int [j];
			for(int i=0;i<j;i++){
				divisor[i]=dividendo[i];
			}
						
		return divisor;
		}
	}

	/*
	 * Toma como parámetros una cadena de caracteres y devuelve cierto si la cadena resulta ser un palíndromo
	 */
	public static boolean checkIsPalindrome(String cadena) {
		if(cadena==null)
			return false;
		else{
		String letrasEspeciales = "áàäéèëíìïóòöúùuñÁÀÄÉÈËÍÌÏÓÒÖÚÙÜÑçÇ:;-_,.?¿¡!·";
		String ascii = "aaaeeeiiiooouuunAAAEEEIIIOOOUUUNcC           ";
		String derecho = cadena.toLowerCase();
		String inverso="";
					    
			for (int i=0; i<letrasEspeciales.length(); i++) {
				derecho = derecho.replace(letrasEspeciales.charAt(i), ascii.charAt(i));
			}
			derecho=derecho.replace(" ", "");
					    
			for(int i=derecho.length()-1;i>=0;i--)
				inverso+=derecho.charAt(i);
					    
			if(derecho.equals(inverso))
				return true;
			else
				return false;
		}
	}

	/*
	 * Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56
	 * mostrar: cincuenta y seis
	 */
	public static String speakToMe(int n) {
		throw  new NotImplementedException();
	}


	/*
	 * este metodo devuelve cierto si el año de la fecha es bisiesto fecha
	 * dd-MM-yyyy
	 */
	public static boolean isLeapYear(String fecha) {
		int año;
		if(fecha.isEmpty())
			return false;
		else {
			año=Integer.parseInt(fecha.substring(6));
					
			if(año%4==0){
				if(año%100!=0)
					return true;
			else
			if(año%400==0)
				return true;
			else 
				return false;
		}else
			return false;
		}
	}

	/*
	 * este metodo devuelve cierto si la fecha es válida
	 */
	public static boolean isValidDate(String date) {
		if (date.length() != 10)
			return false;
		else {
		Integer dia, mes, año;
		dia = Integer.parseInt(date.substring(0, 2));
		mes = Integer.parseInt(date.substring(3, 5));
		año = Integer.parseInt(date.substring(6));
			
		if (año != null && mes <= 12 && mes > 0 && dia > 0 && año > 0) {
			if ((mes == 4 || mes == 6 || mes == 7 || mes == 9 || mes == 11) && dia <= 30) {
				return true;
		} else {
			if ((mes == 2 && isLeapYear(date) && dia <= 29) || (mes == 2 && !(isLeapYear(date)) && dia <= 28)) {
				return true;
			} else {
				if ((mes != 2) && dia <= 31)
					return true;
				else
					return false;
			}
		}
		} else
			return false;
		}
	}
}
