
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author enriquejosegaleanotalavera
 */
public class Lugar extends Thread{

	private String lugar;
	private String clima;
	private int extensionTerritorial;
	private int cantidadHabitantes;
	private String tipo;
	private String anoFundacion; 
	private JFrame frame;
	public Lugar() {
	}

	public Lugar(String lugar, String clima, int extensionTerritorial, int cantidadHabitantes, String tipo, String anoFundacion, JFrame frame) {
		this.lugar = lugar;
		this.clima = clima;
		this.extensionTerritorial = extensionTerritorial;
		this.cantidadHabitantes = cantidadHabitantes;
		this.tipo = tipo;
		this.anoFundacion = anoFundacion;
		this.frame = frame;
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
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
	@Override
	public void run(){
		Lista JFrameLista = new Lista();
		JFrameLista.setVisible(true);
		JFrameLista.pack();
		JFrameLista.setLocationRelativeTo(JFrameLista);
		while (true) {	
			JFrameLista.jt_nombreLugar.setText(lugar);
			
		}
	}
}
