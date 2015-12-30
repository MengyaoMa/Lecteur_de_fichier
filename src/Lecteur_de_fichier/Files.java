package Lecteur_de_fichier;

import java.io.*;

public class Files {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		LecteurFichier lf = new LecteurFichier("test.txt");
		lf.LecturFichier();
		
		LecteurReverse lr = new LecteurReverse("test.txt");
		lr.LectureFichier();

	}

}
