package org.lessons.java.array;

public class CibiPreferiti {
	
	public static void main(String[] args) {
		
		//creo l'array con la classifica dei miei cibi preferiti
		String[] favouriteFoods = {"Pizza", "Carbonara", "Bistecca", "Polpette", "Gelato"};
		
		//stampo a video la lunghezza della classifica
		System.out.println("I cibi preferiti sono " + favouriteFoods.length);
		
		//stampo il primo cibo in classifica
		System.out.println("Il mio cibo preferito è: " + favouriteFoods[0]);
		
		//stampo l'ultimo cibo preferito
		System.out.println("L'ultimo cibo preferito è: " + favouriteFoods[favouriteFoods.length - 1]);
		
		//stampo il cibo che si trova a mezza classifica
		System.out.println("Il cibo a metà classifica è: " + favouriteFoods[favouriteFoods.length / 2]);
	}
}
