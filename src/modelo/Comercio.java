package modelo;

public class Comercio extends Actor {
	private String nombreComercio;
	private long cuit;
	private double costoFijo;
	private double costoPorKm;
	private int diaDescuento;
	private int porcentajeDescuentoDia;
	private int porcentajeDescuentoEfectivo;
	private DiaRetiro lstDiaRetiro;
	private Carrito lstCarrito;

	public Comercio(int id, Contacto contacto, String nombreComercio, long cuit, double costoFijo, double costoPorKm,
			int diaDescuento, int porcentajeDescuentoDia, int porcentajeDescuentoEfectivo, DiaRetiro lstDiaRetiro,
			Carrito lstCarrito) {
		super(id, contacto);
		this.nombreComercio = nombreComercio;
		this.cuit = cuit;
		this.costoFijo = costoFijo;
		this.costoPorKm = costoPorKm;
		this.diaDescuento = diaDescuento;
		this.porcentajeDescuentoDia = porcentajeDescuentoDia;
		this.porcentajeDescuentoEfectivo = porcentajeDescuentoEfectivo;
		this.lstDiaRetiro = lstDiaRetiro;
		this.lstCarrito = lstCarrito;
	}
	
	//Constructor vacio para realizar los testeos.
	public Comercio() {
	}

	public String getNombreComercio() {
		return nombreComercio;
	}

	public long getCuit() {
		return cuit;
	}

	public double getCostoFijo() {
		return costoFijo;
	}

	public double getCostoPorKm() {
		return costoPorKm;
	}

	public int getDiaDescuento() {
		return diaDescuento;
	}

	public int getPorcentajeDescuentoDia() {
		return porcentajeDescuentoDia;
	}

	public int getPorcentajeDescuentoEfectivo() {
		return porcentajeDescuentoEfectivo;
	}

	public DiaRetiro getLstDiaRetiro() {
		return lstDiaRetiro;
	}

	public Carrito getLstCarrito() {
		return lstCarrito;
	}

	public void setNombreComercio(String nombreComercio) {
		this.nombreComercio = nombreComercio;
	}

	public void setCuit(long cuit) {
		this.cuit = cuit;
	}

	public void setCostoFijo(double costoFijo) {
		this.costoFijo = costoFijo;
	}

	public void setCostoPorKm(double costoPorKm) {
		this.costoPorKm = costoPorKm;
	}

	public void setDiaDescuento(int diaDescuento) {
		this.diaDescuento = diaDescuento;
	}

	public void setPorcentajeDescuentoDia(int porcentajeDescuentoDia) {
		this.porcentajeDescuentoDia = porcentajeDescuentoDia;
	}

	public void setPorcentajeDescuentoEfectivo(int porcentajeDescuentoEfectivo) {
		this.porcentajeDescuentoEfectivo = porcentajeDescuentoEfectivo;
	}

	public void setLstDiaRetiro(DiaRetiro lstDiaRetiro) {
		this.lstDiaRetiro = lstDiaRetiro;
	}

	public void setLstCarrito(Carrito lstCarrito) {
		this.lstCarrito = lstCarrito;
	}
	
	/*
	 * Validar identificador: DNI: el ente nacional para validación de DNI es el
	 * ReNaPer para este TP de laboratorio solo validar que el ingreso sea numérico.
	 * CUIT: según el Algoritmo: verifica un CUIT de la Guía 6 (Métodos Estáticos y
	 * Excepciones)
	 * 1) # validarIdentificadorUnico():boolean //valida DNI o CUIT según la sub-clase	 
	 * */

	public int validarIdentificadorUnico(String cuil) {
		//boolean cond = false;
		int z;
		int num1 = Character.getNumericValue(cuil.charAt(0)); // x
		int num2 = Character.getNumericValue(cuil.charAt(1)); // y
		int num3 = Character.getNumericValue(cuil.charAt(2));
		int num4 = Character.getNumericValue(cuil.charAt(3));
		int num5 = Character.getNumericValue(cuil.charAt(4));
		int num6 = Character.getNumericValue(cuil.charAt(5));
		int num7 = Character.getNumericValue(cuil.charAt(6));
		int num8 = Character.getNumericValue(cuil.charAt(7));
		int num9 = Character.getNumericValue(cuil.charAt(8));
		int num10 = Character.getNumericValue(cuil.charAt(9));

		int subTotal = num1 * 5 + num2 * 4 + num3 * 3 + num4 * 2 + num5 * 7 + num6 * 6 + num7 * 5 + num8 * 4 + num9 * 3
				+ num10 * 2;
		int total = (subTotal % 11);
		if ((total) % 11 == 0) {
			z = 0;
			//cond = true;
		} else {
			z = (11 - total);
		}
		return z;
	}
	

}
