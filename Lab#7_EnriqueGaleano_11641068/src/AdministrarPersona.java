
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enriquejosegaleanotalavera
 */
public class AdministrarPersona implements Serializable {

	private ArrayList<Personas> p = new ArrayList();
	private File pathLocation = null;

	public AdministrarPersona(String path) {
		pathLocation = new File(path);
	}

	public ArrayList<Personas> getP() {
		return p;
	}

	public void setP(ArrayList<Personas> p) {
		this.p = p;
	}

	public File getPathLocation() {
		return pathLocation;
	}

	public void setPathLocation(File pathLocation) {
		this.pathLocation = pathLocation;
	}

	public void cargarArchivo() {
		try {
			p = new ArrayList();
			Personas temp;
			if (pathLocation.exists()) {
				FileInputStream entrada = new FileInputStream(pathLocation);
				ObjectInputStream objeto = new ObjectInputStream(entrada);
				try {
					while ((temp = (Personas) objeto.readObject()) != null) {
						p.add(temp);
					}
				} catch (EOFException e) {
				}
				objeto.close();
				entrada.close();
			}//End if
		} catch (Exception e) {
		}
	}

	public void escribirArchivo() {
		FileOutputStream fw = null;
		ObjectOutputStream bw = null;
		try {
			fw = new FileOutputStream(pathLocation);
			bw = new ObjectOutputStream(fw);
			for (Personas t : p) {
				bw.writeObject(t);
			}
			bw.flush();
		} catch (Exception e) {

		} finally {
			try {
				bw.close();
				fw.close();
			} catch (Exception e) {
			}
		}
	}
}
