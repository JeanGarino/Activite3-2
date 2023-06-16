package c306.sudoku;

import java.util.Set;
import java.util.HashSet;

/**
 * Interface de grille de sudoku. Chaque case d'une Grille
 peut contenir un ElementDeGrille ou null si aucun élément n'est placé.
 * Une Grille doit toujours respecter les règles du sudoku.
 * <p>
 * Une Grille peut contenir des cases qui ne doivent pas être
 modifiées (les valeurs initiales de la Grille)
 *
 * @author Sébastien Choplin <sebastien.choplin@u-picardie.fr>
 */
public class GrilleImpl implements Grille {
/**
*Elements pouvant exister dans la grille.
*/
private Set<ElementDeGrille> elements;
/**
*tableau contenant les elements de la grille.
*/
private ElementDeGrille[][] table;
/**

/**
*dimension du tableau.
*/
private final int dimension;
/**
*Constructeur de la classe.
*@param elements2 elements pouvant exister
*/
GrilleImpl(final ElementDeGrille[] elements2) {
   super();
   this.elements = new HashSet<ElementDeGrille>();
   for (int i = 0; i < elements2.length; i++) {
      this.elements.add(elements2[i]);
   }
   this.dimension = elements2.length;
this.table = new ElementDeGrille[this.dimension][this.dimension];


}


@Override
public final Set<ElementDeGrille> getElements() {
return this.elements;
}

@Override
public final int getDimension() {
return this.dimension;
}

@Override
public final void setValue(final int x, final int y, final ElementDeGrille value) throws HorsBornesException, ValeurImpossibleException, ElementInterditException, ValeurInitialeModificationException {

ElementDeGrilleImplAsChar value2 = (ElementDeGrilleImplAsChar) value;


   if (!isPossible(x, y, value2)) {
      throw new ValeurImpossibleException("ValeurImpossibleException");
}
  if (isValeurInitiale(x, y)) {
   throw new ValeurInitialeModificationException("ValeurInitialeModificationException");
   }

this.table[x][y] = value2;





}


@Override
public final ElementDeGrille getValue(final int x, final int y) throws HorsBornesException {

   if (x >= this.dimension || y >= this.dimension) {
      throw new HorsBornesException("have HorsBornesException");
   }
return this.table[x][y];
}

@Override
public final boolean isComplete() {
boolean r = true;
ElementDeGrilleImplAsChar v;
   for (int i = 0; i < this.dimension; i++) {
      for (int j = 0; j < this.dimension; j++) {

          v = (ElementDeGrilleImplAsChar) this.table[i][j];
         if (v == null) {

            r = false;
         }
      }
   }

return r;
}


@Override
public final boolean isPossible(final int x, final int y, final ElementDeGrille value) throws HorsBornesException, ElementInterditException {
boolean r = true;

ElementDeGrilleImplAsChar value2 = (ElementDeGrilleImplAsChar) value;



   if (x >= this.dimension || y >= this.dimension) {
      throw new HorsBornesException("HorsBornesException");
   }
if (value2 != null) {
    char valeur2 = value2.getValeur();
boolean t = true;

Set<ElementDeGrille> liste = this.elements;

for (ElementDeGrille elg: liste) {

   if (((ElementDeGrilleImplAsChar) elg).getValeur() == valeur2) {
      t = false;
   }

}

   if (t) {
      throw new ElementInterditException("ElementInterditException");
   }


ElementDeGrilleImplAsChar v;

   for (int i = 0; i < this.dimension; i++) {
      for (int j = 0; j < this.dimension; j++) {
         v = (ElementDeGrilleImplAsChar) this.table[i][j];
         if (v != null && v.getValeur() == valeur2 && (i == x || j == y)) {
            r = false;
         }
      }
   }


int k = (int) Math.sqrt(this.dimension);
int ci = x - x % k;
int cj = y - y % k;



   for (int i = 0; i < k; i++) {
      for (int j = 0; j < k; j++) {
         v = (ElementDeGrilleImplAsChar) this.table[ci + i][cj + j];
         if (v != null && v.getValeur() == valeur2) {
            r = false;
         }
      }
   }
}
return r;
}


@Override
public  final boolean isValeurInitiale(final int x, final int y) {
boolean r = false;


Set<ElementDeGrille> liste = this.elements;

for (ElementDeGrille elg : liste) {

   if (elg.equals(this.table[x][y])) {
      r = true;
   }
}

return r;
}

}

