package _07_years_alive;

import javax.swing.JOptionPane;

public class years {
	public static void main(String[] args) {
		
	
String q = JOptionPane.showInputDialog("How old are you?");
int x = Integer.parseInt(q);
int y = 2020-x;
for (int i= 0; i<=x; i++){
	System.out.println(y+i);
}
}
}