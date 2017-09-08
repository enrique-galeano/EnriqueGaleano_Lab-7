/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author enriquejosegaleanotalavera
 */
public class Lugar {

	private String lugar;
	private String clima;
	private int extensionTerritorial;
	private int cantidadHabitantes;
	private String tipo;
	private String anoFundacion;

	public Lugar() {
	}

	public Lugar(String lugar, String clima, int extensionTerritorial, int cantidadHabitantes, String tipo, String anoFundacion) {
		this.lugar = lugar;
		this.clima = clima;
		this.extensionTerritorial = extensionTerritorial;
		this.cantidadHabitantes = cantidadHabitantes;
		this.tipo = tipo;
		this.anoFundacion = anoFundacion;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getClima() {
		return clima;
	}

	public void setClima(String clima) {
		this.clima = clima;
	}

	public int getExtensionTerritorial() {
		return extensionTerritorial;
	}

	public void setExtensionTerritorial(int extensionTerritorial) {
		this.extensionTerritorial = extensionTerritorial;
	}

	public int getCantidadHabitantes() {
		return cantidadHabitantes;
	}

	public void setCantidadHabitantes(int cantidadHabitantes) {
		this.cantidadHabitantes = cantidadHabitantes;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getAnoFundacion() {
		return anoFundacion;
	}

	public void setAnoFundacion(String anoFundacion) {
		this.anoFundacion = anoFundacion;
	}

}
