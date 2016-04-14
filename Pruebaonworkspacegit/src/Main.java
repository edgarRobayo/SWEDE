

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Random;

public class Main {
	
	public static void main(String[] args) throws Exception{
		
		
		BufferedReader entrada = new BufferedReader ( new InputStreamReader(System.in));	
		
		String cadena = (entrada.readLine());
		
		Random aleatorio = new Random();
		System.out.println(aleatorio.nextInt(1000));
		
		System.out.println(Math.random()*100+1);
		System.out.println(Math.random());

	
		
	}


}
