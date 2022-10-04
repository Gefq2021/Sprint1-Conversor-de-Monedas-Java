package Principal;

import javax.swing.JOptionPane;

import ConversorMonedas.OpcionesDeConversion;
import ConversorTemperaturas.OpcionesDeConversionDeTemperaturas;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OpcionesDeConversion conversion = new OpcionesDeConversion();
		OpcionesDeConversionDeTemperaturas convertirTemperatura = new OpcionesDeConversionDeTemperaturas();
		
		while (true)  {
			String opciones = JOptionPane.showInputDialog(null, "Selecciones una Opción de Conversión", "Menu", JOptionPane.PLAIN_MESSAGE, null, 
					new Object[] {"Conversor de Monedas", "Conversor de Temperaturas"}, "Elegir").toString();
			
			switch (opciones) {
			case "Conversor de Monedas": {
				String input = JOptionPane.showInputDialog(null, "Ingrese un valor");
				double valor = Double.parseDouble(input);
				conversion.convertirMonedas(valor);
				break;
				
			}
			case "Conversor de Temperaturas": {
				String input = JOptionPane.showInputDialog(null, "Ingrese Temperatura");
				double temperatura = Double.parseDouble(input);
				convertirTemperatura.convertirTemperaturas(temperatura);
				break;
				
			}
			
			}
		}
		

	}

}
