package Lecteur_de_fichier;

import java.io.*;

public class LecteurFichier {
	private String MonChemin;
	public LecteurFichier(String Chemin){
		 MonChemin = Chemin;
	}
	
	public void LecturFichier() throws IOException{
		 FileInputStream in = null ;
		 File f = new File(MonChemin);
		 try {
		 in = new FileInputStream ( f ); // ouverture du fichier
	
		InputStream flux = in;
		InputStreamReader read = new InputStreamReader(flux);
		BufferedReader buff= new BufferedReader(read);

		String line;

		while ((line = buff.readLine()) != null){
		      System.out.println(line);

		}
		buff.close();
		 // OPERATIONS DE LECTURE
		 System.out.println("The name of the file : "+f.getName());
		 }
		 
		 finally {
		 if ( in != null ) {
		 in.close ();
		 }
		 }
	}
	
	
	

}
