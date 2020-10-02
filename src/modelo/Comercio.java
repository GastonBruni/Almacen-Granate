package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Comercio extends Actor {

	private String nombreComercio;
	private long cuit;
	private double costoFijo;
	private double costoPorKm;
	private int diaDescuento;
	private int porcentajeDecuentoDia;
	private int porcentajeDecuentoEfectivo;
	private List<DiaRetiro> ltsDiaRetiro;
	private List<Articulo> ltsArticulo;
	private List<Carrito> ltsCarrito;

	public Comercio(int id, Contacto contacto, String nombreComercio, long cuit, double costoFijo, double costoPorKm,
			int diaDescuento, int porcentajeDecuentoDia, int porcentajeDecuentoEfectivo) throws Exception {
		super(id, contacto);
		this.nombreComercio = nombreComercio;
		this.setCuit(cuit);
		this.costoFijo = costoFijo;
		this.costoPorKm = costoPorKm;
		this.diaDescuento = diaDescuento;
		this.porcentajeDecuentoDia = porcentajeDecuentoDia;
		this.porcentajeDecuentoEfectivo = porcentajeDecuentoEfectivo;
		this.ltsDiaRetiro = new ArrayList<DiaRetiro>();
		this.ltsArticulo = new ArrayList<Articulo>();
		this.ltsCarrito = new ArrayList<Carrito>();
	}

	public String getNombreComercio() {
		return nombreComercio;
	}

	public void setNombreComercio(String nombreComercio) {
		this.nombreComercio = nombreComercio;
	}

	public long getCuit() {
		return cuit;
	}

	public void setCuit(long cuit) throws Exception {
		if (!this.validarIdentificadorUnico(cuit)) {
			throw new Exception("Error: Cuit ingresado no es valido");
		} else {
			this.cuit = cuit;
		}

	}

	public double getCostoFijo() {
		return costoFijo;
	}

	public void setCostoFijo(double costoFijo) {
		this.costoFijo = costoFijo;
	}

	public double getCostoPorKm() {
		return costoPorKm;
	}

	public void setCostoPorKm(double costoPorKm) {
		this.costoPorKm = costoPorKm;
	}

	public int getDiaDescuento() {
		return diaDescuento;
	}

	public void setDiaDescuento(int diaDescuento) {
		this.diaDescuento = diaDescuento;
	}

	public int getPorcentajeDecuentoDia() {
		return porcentajeDecuentoDia;
	}

	public void setPorcentajeDecuentoDia(int porcentajeDecuentoDia) {
		this.porcentajeDecuentoDia = porcentajeDecuentoDia;
	}

	public int getPorcentajeDecuentoEfectivo() {
		return porcentajeDecuentoEfectivo;
	}

	public void setPorcentajeDecuentoEfectivo(int porcentajeDecuentoEfectivo) {
		this.porcentajeDecuentoEfectivo = porcentajeDecuentoEfectivo;
	}

	public List<DiaRetiro> getLtsDiaRetiro() {
		return ltsDiaRetiro;
	}

	public void setLtsDiaRetiro(List<DiaRetiro> ltsDiaRetiro) {
		this.ltsDiaRetiro = ltsDiaRetiro;
	}

	public List<Articulo> getLtsArticulo() {
		return ltsArticulo;
	}

	public void setLtsArticulo(List<Articulo> ltsArticulo) {
		this.ltsArticulo = ltsArticulo;
	}

	public List<Carrito> getLtsCarrito() {
		return ltsCarrito;
	}

	public void setLtsCarrito(List<Carrito> ltsCarrito) {
		this.ltsCarrito = ltsCarrito;
	}

	
	public boolean validarIdentificadorUnico(long identificador) {
		boolean cond = false;
		if (identificador >= 11111111l && identificador <= 9999999999l) {
			cond = true;
		}
		return cond;
	}

	
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(costoFijo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(costoPorKm);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (int) (cuit ^ (cuit >>> 32));
		result = prime * result + diaDescuento;
		result = prime * result + ((ltsArticulo == null) ? 0 : ltsArticulo.hashCode());
		result = prime * result + ((ltsCarrito == null) ? 0 : ltsCarrito.hashCode());
		result = prime * result + ((ltsDiaRetiro == null) ? 0 : ltsDiaRetiro.hashCode());
		result = prime * result + ((nombreComercio == null) ? 0 : nombreComercio.hashCode());
		result = prime * result + porcentajeDecuentoDia;
		result = prime * result + porcentajeDecuentoEfectivo;
		return result;
	}

	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comercio other = (Comercio) obj;
		if (Double.doubleToLongBits(costoFijo) != Double.doubleToLongBits(other.costoFijo))
			return false;
		if (Double.doubleToLongBits(costoPorKm) != Double.doubleToLongBits(other.costoPorKm))
			return false;
		if (cuit != other.cuit)
			return false;
		if (diaDescuento != other.diaDescuento)
			return false;
		if (ltsArticulo == null) {
			if (other.ltsArticulo != null)
				return false;
		} else if (!ltsArticulo.equals(other.ltsArticulo))
			return false;
		if (ltsCarrito == null) {
			if (other.ltsCarrito != null)
				return false;
		} else if (!ltsCarrito.equals(other.ltsCarrito))
			return false;
		if (ltsDiaRetiro == null) {
			if (other.ltsDiaRetiro != null)
				return false;
		} else if (!ltsDiaRetiro.equals(other.ltsDiaRetiro))
			return false;
		if (nombreComercio == null) {
			if (other.nombreComercio != null)
				return false;
		} else if (!nombreComercio.equals(other.nombreComercio))
			return false;
		if (porcentajeDecuentoDia != other.porcentajeDecuentoDia)
			return false;
		if (porcentajeDecuentoEfectivo != other.porcentajeDecuentoEfectivo)
			return false;
		return true;
	}

	public boolean agregarDiaRetiro(int diaSemana, LocalTime horaDesde, LocalTime horaHasta, int intervalo) {

		int idDiaRetiro = 1;
		if (!ltsDiaRetiro.isEmpty()) {
			idDiaRetiro = ltsDiaRetiro.get(ltsDiaRetiro.size() - 1).getId() + 1;
		}
		return ltsDiaRetiro.add(new DiaRetiro(idDiaRetiro, diaSemana, horaDesde, horaHasta, intervalo));
	}

	public List<LocalTime> traerHoraRetiro(LocalDate fecha) {
		List<LocalTime> hora = new ArrayList<LocalTime>();

		for (DiaRetiro p : ltsDiaRetiro) {
			if (p.getDiaSemana() == fecha.getDayOfWeek().getValue()) {
				hora.add(p.getHoraDesde());
			}
		}
		return hora;
	}

	public List<Turno> traerTurnosOcupados(LocalDate fecha) {
		List<Turno> turno = new ArrayList<Turno>();
		List<LocalTime> hora = this.traerHoraRetiro(fecha);
		for (LocalTime p : hora) {
			turno.add(new Turno(fecha, p, true));
		}
		return turno;
	}

	public boolean agregarArticulo(String nombre, String codBarras, double precio) throws Exception {
		if (traerArticulo(codBarras) == null) {
			int id = 1;
			if (!ltsArticulo.isEmpty()) {
				id = ltsArticulo.get(ltsArticulo.size() - 1).getId() + 1;
			}
			return ltsArticulo.add(new Articulo(id, nombre, codBarras, precio));
		} else {
			throw new Exception("el producto ya existe en la lista");
		}
	}

	public Articulo traerArticulo(String codBarras) {
		Articulo articulo = null;
		int contador = 0;
		while (contador < this.ltsArticulo.size() && articulo == null) {
			if (this.ltsArticulo.get(contador).getCodBarras().equals(codBarras)) {
				articulo = this.ltsArticulo.get(contador);
			} else {
				contador++;
			}
		}
		return articulo;
	}

	public boolean agregarCarrito(LocalDate fecha, LocalTime hora, boolean cerrado, double descuento, Cliente cliente,Entrega entrega)throws Exception{
		Carrito carrito=traerUltimoCarrito(cliente);
		if(carrito==null || carrito.isCerrado()==true) {
				
		int idCarrito = 1;
		if (!ltsCarrito.isEmpty()) {
			idCarrito = ltsCarrito.get(ltsCarrito.size() - 1).getId() + 1;
		}
		return ltsCarrito.add(new Carrito(idCarrito, fecha, hora, cerrado, descuento, cliente, entrega));
		}
		else {
			throw new Exception("Tiene un carrito abierto");
			
		}
	}

	public List<Carrito> traerCarrito(Cliente cliente) {

		List<Carrito> ltsCarrito = new ArrayList<Carrito>();
		for (Carrito p : this.ltsCarrito) {
			if (p.getCliente().equals(cliente)) {
				ltsCarrito.add(p);
			}
		}
		return ltsCarrito;
	}

	public Carrito traerUltimoCarrito(Cliente cliente) {
		Carrito carrito = null;
		List<Carrito> ltsCarrito = traerCarrito(cliente);
		if (ltsCarrito.isEmpty() == false) {
			carrito = ltsCarrito.get(ltsCarrito.size() - 1);

		}
		return carrito;
	}
	
	public List<Carrito> traerCarrito() {
		return ltsCarrito;
	}

}
