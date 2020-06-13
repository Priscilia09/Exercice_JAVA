import java.lang.Math;
public class Carre extends Figure{
	//Constructeur
	//this->longueur(php)=this.longueur(java)
	public Carre( double a){
		if(a!=0){
			this.longueur=a;
		}
	}

	public double getLongueur(){
		return this.longueur;
	}

	public void setLongueur( double b){
		this.longueur = b;
	}

	public static String getUnite(){
		return Carre.unite;
	}

	public static void setUnite(String unite){
		Carre.unite = unite;
	}

	public double demiPerimetre(){
		return this.longueur * 2.0;
	} 

	public double surface(){
		return this.longueur * this.longueur;
	}

	public double diagonale(){
		return Math.sqrt(Math.pow(this.longueur,2.0) +Math.pow(this.longueur,2.0));
	} 

	
}