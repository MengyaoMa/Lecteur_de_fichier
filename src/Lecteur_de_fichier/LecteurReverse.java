package Lecteur_de_fichier;

import java.io.*;
import java.util.ArrayList;

public class LecteurReverse {
	
	private String MonChemin;
	
	
	public LecteurReverse(String Chemin){
		 MonChemin = Chemin;
	}
	
	public void LectureFichier() throws IOException{
		 FileInputStream in = null ;
		 File f = new File(MonChemin);
		 try {
		 in = new FileInputStream ( f ); // ouverture du fichier
	
		InputStream flux = in;
		InputStreamReader read = new InputStreamReader(flux);
		BufferedReader buff= new BufferedReader(read);
		String line;
		
		ArrayList<String> Tab = new ArrayList<String>();
		

		while ((line = buff.readLine()) != null){
			Tab.add(0,line);

			}
		buff.close();
		
		for(int i=0;i<Tab.size();i++)
		{
			System.out.println(Tab.get(i));
		 }
		
		System.out.println("The name of the file: "+f.getName());
		
		
		 }
		 finally {
		 if (in!= null) {
		 in.close ();
		 }
		 }
		 
	}
	

}
