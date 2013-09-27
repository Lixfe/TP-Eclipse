package tp_eclipse;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;


public class ImagePGM {
	
/**
 * Largeur de l image
 */
	int largeur;
	/**
	 * Longueur de l image
	 */
int longueur;
/**
 * Donne la plus grande valeur de niveaux de gris presente dans l image
 */
int maxNiveauGris;
/**
 * Matrice representant les pixels
 */
int pixels[][];


/**
 * Constructeur par defaut de la classe ImagePGM
 * 
 *Initialise une image vide.
 */
public ImagePGM(){
	this.largeur=0;
	this.longueur=0;
	this.maxNiveauGris = 0;
	this.pixels = new int[0][0];
}

public ImagePGM(String addresseImage){
	//Scanner sc = new 
}

}
