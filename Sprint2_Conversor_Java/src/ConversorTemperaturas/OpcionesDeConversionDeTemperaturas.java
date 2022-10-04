package ConversorTemperaturas;

import javax.swing.JOptionPane;

public class OpcionesDeConversionDeTemperaturas {
	
ConvertirTemperatura temperaturaConvertida = new ConvertirTemperatura();
	
	public void convertirTemperaturas(double Temperatura) {
		String opcion = JOptionPane.showInputDialog(null, "Selecciones una Opción de Conversión", "Menu", JOptionPane.PLAIN_MESSAGE, null, 
				new Object[] {"De Celcius a Fahrenheit", "De Celcius a Kelvin", "De Fahrenheit a Kelvin", "De Fahrenheit a Celcius", "De Kelvin a Celcius", "De Kelvin a Fahrenheit"}, "Elegir").toString();
		
		switch (opcion) {
		case "De Celcius a Fahrenheit": {
			temperaturaConvertida.CelciusAFahrenheit(Temperatura);
			break;
		}
		case "De Celcius a Kelvin": {
			temperaturaConvertida.CelciusAKelvin(Temperatura);
			break;
		}
		case "De Fahrenheit a Kelvin": {
			temperaturaConvertida.FahrenheitAKelvin(Temperatura);
			break;
		}
		case "De Fahrenheit a Celcius": {
			temperaturaConvertida.FahrenheitACelcius(Temperatura);
			break;
		}
		case "De Kelvin a Celcius": {
			temperaturaConvertida.KelvinACelcius(Temperatura);
			break;
		}
		case "De Kelvin a Fahrenheit": {
			temperaturaConvertida.KelvinAFahrenheit(Temperatura);
			break;
		}
		
		
		}
		
	}
}
