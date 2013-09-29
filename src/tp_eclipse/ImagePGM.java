package tp_eclipse;
import java.io.*;
import java.util.Scanner;


public class ImagePGM {
	

private	int largeur;
private int hauteur;
private int maxNiveauGris;
private int pixels[][];


/**
 * Constructeur par defaut de la classe ImagePGM
 * 
 *Initialise une image vide.
 */
public ImagePGM(){
	this.largeur=0;
	this.hauteur=0;
	this.maxNiveauGris = 0;
	this.pixels = new int[0][0];
}

/**
 * Constructeur d'initialisation à partir d'un fichier image PGM source
 * @param nomFichier
 */
public ImagePGM(String nomFichier){

	File f = new File(nomFichier);
	Scanner sc;
	
	try {
		sc = new Scanner(f);

	
	
	String a = sc.nextLine();
	
	a = sc.nextLine();
	
	
	this.largeur = sc.nextInt();
	this.hauteur = sc.nextInt();
	
	
	a = sc.nextLine();
	
	this.maxNiveauGris = sc.nextInt();
	
	a = sc.nextLine();
	
	this.pixels = new int[this.hauteur][this.largeur];
	
	for (int i = 0; i < this.hauteur; i++) {
		for (int j = 0; j < this.largeur; j++) {
			this.pixels[i][j] = sc.nextInt();
		}
		
		a = sc.nextLine();
	}
	
	sc.close();
	
	} 
	
	catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println("File Not Found");
	}
	
}




}
