package br.com.fiap.patterns.model;

import java.util.Observable;

import br.com.fiap.patterns.config.ConfigSingleton;

@SuppressWarnings("deprecation")
public class Pis extends Observable implements Imposto {

	private float aliquota;
	private float valorPis;

	public Pis() {
		aliquota = Float.parseFloat(ConfigSingleton.getInstance().getProperty("aliquota"));
	}

	public void calcularImposto(float valor) {
		setChanged();
		valorPis = valor * aliquota;
		notifyObservers(valorPis);
	}

	public float getAliquota() {
		return aliquota;
	}

	public void setAliquota(float aliquota) {
		this.aliquota = aliquota;
	}

	public float getValorPis() {
		return valorPis;
	}

}
