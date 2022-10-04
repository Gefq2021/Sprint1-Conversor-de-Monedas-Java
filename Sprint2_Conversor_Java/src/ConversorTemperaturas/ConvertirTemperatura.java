package ConversorTemperaturas;

import javax.swing.JOptionPane;

public class ConvertirTemperatura {
	
	public void CelciusAFahrenheit(double temperatura) {
		double temperaturFahrenheit = (9 / 5) * temperatura + 32;
		temperaturFahrenheit = (double) Math.round(temperaturFahrenheit * 100d) / 100;
		JOptionPane.showMessageDialog(null, temperatura + " Celcius = " + temperaturFahrenheit + " Fahrenheit.");
	}
	
	public void CelciusAKelvin(double temperatura) {
		double temperaturFahrenheit = temperatura + 273.15;
		temperaturFahrenheit = (double) Math.round(temperaturFahrenheit * 100d) / 100;
		JOptionPane.showMessageDialog(null, temperatura + " Celcius = " + temperaturFahrenheit + " Kelvin.");
	}
	
	public void FahrenheitAKelvin(double temperatura) {
		double temperaturFahrenheit = (9 / 5) * (temperatura - 32) + 273.15;
		temperaturFahrenheit = (double) Math.round(temperaturFahrenheit * 100d) / 100;
		JOptionPane.showMessageDialog(null, temperatura + " Fahrenheit = " + temperaturFahrenheit + " Kelvin.");
	}
	
	public void FahrenheitACelcius(double temperatura) {
		double temperaturFahrenheit = (9 / 5) * (temperatura - 32);
		temperaturFahrenheit = (double) Math.round(temperaturFahrenheit * 100d) / 100;
		JOptionPane.showMessageDialog(null, temperatura + " Fahrenheit = " + temperaturFahrenheit + " Celcius.");
	}
	
	public void KelvinACelcius(double temperatura) {
		double temperaturFahrenheit = temperatura - 273.15;
		temperaturFahrenheit = (double) Math.round(temperaturFahrenheit * 100d) / 100;
		JOptionPane.showMessageDialog(null, temperatura + " Kelvin = " + temperaturFahrenheit + " Celcius.");
	}
	
	public void KelvinAFahrenheit(double temperatura) {
		double temperaturFahrenheit = (9 / 5) * ( temperatura - 273.15) + 32;
		temperaturFahrenheit = (double) Math.round(temperaturFahrenheit * 100d) / 100;
		JOptionPane.showMessageDialog(null, temperatura + " Kelvin = " + temperaturFahrenheit + " Fahrenheit.");
	}
}
