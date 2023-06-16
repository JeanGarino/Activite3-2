package c306.sudoku;
import java.io.IOException;
import java.io.FileInputStream;

class Sudoku {

public static void main(final String[] args) {

try {
FileInputStream file = new FileInputStream("C:/devoir3/src/main/java/grilles/sudoku25-i.txt");

GrilleImpl g = (GrilleImpl) GrilleParser.parse(file);
SolveurImpl solver = new SolveurImpl();
solver.solve(g);
} catch (IOException | ElementInterditException | ValeurInitialeModificationException | HorsBornesException | ValeurImpossibleException e) {
   System.out.println("something went wrong" + e.getMessage());
}

}


}
