package test;

import java.time.LocalDate;
import java.time.LocalTime;

import modelo.*;

public class testModelo {

	public static void main(String[] args) throws Exception {

		Ubicacion walmart = new Ubicacion(2.5, 1.7);
		Contacto contacto = new Contacto("walmart@super.com", "1138883572", walmart);
		Comercio comercio = new Comercio(1, contacto, "Wallmart", 2040321237, 500, 125, 2, 15, 25);
		Cliente cliente = new Cliente();
		Envio envio = new Envio();

		System.out.println("Validamos dni y cuit: ");
		System.out.println("Digito Verificador: " + comercio.validarIdentificadorUnico(2041354026l));
		System.out.println("Verificador de Dni: " + cliente.validarDni(41354026));

		System.out.println(" ");
		System.out.println("se ingresan cuit y dni incorrectos");
		try {
			contacto = new Contacto("dia@hotmail.com", "1111111", null);
			comercio = new Comercio(0, contacto, "dia", 3852l, 25.00, 50, 10, 26, 10);
			cliente = new Cliente(1, null, "rojas", "juan", 12l);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

		System.out.println("-------------------------------");
		System.out.println("Se agregan productos iguales a la lista:");
		try {
			comercio = new Comercio(0, null, "dia", 38526642l, 25.00, 50, 10, 26, 10);
			comercio.agregarArticulo("Salsa de tomate", "7281938294331", 75d);
			comercio.agregarArticulo("Salsa de tomate", "7281938294331", 75d);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("------------------------------------");
		try {
			comercio = new Comercio(0, null, "dia", 38526642l, 25.00, 50, 10, 26, 10);
			cliente = new Cliente(1, null, "juan", "rojas", 150050l);
			comercio.agregarArticulo("Leche Serenisima", "7287623294334", 45d);
			comercio.agregarArticulo("Salsa de tomate", "7281938294331", 75d);
			comercio.agregarArticulo("Rollo de cocina", "7928018294333", 30d);
			comercio.agregarArticulo("Azucar", "7281821343332", 40d);
			comercio.agregarArticulo("Mermelada", "7281544562334", 60d);

			System.out.println("Traemos los articulos por codigo de barras: ");
			System.out.print(comercio.traerArticulo("7287623294334"));
			System.out.print(comercio.traerArticulo("7281938294331"));
			System.out.print(comercio.traerArticulo("7928018294333"));
			System.out.print(comercio.traerArticulo("7281821343332"));
			System.out.print(comercio.traerArticulo("7281938294331"));
			System.out.println(comercio.traerArticulo("7281544562334"));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

		System.out.println("");
		System.out.println("-------------------------------");
		System.out.println("Agregamos cliente y lo traemos por dni");
		try {
			comercio.agregarCliente(contacto, "Alfonso", "Gabriel", 41365026);
			// Si se lo agrega de vuelta devuelve una exeption
			// comercio.agregarCliente(contacto, "Alfonso", "Gabriel", 41365026);
			System.out.println(comercio.traerCliente(41365026));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println("");
		System.out.println("-------------------------------");

		try {
			//En esta instancia agregarCarrito la lista la devuelve vacia ya que no se le cargaron items al mismo!!!
			comercio.agregarCarrito(LocalDate.of(2020, 10, 2), LocalTime.of(4, 45), false, 15,comercio.traerCliente(41365026), null);
			System.out.println(comercio.traerUltimoCarrito(comercio.traerCliente(41365026)));
			//comercio.agregarCarrito(LocalDate.of(2020, 10, 2), LocalTime.now(), false, 0.00, comercio.traerCliente(41365026),null);
			Carrito carrito= comercio.traerUltimoCarrito(comercio.traerCliente(41365026));
			System.out.println("");
			System.out.println("-------------------------------");
			System.out.println("Agregamos articulos al carrito: ");
			System.out.println("");
			carrito.agregar(comercio.traerArticulo("7287623294334"), 7);
			carrito.agregar(comercio.traerArticulo("7281938294331"), 5);
			carrito.agregar(comercio.traerArticulo("7281821343332"), 2);
			System.out.println(carrito.traerItemCarrito());
			
			System.out.println("-------------------------------");
			System.out.println("Sacamos articulos del carrito: ");
			
			carrito.sacarDelCarrito(comercio.traerArticulo("7287623294334"), 2);
			carrito.sacarDelCarrito(comercio.traerArticulo("7287623294334"), 1);
			//Este carrito no lo va a mostrar ya que quedo vacio!!
			carrito.sacarDelCarrito(comercio.traerArticulo("7287623294334"), 2);
			System.out.println(carrito.traerItemCarrito());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println(" ");

		Ubicacion miCasita = new Ubicacion(3.8, 1.3);
		System.out.println(miCasita.traerUbicacion());

		System.out.println(" ");

		envio.distanciaCoord(14, 4, 21, 7);

		envio.setCosto(miCasita, 154d, 200);

		// Devuelvo el costo de setCosto
		System.out.println("Costo del envio: " + envio.getCosto());

	}

}
