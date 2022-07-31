package bibliotecario.SitoBiblioteca;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.io.FileUtils;
import bibliotecario.ElementoLetterario.ElementoLetterario;
import bibliotecario.ElementoLetterario.Libro;

public class Archivio { //usiamo la collection Map, che implementa i metodi per l'oggetto
	
	private Map<String, ElementoLetterario> archivio = new HashMap<String, ElementoLetterario>();
	

	public void ricercaIsbn(String codIsbn) {
		
		ElementoLetterario lett = archivio.get(codIsbn);
		System.out.println(lett);
		
	};
	
    public void ricercaAnnoPubblicazione(int annoPubblicazione) { //uso uno stream, che prende gli oggetti dentro l'archivio
		
    	archivio.values()
    	.stream().filter(element -> 
    	annoPubblicazione == element.getAnnoPubblicazione())
    	.forEach(element -> System.out.println(element)); //uso di una lambda function 
	};
	
    public void aggiungiElemento(ElementoLetterario a) {
    	
    	archivio.put(a.getCodIsbn(), a); //passo l'oggetto utilizzando il metodo getCodIsbn (il parametro "a" è tutto l'ogetto
		
	};
	
    public void rimuoviElemento(String codIsbn) {
		
    	archivio.remove(codIsbn);
    	System.out.println("Hai eliminato il file in modo corretto");
	};
	
    public void ricercaAutore(String autore) { //essendo autore proprio solo di libro, uso il casting per trasformare l'oggetto in tipo Libro
    	
    	archivio.values()
    	.stream().filter(element ->
    	element instanceof Libro) //filtra la collection
    	.map(element -> (Libro)element) //casta gli oggetti filtrati in oggetto di tipo libro
    	.filter(element -> autore.equals(element.getAutore())) //ogni elemento deve avere l'autore che gli passiamo tramite il metodo
    	.forEach(element -> System.out.println(element));
	};
	
	public void salvaElemento() { //utilizzo la libreria apache.commons
		
		File elemento = new File("Archivio/archivio.txt"); //nome della cartella che andrà a creare il programma
		String dato = "";
		for (ElementoLetterario element: archivio.values()) {
			dato += element.toString(); //per ogni elemento presente nell'archivio si va a incrementare il dato
		} 
		try {
			FileUtils.writeStringToFile(elemento, dato);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void caricaElemento() {
		
		File elemento = new File("Archivio/archivio.txt");
		try {
			String file = FileUtils.readFileToString(elemento);
			System.out.println(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	};
	
	
	
	
}
