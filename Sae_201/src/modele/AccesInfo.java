package modele;

import java.util.ArrayList;
import presentation.Client;

public class AccesInfo 
{
	private static ArrayList<Client> listeClients = new ArrayList<Client>();
	
	
	static public void connexion()
	{
		//Ajout des clients au préalable
		listeClients.add(new Client("Monsieur","Le Gall","Elouan","3 rue Jean Savidan","-27 rue des programmeurs","22300","Lannion","07 84 15 55 60","elouan.legall@univ-rennes1.fr"));
		listeClients.add(new Client("Monsieur","Léon--Plévert","Glenn","1 rue du mouton noi","","22300","Lannion","07 70 11 06 26","Glenn.léon--plévert@univ-rennes1.fr"));
		listeClients.add(new Client("Monsieur","Huger","Pierre","36 rue d'erling Haaland","","","Manchester","441 782 493 985","pierre.huger@univ-rennes1.fr"));
		listeClients.add(new Client("homme","jean","renez","3 rue des fesses","","22300","lannion","0125452","Renez.jean@gaymail.com"));
		listeClients.add(new Client("homme","jean","renez","3 rue des fesses","","22300","lannion","0125452","Renez.jean@gaymail.com"));
		listeClients.add(new Client("homme","jean","renez","3 rue des fesses","","22300","lannion","0125452","Renez.jean@gaymail.com"));
		listeClients.add(new Client("homme","jean","renez","3 rue des fesses","","22300","lannion","0125452","Renez.jean@gaymail.com"));
		listeClients.add(new Client("homme","jean","renez","3 rue des fesses","","22300","lannion","0125452","Renez.jean@gaymail.com"));
		listeClients.add(new Client("homme","jean","renez","3 rue des fesses","","22300","lannion","0125452","Renez.jean@gaymail.com"));
		listeClients.add(new Client("homme","jean","renez","3 rue des fesses","","22300","lannion","0125452","Renez.jean@gaymail.com"));
		listeClients.add(new Client("homme","jean","renez","3 rue des fesses","","22300","lannion","0125452","Renez.jean@gaymail.com"));
		listeClients.add(new Client("homme","jean","renez","3 rue des fesses","","22300","lannion","0125452","Renez.jean@gaymail.com"));
		listeClients.add(new Client("homme","jean","renez","3 rue des fesses","","22300","lannion","0125452","Renez.jean@gaymail.com"));
		listeClients.add(new Client("homme","jean","renez","3 rue des fesses","","22300","lannion","0125452","Renez.jean@gaymail.com"));
		listeClients.add(new Client("homme","jean","renez","3 rue des fesses","","22300","lannion","0125452","Renez.jean@gaymail.com"));
		listeClients.add(new Client("homme","jean","renez","3 rue des fesses","","22300","lannion","0125452","Renez.jean@gaymail.com"));
		listeClients.add(new Client("homme","jean","renez","3 rue des fesses","","22300","lannion","0125452","Renez.jean@gaymail.com"));
		listeClients.add(new Client("homme","jean","renez","3 rue des fesses","","22300","lannion","0125452","Renez.jean@gaymail.com"));
		listeClients.add(new Client("homme","jean","renez","3 rue des fesses","","22300","lannion","0125452","Renez.jean@gaymail.com"));
	}
	
	
	
	static public ArrayList<Client> getDonnees()
	{
		return listeClients;
	}
	
	static public void supprimerClient(Client e) 
	{
		boolean trouve = false;
		int i=0;
		while (!trouve && i<listeClients.size()) 
		{
			if (listeClients.get(i).getNumero()==e.getNumero())
			{
				listeClients.remove(i);
				trouve = true;
			}
			i++;
		}
	}
	
	static public void ajouterClient(Client e) 
	{
		listeClients.add(e);
	}
	
	static public void modifierClient(Client e) {
		boolean trouve = false;
		int i=0;
		while (!trouve && i<listeClients.size()) {
			if (listeClients.get(i).getNumero()==e.getNumero()){
				listeClients.set(i, e);
				trouve = true;
			}
			i++;
		}
	}
	
	static public Client getClient(int numeroClient)
	{
		Client resultat = null;
		boolean trouve = false;
		int i=0;
		while (!trouve && i<listeClients.size()) {
			if (listeClients.get(i).getNumero()==numeroClient){
				trouve = true;
				resultat = listeClients.get(i);
			}
			i++;
		}
		return resultat;
	}
	
	
}
