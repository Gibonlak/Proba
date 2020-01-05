import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

public class OknoGlowne extends JFrame 

{
		
		private JList<Faktura> lista;
		private Faktury faktury;
		int nrf = 0;
		public OknoGlowne(int w, int h, String title, Faktury f) 
		{
			faktury = f;
			setSize(w, h);
			setTitle(title);
						
			JComponent L = LewaStrona();
			L.setPreferredSize(new Dimension(w*2, h));
			L.setBackground(Color.BLUE);
			JComponent P = PrawaStrona(w,h);
			P.setPreferredSize(new Dimension(w, h));
			P.setBackground(Color.GREEN);
			
			getContentPane().setLayout(new FlowLayout());
			getContentPane().add(L);
			getContentPane().add(P);
			
			pack();
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			
		}
		
			private JComponent PrawaStrona(int w, int h) 
			{
			
			JPanel PPrawy = new JPanel();
						
			lista = new JList<Faktura>(); 
			lista.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			lista.setLayoutOrientation(JList.HORIZONTAL_WRAP);
			lista.setVisibleRowCount(-1);
			
			
			JScrollPane listScroller = new JScrollPane(lista); 
			listScroller.setPreferredSize(new Dimension(w, h));
			
			PPrawy.add(listScroller);
			lista.addMouseListener(new MouseAdapter() { 
										
				public void mouseClicked(MouseEvent e) 
				{if (e.getClickCount() >= 2)
				{
					Faktura s = lista.getSelectedValue();
					s.setVisible(true);
				}
				}});			
						
			return PPrawy;
			}
		
		
			private JComponent LewaStrona() 
			{
				
			JPanel PLewy = new JPanel();	
						
			JButton dodaj = new JButton("Dodaj Fakturê");
			dodaj.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent e) 
					{
					nrf++;	
					Faktura xx = new Faktura(1400, 800, "FAKTURA", nrf, "£ukasz Ginalski","Oksowska 8, 05-092 £omianki","111-222-333-444"); 
					faktury.dodaj(xx);
					lista.setListData(faktury.daj());			
					
					}
				});
			
			JButton usun = new JButton("Usuñ fakturê");
			usun.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent e) 
					{
					nrf++;	
					Faktura xx = lista.getSelectedValue();
					faktury.usun(xx);
					lista.setListData(faktury.daj());	
					}
				});
			
			JButton Zakoncz = new JButton("Zakoñcz");
			Zakoncz.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e) 
				{
					dispose();
								
				}
			});	
		
				
			PLewy.setLayout(new GridLayout(3,1));
			PLewy.add(dodaj);
			PLewy.add(usun);
			PLewy.add(Zakoncz);
			return PLewy;
			
			}
}
