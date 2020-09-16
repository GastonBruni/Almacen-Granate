package modelo;

public class Ubicacion {
	private double latitud;
	private double longitud;

	public Ubicacion(double latitud, double longitud) {
		super();
		this.latitud = latitud;
		this.longitud = longitud;
	}

	public double getLatitud() {
		return latitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public Ubicacion traerUbicacion() {
		
		//return new Ubicacion(latitud, longitud);
		//Retorna el objeto donde estoy parado.
		return this; 
	}
	
	@Override
	public String toString() {
		return "Ubicacion: latitud: " + latitud + ", longitud: " + longitud;
	}
}
