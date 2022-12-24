package uninter;

public class Dolar extends Moeda {

	public Dolar(double valor) {
		super(valor);
	}

	public void info() {
		System.out.println("Dolar - " + valor);
	}

	public double converter() {
		return this.valor * 5.33; // cotação do dolar hoje(15/10/2022)
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dolar other = (Dolar) obj;
		if (Double.doubleToLongBits(valor) != Double.doubleToLongBits(other.valor))
			return false;
		return true;
	}

}