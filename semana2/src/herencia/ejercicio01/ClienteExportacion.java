package herencia.ejercicio01;

public class ClienteExportacion extends Cliente {
	private String vat;
	public ClienteExportacion() {
		super();
	}
	public ClienteExportacion(String nomb,String dir, String mail, String vat) {
		super();
		this.vat= vat;
		super.setNombre(nomb);
		super.setDireccion(dir);
		super.setCorreoElectronico(mail);
	}

}
