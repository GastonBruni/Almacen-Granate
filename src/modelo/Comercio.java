package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Comercio extends Actor {
	private String nombreComercio;
	private long cuit;
	private double costoFijo;
	private double costoPorKm;
	private int diaDescuento;
	private int porcentajeDescuentoDia;
	private int porcentajeDescuentoEfectivo;
	private List<DiaRetiro> lstDiaRetiro;
	private List<Carrito> lstCarrito;
	private List<Articulo> lstArticulos;

	public Comercio(int id, Contacto contacto, String nombreComercio, long cuit, double costoFijo, double costoPorKm,
			int diaDescuento, int porcentajeDescuentoDia, int porcentajeDescuentoEfectivo, DiaRetiro lstDiaRetiro,
			Carrito lstCarrito, Articulo lstArticulos) {
		super(id, contacto);
		this.nombreComercio = nombreComercio;
		this.cuit = cuit;
		this.costoFijo = costoFijo;
		this.costoPorKm = costoPorKm;
		this.diaDescuento = diaDescuento;
		this.porcentajeDescuentoDia = porcentajeDescuentoDia;
		this.porcentajeDescuentoEfectivo = porcentajeDescuentoEfectivo;
		this.lstDiaRetiro= new ArrayList<DiaRetiro>();
		this.lstCarrito=new ArrayList<Carrito>();
		this.lstArticulos=new ArrayList<Articulo>();

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

	public void setCuit(long cuit) {
		this.cuit = cuit;
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

	public List<DiaRetiro> getLstDiaRetiro() {
		return lstDiaRetiro;
	}

	public List<Carrito> getLstCarrito() {
		return lstCarrito;
	}

	public void setNombreComercio(String nombreComercio) {
		this.nombreComercio = nombreComercio;
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

	public void setLstDiaRetiro(List<DiaRetiro> lstDiaRetiro) {
		this.lstDiaRetiro = lstDiaRetiro;
	}

	public void setLstCarrito(List<Carrito> lstCarrito) {
		this.lstCarrito = lstCarrito;
	}
	
	// 1) # validarIdentificadorUnico():boolean //valida CUIT	 
	
	// Agregar XY -> Hombre 20 || Mujer 27 || Ambos 23 || Empresas 30
	public boolean validarIdentificadorUnico(String cuit) throws Exception {
		boolean cond = false;
		int aux;
		int num1 = Character.getNumericValue(cuit.charAt(0)); // x
		int num2 = Character.getNumericValue(cuit.charAt(1)); // y
		int num3 = Character.getNumericValue(cuit.charAt(2));
		int num4 = Character.getNumericValue(cuit.charAt(3));
		int num5 = Character.getNumericValue(cuit.charAt(4));
		int num6 = Character.getNumericValue(cuit.charAt(5));
		int num7 = Character.getNumericValue(cuit.charAt(6));
		int num8 = Character.getNumericValue(cuit.charAt(7));
		int num9 = Character.getNumericValue(cuit.charAt(8));
		int num10 = Character.getNumericValue(cuit.charAt(9));

		int subTotal = num1 * 5 + num2 * 4 + num3 * 3 + num4 * 2 + num5 * 7 + num6 * 6 + num7 * 5 + num8 * 4 + num9 * 3
				+ num10 * 2;
		int total = (subTotal % 11);

		if (total != 0 && cuit.length() == 10) {
			aux = (11 - total);
			cond = true;
		} else {

			throw new Exception("Error: Cuit ingresado no es valido");

		}
		return cond;
	}
	
	
	// 2) + traerHoraRetiro (LocalDate fecha): LocalTime
	public LocalTime traerHoraRetiro(/*LocalDate fecha*/) {
		LocalTime localTime = LocalTime.now();
		
		return localTime;
	}
	
	public List<Carrito> traerCarrito() {
		return this.lstCarrito;
	}
		
	//Agregar al carrito
	//Cuando el cliente agrega al carrito un artículo y cantidad se debe verificar si existe un objeto
	//ItemCarrito para ese artículo, en caso que existe se incrementa la cantidad de lo contrario se crea
	//y se agrega a la lista.
	// 8) + agregar(Articulo articulo, int cantidad):boolean
	/*public boolean agregar(String nombre, String codBarras, float precio,int cantidad) {
		int idCarrito=1;
		if(!lstCarrito.isEmpty()) {
			idCarrito=lstCarrito.get(lstCarrito.size() -1).getId() +1;
			
		}
		
		int idArticulo=1;
		if(!lstArticulos.isEmpty()) {
			idArticulo=lstArticulos.get(lstArticulos.size() -1).getId() +1;
			
		}
		Articulo aux = new Articulo(idArticulo, nombre, codBarras, precio);
		this.lstArticulos.add(aux);
		return lstCarrito.add(new Carrito(idCarrito,aux,cantidad));
		
	}*/
}

