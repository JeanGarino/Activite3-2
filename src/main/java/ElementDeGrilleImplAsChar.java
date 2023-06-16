package c306.sudoku;
/**
 * @author Sébastien Choplin <sebastien.choplin@u-picardie.fr>
 */
public class ElementDeGrilleImplAsChar implements ElementDeGrille {
/**
*valeur de la case.
*/
private char valeur;
/**
*constructeur de la classe.
*@param valeur2 passé en paramettre
*/
ElementDeGrilleImplAsChar(final char valeur2) {
this.valeur = valeur2;

}

/**
*retourne la valeur.
*@return valeur
*/
public final char getValeur() {
return this.valeur;
}


}
