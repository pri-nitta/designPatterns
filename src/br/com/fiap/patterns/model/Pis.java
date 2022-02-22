package br.com.fiap.patterns.model;

import java.util.Observable;

@SuppressWarnings("deprecation")
public class Pis extends Observable implements Imposto {
	
	private float aliquota = 0.6f;
	private float valorPis;
	
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
