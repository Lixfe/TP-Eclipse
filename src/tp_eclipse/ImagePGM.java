package tp_eclipse;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;


public class ImagePGM {
	

private	int largeur;
private int longueur;
private int maxNiveauGris;
private int pixels[][];


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


}
