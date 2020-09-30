package modelo;

public class Actor {
	private int id;
	protected Contacto contacto;

	public Actor(int id, Contacto contacto) {
		super();
		this.id = id;
		this.contacto = contacto;
	}

	public Actor() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public Contacto getContacto() {
		return contacto;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}

	public String toString() {
		return "Actor id: " + id + ", contacto: " + contacto;
	}
}
