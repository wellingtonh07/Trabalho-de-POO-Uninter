package uninter;

public class Real extends Moeda {

	public Real(double valor) {
		super(valor);
	}

	public void info() {
		System.out.println("Real - " + valor);
	}

	public double converter() {
		return this.valor;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Real other = (Real) obj;
		if (Double.doubleToLongBits(valor) != Double.doubleToLongBits(other.valor))
			return false;
		return true;
	}
}
