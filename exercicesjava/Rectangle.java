
import java.lang.Math;
public class Rectangle extends Figure{
	private double largeur;
	
	//Pour créer un objet: nomClasse nomObjet = new nomClasse(arguments);
	//Pour déclarer un constructeur (est une fonction): 
	//visibilité + nomClasse + paramètres ( si possible)
	//Différence constructeur et fonction:
	//On définit le type de retour dans la déclaration de la fonction
	//Mais si la fonction ne renvoie rien, on met void quand on déclare.
	//Dans le constructeur, non. ou bien void
	
	//Constructeur
	public Rectangle(double a, double b){
		this.longueur = a;
		this.largeur = b;
	}
	
	public Rectangle(){
		this.longueur = 0;
		this.largeur = 0;
	}

	//Fonction
	public double getLongueur(){
		return this.longueur;
	}
	
	public double getLargeur(){
		return this.largeur;
	}

	public void setLargeur(double a){
		this.largeur = a;
	}

	public void setLongueur(double b){
		this.longueur = b;
	}

	public static String getUnite(){
		return Rectangle.unite;
	}

	public static void setUnite(String unite){
		Rectangle.unite = unite;
	}

	public double demiPerimetre(){
		return this.longueur + this.largeur;
	} 

	public double surface(){
		return this.longueur * this.largeur;
	}

	public double diagonale(){
		return Math.sqrt(Math.pow(this.longueur,2.0) +Math.pow(this.largeur,2.0));
	} 


}