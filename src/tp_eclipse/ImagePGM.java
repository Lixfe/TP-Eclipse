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


public ImagePGM histogramme() {
	/* On remplit un tableau contenant toutes les occurrences des 
	 differents niveaux de gris, puis on crée une image PGM avec l'histogramme correspondant.
	 */
	
	int occurrences[] = new int[this.maxNiveauGris];
	
	for (int i = 0; i < this.hauteur; i++) {
		for (int j = 0; j < this.largeur; j++) {
			occurrences[this.pixels[i][j]-1]++;
		}
	}
	

	ImagePGM imageResultat = new ImagePGM();
	
	imageResultat.largeur = occurrences.length;
	imageResultat.maxNiveauGris = this.maxNiveauGris;
	imageResultat.pixels = new int[imageResultat.hauteur][imageResultat.largeur];
	
	/*Trouver max du tableau pour déterminer la hauteur de l'image résultat
	 * 
	 */
	int n = 0;
	for (int i = 0; i < occurrences.length; i++) {
		if (occurrences[i]>n) {
			n = occurrences[i];
		}
	}
	
	System.out.println(n);

	imageResultat.hauteur = n+1;
	
	
	for (int j = 0; j < occurrences.length; j++) {
		for (int i = 0; i < occurrences[j]; i++) {
			imageResultat.pixels[i][j] = imageResultat.maxNiveauGris;
		}
	}
	

	return imageResultat;
}



}
