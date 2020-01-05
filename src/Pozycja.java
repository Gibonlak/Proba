


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Pozycja  extends JPanel
{
	

int lp;
String t1;
String t2;
String t3;
String t4;
String t5;
String t6;
String t7;


	public Pozycja (int i, String t1, String t2, String t3, String t4, String t5, String t6, String t7)
	{
	this.t1 = t1;
	this.t2 = t2;
	this.t3 = t3;
	this.t4 = t4;
	this.t5 = t5;
	this.t6 = t6;
	this.t7 = t7;
	
	lp = i;
	String lpString = Integer.toString(lp);
		
	int szer = 7;	
	JPanel poz = new JPanel();
	
	JTextField P0 = new JTextField(lpString, szer);
	JTextField P1 = new JTextField(t1, szer);
	JTextField P2 = new JTextField(t2, szer);
	JTextField P3 = new JTextField(t3, szer);
	JTextField P4 = new JTextField(t4, szer);
	JTextField P5 = new JTextField(t5, szer);
	JTextField P6 = new JTextField(t6, szer);
	JTextField P7 = new JTextField(t7, szer);
	
	
	poz.add(P0);
	poz.add(P1);
	poz.add(P1);
	poz.add(P2);
	poz.add(P3);
	poz.add(P4);
	poz.add(P5);
	poz.add(P6);
	poz.add(P7);
	
	
	setVisible(true);
	add(poz);
	
	P1.addMouseListener(new MouseAdapter() { 
		
	public void mouseEntered(MouseEvent e) 
	{
		System.out.println("fasdfasd");
	}
	});		
	
	}
	




		
}
