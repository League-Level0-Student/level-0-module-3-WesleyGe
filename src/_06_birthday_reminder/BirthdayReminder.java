
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {

		// 1. correct the birthdays for your family below
		String momsBirthday = "April 28th";
		String dadsBirthday = "July 29th";
		String myBirthday = "April 29th";
		String idk = "I dont know that birthday!";

		// 2. Find out which birthday the user wants and and store their response in a
		// variable
		// 3. Print out what the user typed
		for (int i = 0; i < 100; i++) {
			String a = JOptionPane.showInputDialog("Whose birthday do you want?");
			System.out.println(a);
			// 4. if user asked for "mom"
			if (a.equals("mom")) {
				System.out.println(momsBirthday);
			}
			// print mom's birthday
			// 5. if user asked for "dad"
			else if (a.equals("dad")) {
				System.out.println(dadsBirthday);
			}
			// print dad's birthday
			// 6. if user asked for your name
			// print myBirthday
			else if (a.equals("wesley")) {
				System.out.println(myBirthday);
			} else {

				System.out.println(idk);
			}
		}
		// 7. otherwise print "Sorry, i don't remember that person's birthday!"
	}
}
