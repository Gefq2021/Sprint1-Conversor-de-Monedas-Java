package ConversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {
	
	public void ConversionDirectaDePesos(double valor, double cambio, String divisa) {
		double moneda = valor / cambio;
		moneda = (double) Math.round(moneda * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tiene $ " + moneda + " " + divisa);
	}
	
	public void ConversionIndirectaDePesos(double valor, double cambio, String divisa) {
		double monedaPesos = valor * cambio;
		monedaPesos = (double) Math.round(monedaPesos * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tiene $ " + monedaPesos + " Pesos.");
	}
}
