package builder;

public class Automobile {
	private String marca;
	private String modello;
	private String colore;
	private int numMarce;
	private boolean cambioAutomatico;

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public static class Builder {
		String marca;
		String modello;
		String colore;
		int numMarce;
		boolean cambioAutomatico;

		public String getMarca() {
			return marca;
		}

		public Builder setMarca(String marca) {
			this.marca = marca;
			return this;
		}

		public String getModello() {
			return modello;
		}

		public Builder setModello(String modello) {
			this.modello = modello;
			return this;
		}

		public String getColore() {
			return colore;
		}

		public Builder setColore(String colore) {
			this.colore = colore;
			return this;
		}

		public int getNumMarce() {
			return numMarce;
		}

		public Builder setNumMarce(int numMarce) {
			this.numMarce = numMarce;
			return this;
		}

		public boolean isCambioAutomatico() {
			return cambioAutomatico;
		}

		public Builder setCambioAutomatico(boolean cambioAutomatico) {
			this.cambioAutomatico = cambioAutomatico;
			return this;
		}

		public Automobile build() {
			Automobile auto = new Automobile();
			auto.setMarca(this.marca);
			auto.modello = this.modello;
			auto.colore = this.colore;
			auto.numMarce = this.numMarce;
			return auto;
		}
	}
}
