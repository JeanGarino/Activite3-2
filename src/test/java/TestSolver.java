package c306.sudoku;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;

import java.util.*;

public class TestSolver{
@Test
void testSolve1() {


try{
FileInputStream file = new FileInputStream("src/main/java/grilles/pasdepremiereligne.txt");

GrilleImpl g=(GrilleImpl)GrilleParser.parse(file);
SolveurImpl solver=new SolveurImpl();

fail("");

}
catch(IOException|IllegalArgumentException |ElementInterditException|ValeurInitialeModificationException|HorsBornesException|ValeurImpossibleException e){
	System.out.println("something went wrong : " + e.getMessage());
}




}

@Test
void testSolve2() {


try{
FileInputStream file = new FileInputStream("src/main/java/grilles/valeurpossibleduplique.txt");

GrilleImpl g=(GrilleImpl)GrilleParser.parse(file);



SolveurImpl solver=new SolveurImpl();

fail("");

}
catch(IOException|IllegalArgumentException |ElementInterditException|ValeurInitialeModificationException|HorsBornesException|ValeurImpossibleException e){
	System.out.println("something went wrong : " + e.getMessage());
}




}



@Test
void testSolve3() {


try{
FileInputStream file = new FileInputStream("src/main/java/grilles/paslebonnombredevaleur.txt");

GrilleImpl g=(GrilleImpl)GrilleParser.parse(file);



SolveurImpl solver=new SolveurImpl();

fail("");

}
catch(IOException|IllegalArgumentException |ElementInterditException|ValeurInitialeModificationException|HorsBornesException|ValeurImpossibleException e){
	System.out.println("something went wrong : " + e.getMessage());
}




}




@Test
void testSolve4() {


try{
FileInputStream file = new FileInputStream("src/main/java/grilles/sudoku16-expert-b.txt");

GrilleImpl g=(GrilleImpl)GrilleParser.parse(file);



SolveurImpl solver=new SolveurImpl();




assertTrue(solver.solve(g));

}
catch(IOException|IllegalArgumentException |ElementInterditException|ValeurInitialeModificationException|HorsBornesException|ValeurImpossibleException e){
	System.out.println("something went wrong : " + e.getMessage());
}




}

@Test
void testSolve5() {


try{
FileInputStream file = new FileInputStream("src/main/java/grilles/sudoku16-moyen-complete.txt");

GrilleImpl g=(GrilleImpl)GrilleParser.parse(file);



SolveurImpl solver=new SolveurImpl();
solver.solve(g);






}
catch(IOException|IllegalArgumentException |ElementInterditException|ValeurInitialeModificationException|HorsBornesException|ValeurImpossibleException e){
	System.out.println("something went wrong : " + e.getMessage());
}




}



@Test
void testSolve6() {


try{
FileInputStream file = new FileInputStream("src/main/java/grilles/valeurinterdite.txt");

GrilleImpl g=(GrilleImpl)GrilleParser.parse(file);



SolveurImpl solver=new SolveurImpl();




fail("");

}
catch(IOException|IllegalArgumentException |ElementInterditException|ValeurInitialeModificationException|HorsBornesException|ValeurImpossibleException e){
	System.out.println("something went wrong : " + e.getMessage());
}




}


@Test
void testSolve7() {


try{
FileInputStream file = new FileInputStream("src/main/java/grilles/sudoku16-expert-b.txt");

GrilleImpl g=(GrilleImpl)GrilleParser.parse(file);



SolveurImpl solver=new SolveurImpl();

g.setValue(0,0,new ElementDeGrilleImplAsChar('5'));

fail("");



}
catch(IOException|IllegalArgumentException |ElementInterditException|ValeurInitialeModificationException|HorsBornesException|ValeurImpossibleException e){
	System.out.println("something went wrong : " + e.getMessage());
}




}


@Test
void testSolve8() {


try{
FileInputStream file = new FileInputStream("src/main/java/grilles/sudoku16-expert-b.txt");

GrilleImpl g=(GrilleImpl)GrilleParser.parse(file);



SolveurImpl solver=new SolveurImpl();

g.setValue(0,1,new ElementDeGrilleImplAsChar('2'));

fail("");



}
catch(IOException|IllegalArgumentException |ElementInterditException|ValeurInitialeModificationException|HorsBornesException|ValeurImpossibleException e){
	System.out.println("something went wrong : " + e.getMessage());
}




}


@Test
void testSolve9() {


try{
FileInputStream file = new FileInputStream("src/main/java/grilles/sudoku16-expert-b.txt");

GrilleImpl g=(GrilleImpl)GrilleParser.parse(file);



SolveurImpl solver=new SolveurImpl();

g.setValue(1,0,new ElementDeGrilleImplAsChar('2'));

fail("");



}
catch(IOException|IllegalArgumentException |ElementInterditException|ValeurInitialeModificationException|HorsBornesException|ValeurImpossibleException e){
	System.out.println("something went wrong : " + e.getMessage());
}




}

@Test
void testSolve10() {


try{
FileInputStream file = new FileInputStream("src/main/java/grilles/sudoku16-expert-b.txt");

GrilleImpl g=(GrilleImpl)GrilleParser.parse(file);



SolveurImpl solver=new SolveurImpl();

g.setValue(1,0,new ElementDeGrilleImplAsChar('#'));

fail("");



}
catch(IOException|IllegalArgumentException |ElementInterditException|ValeurInitialeModificationException|HorsBornesException|ValeurImpossibleException e){
	System.out.println("something went wrong : " + e.getMessage());
}




}

@Test
void testSolve11() {


try{
FileInputStream file = new FileInputStream("src/main/java/grilles/sudoku16-expert-b.txt");

GrilleImpl g=(GrilleImpl)GrilleParser.parse(file);



SolveurImpl solver=new SolveurImpl();

g.setValue(17,17,new ElementDeGrilleImplAsChar('2'));

fail("");



}
catch(IOException|IllegalArgumentException |ElementInterditException|ValeurInitialeModificationException|HorsBornesException|ValeurImpossibleException e){
	System.out.println("something went wrong : " + e.getMessage());
}




}




@Test
void testSolve12() {


try{
FileInputStream file = new FileInputStream("src/main/java/grilles/sudoku16-expert-b.txt");

GrilleImpl g=(GrilleImpl)GrilleParser.parse(file);



SolveurImpl solver=new SolveurImpl();

g.setValue(3,1,new ElementDeGrilleImplAsChar('&'));

fail("");



}
catch(IOException|IllegalArgumentException |ElementInterditException|ValeurInitialeModificationException|HorsBornesException|ValeurImpossibleException e){
	System.out.println("something went wrong : " + e.getMessage());
}




}


@Test
void testSolve13() {


try{
FileInputStream file = new FileInputStream("src/main/java/grilles/sudoku16-expert-b.txt");

GrilleImpl g=(GrilleImpl)GrilleParser.parse(file);



SolveurImpl solver=new SolveurImpl();

g.setValue(0,17,new ElementDeGrilleImplAsChar('2'));

fail("");



}
catch(IOException|IllegalArgumentException |ElementInterditException|ValeurInitialeModificationException|HorsBornesException|ValeurImpossibleException e){
	System.out.println("something went wrong : " + e.getMessage());
}




}


@Test
void testSolve14() {


try{
FileInputStream file = new FileInputStream("src/main/java/grilles/sudoku16-expert-b.txt");

GrilleImpl g=(GrilleImpl)GrilleParser.parse(file);



SolveurImpl solver=new SolveurImpl();

g.setValue(17,0,new ElementDeGrilleImplAsChar('2'));

fail("");



}
catch(IOException|IllegalArgumentException |ElementInterditException|ValeurInitialeModificationException|HorsBornesException|ValeurImpossibleException e){
	System.out.println("something went wrong : " + e.getMessage());
}




}


@Test
void testSolve15() {


try{
FileInputStream file = new FileInputStream("src/main/java/grilles/sudoku16-expert-b.txt");

GrilleImpl g=(GrilleImpl)GrilleParser.parse(file);



SolveurImpl solver=new SolveurImpl();

g.setValue(0,4,null);

assertTrue(solver.solve(g));



}
catch(IOException|IllegalArgumentException |ElementInterditException|ValeurInitialeModificationException|HorsBornesException|ValeurImpossibleException e){
	System.out.println("something went wrong : " + e.getMessage());
}




}


@Test
void testSolve16() {


try{
FileInputStream file = new FileInputStream("src/main/java/grilles/sudoku16-expert-b.txt");

GrilleImpl g=(GrilleImpl)GrilleParser.parse(file);



SolveurImpl solver=new SolveurImpl();

ElementDeGrille e=g.getValue(17,4);

fail("");



}
catch(IOException|IllegalArgumentException |ElementInterditException|ValeurInitialeModificationException|HorsBornesException|ValeurImpossibleException e){
	System.out.println("something went wrong : " + e.getMessage());
}




}



@Test
void testSolve17() {


try{
FileInputStream file = new FileInputStream("src/main/java/grilles/sudoku16-expert-b.txt");

GrilleImpl g=(GrilleImpl)GrilleParser.parse(file);



SolveurImpl solver=new SolveurImpl();

ElementDeGrille e=g.getValue(17,17);

fail("");



}
catch(IOException|IllegalArgumentException |ElementInterditException|ValeurInitialeModificationException|HorsBornesException|ValeurImpossibleException e){
	System.out.println("something went wrong : " + e.getMessage());
}




}




@Test
void testSolve18() {


try{
FileInputStream file = new FileInputStream("src/main/java/grilles/sudoku16-expert-b.txt");

GrilleImpl g=(GrilleImpl)GrilleParser.parse(file);



SolveurImpl solver=new SolveurImpl();

ElementDeGrille e=g.getValue(4,17);

fail("");



}
catch(IOException|IllegalArgumentException |ElementInterditException|ValeurInitialeModificationException|HorsBornesException|ValeurImpossibleException e){
	System.out.println("something went wrong : " + e.getMessage());
}




}


@Test
void testSolve19() {


try{
FileInputStream file = new FileInputStream("src/main/java/grilles/sudoku16-expert-b.txt");

GrilleImpl g=(GrilleImpl)GrilleParser.parse(file);



SolveurImpl solver=new SolveurImpl();

ElementDeGrille e=g.getValue(0,0);

assertEquals('2',((ElementDeGrilleImplAsChar) e).getValeur());



}
catch(IOException|IllegalArgumentException |ElementInterditException|ValeurInitialeModificationException|HorsBornesException|ValeurImpossibleException e){
	System.out.println("something went wrong : " + e.getMessage());
}




}



@Test
void testSolve20() {


try{
FileInputStream file = new FileInputStream("src/main/java/grilles/sudoku16-expert-b.txt");

GrilleImpl g=(GrilleImpl)GrilleParser.parse(file);



SolveurImpl solver=new SolveurImpl();

assertTrue(solver.solve(g));





}
catch(IOException|IllegalArgumentException |ElementInterditException|ValeurInitialeModificationException|HorsBornesException|ValeurImpossibleException e){
	System.out.println("something went wrong : " + e.getMessage());
}




}



@Test
void testSolve21() {


try{
FileInputStream file = new FileInputStream("src/main/java/grilles/sudoku16-expert-b.txt");

GrilleImpl g=(GrilleImpl)GrilleParser.parse(file);



SolveurImpl solver=new SolveurImpl();

g.setValue(1,0,new ElementDeGrilleImplAsChar('2'));





}
catch(IOException|IllegalArgumentException |ElementInterditException|ValeurInitialeModificationException|HorsBornesException|ValeurImpossibleException e){
	System.out.println("something went wrong : " + e.getMessage());
}




}



void testSolve22() {


try{
FileInputStream file = new FileInputStream("src/main/java/grilles/sudoku16-expert-b.txt");

GrilleImpl g=(GrilleImpl)GrilleParser.parse(file);



SolveurImpl solver=new SolveurImpl();

//g.isPossible(1,0,new ElementDeGrilleImplAsChar('2'));


fail("");


}
catch(IOException|IllegalArgumentException |ElementInterditException|ValeurInitialeModificationException|HorsBornesException|ValeurImpossibleException e){
	System.out.println("something went wrong : " + e.getMessage());
}




}


@Test
void testSolve23() {


try{
FileInputStream file = new FileInputStream("src/main/java/grilles/sudoku16-expert-b.txt");

GrilleImpl g=(GrilleImpl)GrilleParser.parse(file);



SolveurImpl solver=new SolveurImpl();

solver.solve(g);





}
catch(IOException|IllegalArgumentException |ElementInterditException|ValeurInitialeModificationException|HorsBornesException|ValeurImpossibleException e){
	System.out.println("something went wrong : " + e.getMessage());
}




}


@Test
void testSolve24() {


try{
FileInputStream file = new FileInputStream("src/main/java/grilles/test-1.txt");

GrilleImpl g=(GrilleImpl)GrilleParser.parse(file);



SolveurImpl solver=new SolveurImpl();

//g.isPossible(0,1,null);


fail("");


}
catch(IOException|IllegalArgumentException |ElementInterditException|ValeurInitialeModificationException|HorsBornesException|ValeurImpossibleException e){
	System.out.println("something went wrong : " + e.getMessage());
}




}

@Test
void testSolve25() {


try{
FileInputStream file = new FileInputStream("src/main/java/grilles/testx.txt");

GrilleImpl g=(GrilleImpl)GrilleParser.parse(file);



SolveurImpl solver=new SolveurImpl();

//g.isPossible(0,1,null);


fail("");


}
catch(IOException|IllegalArgumentException |ElementInterditException|ValeurInitialeModificationException|HorsBornesException|ValeurImpossibleException e){
	System.out.println("something went wrong : " + e.getMessage());
}




}

@Test
void testSolve26() {


try{
FileInputStream file = new FileInputStream("src/main/java/grilles/test-2.txt");

GrilleImpl g=(GrilleImpl)GrilleParser.parse(file);



SolveurImpl solver=new SolveurImpl();

//g.isPossible(0,1,null);


fail("");


}
catch(IOException|IllegalArgumentException |ElementInterditException|ValeurInitialeModificationException|HorsBornesException|ValeurImpossibleException e){
	System.out.println("something went wrong : " + e.getMessage());
}




}
@Test
void testSolve27() {


try{
FileInputStream file = new FileInputStream("src/main/java/grilles/test4.txt");

GrilleImpl g=(GrilleImpl)GrilleParser.parse(file);



SolveurImpl solver=new SolveurImpl();

//g.isPossible(0,1,null);


fail("");


}
catch(IOException|IllegalArgumentException |ElementInterditException|ValeurInitialeModificationException|HorsBornesException|ValeurImpossibleException e){
	System.out.println("something went wrong : " + e.getMessage());
}




}

@Test
void testSolve28() {


try{
FileInputStream file = new FileInputStream("src/main/java/grilles/test5.txt");

GrilleImpl g=(GrilleImpl)GrilleParser.parse(file);



SolveurImpl solver=new SolveurImpl();

//g.isPossible(0,1,null);


fail("");


}
catch(IOException|IllegalArgumentException |ElementInterditException|ValeurInitialeModificationException|HorsBornesException|ValeurImpossibleException e){
	System.out.println("something went wrong : " + e.getMessage());
}




}

}





