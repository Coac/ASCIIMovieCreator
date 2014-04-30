package ES;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import Film.Eléments.Ligne;
import Film.Eléments.Coordonnées.Coord;



public class AppliTest {
	
	public static void main(String[] args) throws FileNotFoundException {

	    //Ouverture
		PrintWriter printWriter = new PrintWriter ("C:/Users/Coac/Desktop/test.txt");
	    
	    // Initialisation du tab qui va accueillir les caractères
	    char tab[][] = new char[20][20];
	    for (int i = 0; i < tab.length; i++)
	    	for (int j = 0; j < tab[i].length; j++)
	    		tab[i][j] = ' ';
	    
	    
	    
	    // On lui rentre les caractères
	    Ligne ligne = new Ligne('a',new Coord(0,5)	, new Coord(10,10));
	    for (int i = 0; i < ligne.size(); i++) {
			tab[ligne.get(i).getCoord().getX()][ligne.get(i).getCoord().getY()] = ligne.get(i).getCaractère();
		}
	    
	    
	    //Affichage dans le fichier
	    String s = new String("");
	    for (int i = 0; i < tab.length; i++) {
	    	for (int j = 0; j < tab[i].length; j++) {
	    		s += tab[i][j];
	    	}
	    printWriter.println(s);
	    s = "";
	    }
	    
	    //Fermeture
	    printWriter.close();
	}

}
