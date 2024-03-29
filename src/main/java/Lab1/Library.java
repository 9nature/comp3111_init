/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Lab1;
import Lab2.ex1.Book;
import Lab2.ex2.Charger;
import Lab2.ex2.Computer;
import Lab2.ex2.MobileComputer;
import Lab2.ex2.Phone;

import java.util.Arrays;

public class Library {
	public static void main(String[] arg) {
		final String[] array = {"Basic Java", "Advanced Java", "Forget about Java"};
		Book b = new Book(array);
		System.out.println("The title of Chapter 1 is " + b.getChapter(1));
		String[] anotherArray = b.getChapters();

		System.out.println("There are " + anotherArray.length + " chapters.");
		System.out.println(Arrays.toString(anotherArray));

		Computer a = new MobileComputer();
		for (int i = 0; i < 10; i++)
			a.work();

		Charger c = new Charger();
		Phone p = new Phone();
		MobileComputer m = new MobileComputer();

		c.charge(p);
		c.charge(m);
	}
	
    public boolean someLibraryMethod() {
        return true;
    }
}
