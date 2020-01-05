

import java.util.ArrayList;

import javax.swing.JList;

public class Faktury  
{
	
	
	private ArrayList<Faktura> faktury = new ArrayList<>();
	public JList<Faktura> lista;
		
	public Faktura[] daj()
	{
		return faktury.toArray(new Faktura[faktury.size()]);
		
	}
	
	public void dodaj(Faktura n)
	{
		faktury.add(n);
	}

	public void usun(Faktura w) {
		faktury.remove(w);
	}
	
}
