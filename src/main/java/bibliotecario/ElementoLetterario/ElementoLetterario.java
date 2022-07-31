package bibliotecario.ElementoLetterario;

public abstract class ElementoLetterario { //scrivo gli attributi comuni di libri e riviste nella classe astratta
	private String codIsbn;
	private String titolo;
	private int annoPubblicazione;
	private int numPagg;
	
	//creo il costruttore
	public ElementoLetterario(String codIsbn, String titolo, int annoPubblicazione, int numPagg) {
		this.codIsbn = codIsbn;
		this.titolo = titolo;
		this.annoPubblicazione = annoPubblicazione;
		this.numPagg = numPagg;
	}
	
	//creo i getter e i setter

	public String getCodIsbn() {
		return codIsbn;
	}


	public void setCodIsbn(String codIsbn) {
		this.codIsbn = codIsbn;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public int getAnnoPubblicazione() {
		return annoPubblicazione;
	}

	public void setAnnoPubblicazione(int annoPubblicazione) {
		this.annoPubblicazione = annoPubblicazione;
	}

	public int getNumPagg() {
		return numPagg;
	}

	public void setNumPagg(int numPagg) {
		this.numPagg = numPagg;
	}
	
	//metodo che trasforma le variabili in stringhe, così che si possano leggere in console
		@Override
		public String toString() {
			return "ElementoLetterario [codIsbn=" + codIsbn + ", titolo=" + titolo + ", annoPubblicazione="
					+ annoPubblicazione + ", numPagg=" + numPagg + "]";
		}
	
	
	

}
