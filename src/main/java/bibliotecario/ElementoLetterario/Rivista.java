package bibliotecario.ElementoLetterario;

public class Rivista extends ElementoLetterario {
	private Periodicita periodicita; //tipizzazione di periodicita

	public Rivista(String codIsbn, String titolo, int annoPubblicazione, int numPagg, Periodicita periodicita) {
		super(codIsbn, titolo, annoPubblicazione, numPagg);
		this.periodicita = periodicita;
	}

	public Periodicita getPeriodicita() {
		return periodicita;
	}

	public void setPeriodicita(Periodicita periodicita) {
		this.periodicita = periodicita;
	}

	@Override
	public String toString() {
		return "Rivista [periodicita=" + periodicita + ", toString()=" + super.toString() + "]";
	}
	

}
