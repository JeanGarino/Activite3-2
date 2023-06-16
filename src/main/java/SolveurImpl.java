package c306.sudoku;
import java.util.Set;


/**
 * Interface de résolveur de Grille.
 *
 * @author Sébastien Choplin <sebastien.choplin@u-picardie.fr>
 */
public class SolveurImpl implements Solveur {
    /**
     * Résoud une Grille.
     *
     * @param grille Grille à résoudre
     * @return true si la grille a été résolue
     */
@Override
public final boolean solve(final Grille grille) {
char valeur;
GrilleImpl gg = (GrilleImpl) grille;

Set<ElementDeGrille> el=gg.getElements();
int dimension = gg.getDimension();
boolean w = false;
boolean isPossible = false;
boolean isValeurInitiale = false;

if (!gg.isComplete()) {
   try {

      for (ElementDeGrille v : el) {
         for (int i = 0; i < dimension; i++) {
		    for (int j = 0; j < dimension; j++) {
				isValeurInitiale = gg.isValeurInitiale(i, j);
				isPossible = gg.isPossible(i, j, v);

			   if (!isValeurInitiale && isPossible) {
				     gg.setValue(i, j, v);
System.out.println("x= " + i + " y=" + j + " value=" + ((ElementDeGrilleImplAsChar)v).getValeur());
					 if (solve(gg)) {
					    w = true;

						return w;

                     } else {
					       gg.setValue(i, j, null);
					    }

		        }

			}
	     }

	   }

	   } catch (ElementInterditException | ValeurInitialeModificationException | HorsBornesException | ValeurImpossibleException e) {
		   System.out.println("Solver exception");

   }

}


return true;
}

}