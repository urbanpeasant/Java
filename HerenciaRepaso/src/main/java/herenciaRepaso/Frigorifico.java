package herenciaRepaso;

public class Frigorifico extends Electrodomestico {

	// atributo implementado por la clase frigorifioc

	public int temperatura;

	// constructor y constructor copia
	public Frigorifico(String marca, String modelo, int consumo, int temperatura) {
		super(marca, modelo, consumo);

		this.temperatura = temperatura;
	}

	public Frigorifico(Frigorifico f) {
		super(f.marca, f.modelo, f.consumo);
		this.temperatura = f.temperatura;

	}

	// Métdoso set y get

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getConsumo() {
		return consumo;
	}

	public int getTemperatura() {
		return temperatura;
	}

	// métodos equals, clone y tostring

	@Override
	public boolean equals(Object obj) {
		Frigorifico dispositivo = (Frigorifico) obj;
		if (this == dispositivo)
			return true;
		else {
			if (this.marca == dispositivo.marca && this.modelo == dispositivo.modelo
					&& this.consumo == dispositivo.consumo && this.temperatura == dispositivo.temperatura)
				return true;
			return false;
		}
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return new Frigorifico(this.marca, this.modelo, this.consumo, this.temperatura);
	}

	@Override
	public String toString() {
		return "La marca es = " + marca + " " + ", el modelo = " + modelo + " " + ", el consumo = " + consumo + " " + "y la temperatura = "
				+ temperatura;
	}
}