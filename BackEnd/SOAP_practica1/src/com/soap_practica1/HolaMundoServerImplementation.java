package com.soap_practica1;

import javax.jws.WebService;
//									paquete
@WebService(endpointInterface="com.soap_practica1.IHolaMundoServer")
public class HolaMundoServerImplementation implements IHolaMundoServer{
	
	public String diHolaMundo() {//implementar el único método de la interfaz
		return "Hola Mundo";
	}

}
