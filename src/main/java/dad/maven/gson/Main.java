package dad.maven.gson;

import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			try {
				System.out.println("Introduzca el nombre");
				String s1 = scan.nextLine();
				System.out.println("Introduzca el apellido");
				String s2 = scan.nextLine();
				System.out.println("Introduzca su edad");
				int edad = scan.nextInt();
				
				if( !s1.equals("") && !s2.equals("") && edad > 0 ) {
	
					Persona p = new Persona(s1, s2, edad);
	
					Gson gson = new GsonBuilder().setPrettyPrinting().create();
					String json = gson.toJson(p);
					System.out.println(json);
					
				} else {
					System.err.println("Error al introducir los datos");
				}
				
			} catch(RuntimeException e) {
				System.err.println("Error al introducir los datos");
			} finally {
				scan.close();
			}
		}

}
