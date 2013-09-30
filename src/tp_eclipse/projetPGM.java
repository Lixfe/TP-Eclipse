package tp_eclipse;
import java.io.*;

public class projetPGM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ImagePGM imageIena = new ImagePGM("lena.pgm");
		ImagePGM histoIena = imageIena.histogramme();
		
}
	
}
