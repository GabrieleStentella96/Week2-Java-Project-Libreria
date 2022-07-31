package bibliotecario.ElementoLetterario;

public class Libro extends ElementoLetterario {
	private String genere;
	private String autore;
	public Libro(String codIsbn, String titolo, int annoPubblicazione, int numPagg, String genere, String autore) {
		super(codIsbn, titolo, annoPubblicazione, numPagg); //la superclasse ha gli attributi importati dalla classe astratta ElementoLetterario
		this.genere = genere;
		this.autore = autore;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	@Override
	public String toString() {
		return "Libro [genere=" + genere + ", autore=" + autore + ", toString()=" + super.toString() + "]";
	}
	
	

}
