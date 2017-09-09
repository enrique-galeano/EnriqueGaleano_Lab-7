
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enriquejosegaleanotalavera
 */
public class Lugar extends Thread {

	private String lugar;
	private String clima;
	private int extensionTerritorial;
	private int cantidadHabitantes;
	private String tipo;
	private String anoFundacion;
	private JFrame frame;
	private ArrayList<Personas> person = new ArrayList();
	Lista JFrameLista = new Lista();

	public Lugar() {
	}

	public Lugar(String lugar, String clima, int extensionTerritorial, int cantidadHabitantes, String tipo, String anoFundacion, JFrame frame, ArrayList Pers) {

		this.lugar = lugar;
		this.clima = clima;
		this.extensionTerritorial = extensionTerritorial;
		this.cantidadHabitantes = cantidadHabitantes;
		this.tipo = tipo;
		this.anoFundacion = anoFundacion;
		this.frame = frame;
		person = Pers;

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
	public void run() {

		JFrameLista.setVisible(true);
		JFrameLista.pack();
		JFrameLista.setLocationRelativeTo(JFrameLista);
		System.out.println("LUGAR: " + lugar);
		JFrameLista.jLabel2.setText(lugar);
		//Aqui se agrega a la lista
		while (true) {
			DefaultTableModel modelo = (DefaultTableModel) JFrameLista.tablaLugares.getModel();
			for (int i = 0; i < person.size()-1; i++) {
				if (JFrameLista.jLabel2.getText().equals(person.get(i).getLugar())) {
					Personas p = person.get(i);
					Object[] rows = {p.getNombre(), p.getId(), p.getLugar(), p.getEdad(), p.getEstatura(), p.getProfesion()};
					modelo.addRow(rows);
					JFrameLista.tablaLugares.setModel(modelo);
					person.remove(person.get(i));
				}

			}
			try {
				Thread.sleep(20000);
			} catch (Exception e) {
			}

		}
	}
}
