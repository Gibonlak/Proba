

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.JTextField;

public class Faktura extends JFrame
{

	int x;
	int y;
	int numerfaktury;
	int z;
	String txt;
	String nazwaOdbiorcy;
	String adresOdbiorcy;
	String nipppp;
		
	public Faktura (int x, int y, String txt, int nrf, String n, String a, String nip)
	{
	setSize(x,y);
	setTitle(txt);	
	numerfaktury = nrf;	
	nazwaOdbiorcy = n;	
	adresOdbiorcy = a;
	this.nip = nip;
				
	JComponent L = Lewa();
	L.setSize(x/6, y);
	
	JComponent P = Prawa();
	P.setSize(x, y);
			
	setVisible(true);
	setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	getContentPane().add(L);
	getContentPane().add(P);
	
	setLayout(new FlowLayout());
	pack();
	}
	
	private JComponent Lewa()
	{ 
		
		JPanel Lewa = new JPanel();
		JLabel L1 = new JLabel("Wprowadz dane odbiorcy");
		JLabel L2 = new JLabel("Wprowadz adres odbiorcy");
		JLabel L3 = new JLabel("Wprowadz NIP odbiorcy faktury");
		JTextField P1 = new JTextField(nazwaOdbiorcy, 15);
		JTextField P2 = new JTextField(adresOdbiorcy, 15);
		JTextField P3 = new JTextField(nip, 15);
		
		Lewa.add(L1);
		Lewa.add(P1);
		Lewa.add(L2);
		Lewa.add(P2);
		Lewa.add(L3);
		Lewa.add(P3);
		
		Lewa.setLayout(new GridLayout(15,7));
		
		JButton Zakoncz = new JButton("Zakoñcz");
		Lewa.add(Zakoncz);
	
		Zakoncz.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				dispose();							
			}
		});
			
		return Lewa;
	}	
	
	private JComponent Prawa()
	{ 
	
	JPanel PDol = new JPanel();
	Pozycja o = new Pozycja(1, "", "", "", "", "", "", "");
	JPanel naglowki = new JPanel();
	JLabel P0 = new JLabel("L.p.");
	JLabel P1 = new JLabel("Nazwa"); 
	JLabel P2 = new JLabel("Iloœæ"); 
	JLabel P3 = new JLabel("Jednostka"); 
	JLabel P4 = new JLabel("NETTO"); 
	JLabel P5 = new JLabel("Stawka VAT"); 
	JLabel P6 = new JLabel("Kwota VAT"); 
	JLabel P7 = new JLabel("BRUTTO"); 
	
	naglowki.add(P0);
	naglowki.add(P1);
	naglowki.add(P2);
	naglowki.add(P3);
	naglowki.add(P4);
	naglowki.add(P5);
	naglowki.add(P6);
	naglowki.add(P7);
	naglowki.setLayout(new GridLayout(1,7));
		
	
		JButton NowaPozycja = new JButton("Dodaj Pozycjê");
		NowaPozycja.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
			if ( z<=11) {
			Pozycja x = new Pozycja(z+2, "", "", "", "", "", "", "");
			PDol.add(x);
			setVisible(true);
			z++;
			}
			else
			{
			JOptionPane.showMessageDialog(PDol, "Wprowadzi³eœ za du¿o pozycji. Wprowadz now¹ fakturê");
			}}
		});
			
	PDol.setLayout(new GridLayout(15,1));
	PDol.add(NowaPozycja);
	PDol.add(naglowki);
	PDol.add(o);
	return PDol;
	
	
	}

public String toString()
{
	
	String nrfString = Integer.toString(numerfaktury);
	String fak = "Nr: " + nrfString + "/2018";
		
	return fak;
}



}


