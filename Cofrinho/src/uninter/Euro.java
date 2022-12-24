package uninter;

public class Euro extends Moeda {

	public Euro(double valor) {
		super(valor);
	}

	public void info() {
		System.out.println("Euro - " + valor);
	}

	public double converter() {
		return this.valor * 5.05; // cotação do euro hoje (02/11/2022)
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Euro other = (Euro) obj;
		if (Double.doubleToLongBits(valor) != Double.doubleToLongBits(other.valor))
			return false;
		return true;
	}

}