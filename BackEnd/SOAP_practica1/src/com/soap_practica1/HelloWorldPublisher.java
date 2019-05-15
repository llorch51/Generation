package com.soap_practica1;

import javax.xml.ws.Endpoint;

public class HelloWorldPublisher {

	public static void main(String[] args) {

		System.out.println("Comenzamos a publicar el servicio HolaMundo");
		Endpoint.publish("http://localhost:9876/HolaMundo", new HolaMundoServerImplementation());
		System.out.println("Se termina de publicar el servicio HolaMundo");
	}

}
