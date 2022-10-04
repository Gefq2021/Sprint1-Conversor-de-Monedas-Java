package ConversorMonedas;

import javax.swing.JOptionPane;

public class OpcionesDeConversion {
ConvertirMonedas monedas = new ConvertirMonedas();
	
	String[] divisa = {"Dolar", "Euros", "Libras", "Yuan", "Won SurCoreano"};
	double[] cambio = {148.20, 146.82, 168.33, 1.02, 0.10}; // Agregamos el tipo de cambio de cada divisa.
	
	public void convertirMonedas(double valor) {
		String opcion = JOptionPane.showInputDialog(null, "Selecciones una Opción de Conversión", "Menu", JOptionPane.PLAIN_MESSAGE, null, 
				new Object[] {"De Pesos a Dolar", "De Pesos a Euros", "De Pesos a Libras", "De Pesos a Yen", "De Pesos a Won Coreano", "De Dolar a Pesos", "De Euros a Pesos", "De Libras a Pesos", "De Yen a Pesos", "De Won Coreano a Pesos"}, "Elegir").toString();
		
		switch (opcion) {
		case "De Pesos a Dolar": {
			monedas.ConversionDirectaDePesos(valor, cambio[0], divisa[0]);
			break;
		}
		case "De Pesos a Euros": {
			monedas.ConversionDirectaDePesos(valor, cambio[1], divisa[1]);
			break;
		}
		case "De Pesos a Libras": {
			monedas.ConversionDirectaDePesos(valor, cambio[2], divisa[2]);
			break;
		}
		case "De Pesos a Yen": {
			monedas.ConversionDirectaDePesos(valor, cambio[3], divisa[3]);
			break;
		}
		case "De Pesos a Won Coreano": {
			monedas.ConversionDirectaDePesos(valor, cambio[4], divisa[4]);
			break;
		}
		case "De Dolar a Pesos": {
			monedas.ConversionIndirectaDePesos(valor, cambio[0], divisa[0]);
			break;
		}
		case "De Euros a Pesos": {
			monedas.ConversionIndirectaDePesos(valor, cambio[1], divisa[1]);
			break;
		}
		case "De Libras a Pesos": {
			monedas.ConversionIndirectaDePesos(valor, cambio[2], divisa[2]);
			break;
		}
		case "De Yen a Pesos": {
			monedas.ConversionIndirectaDePesos(valor, cambio[3], divisa[3]);
			break;
		}
		case "De Won Coreano a Pesos": {
			monedas.ConversionIndirectaDePesos(valor, cambio[4], divisa[4]);
			break;
		}
		
		
		}
		
	}
}
