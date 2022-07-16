package FallExercise1;

import java.util.Scanner;

interface Manageable 
{
	public void read(Scanner scan);
	public void print();
	public boolean matches(String kwd);
}
